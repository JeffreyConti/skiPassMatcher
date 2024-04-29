package org.example.DAOS;

import org.example.models.CustomerPass;
import org.springframework.jdbc.CannotGetJdbcConnectionException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;
import java.util.Objects;

public class CustomerPassDAO {
    private JdbcTemplate jdbcTemplate;

    public CustomerPassDAO(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }
    public CustomerPass getCustomerById(int id) {
        CustomerPass customer = null;
        String sql = "SELECT * FROM customer_pass WHERE customer_pass_id = ?";

        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, id);
        if (results.next()) {
            customer = mapRowToCustomerPass(results);
        }
        return customer;
    }
    public CustomerPass createCustomer(CustomerPass customer) {
        CustomerPass newCustomer;
        String sql = "INSERT INTO customer_pass (first_name, last_name, email, phone_number) VALUES (?,?,?,?) RETURNING customer_pass_id;";

        int newCustomerId = jdbcTemplate.queryForObject(sql, int.class, customer.getFirstName(), customer.getLastName(), customer.getEmail(), customer.getPhoneNumber());
        newCustomer = getCustomerById(newCustomerId);
        return newCustomer;
    }
    public CustomerPass updateCustomerPassById(CustomerPass customerPass) {
        CustomerPass updatedPass = null;
        String sql = "UPDATE customer_pass SET first_name = ?, last_name = ?, email = ?, phone_number = ? WHERE customer_pass_id = ?";

       jdbcTemplate.update(sql, customerPass.getFirstName(), customerPass.getLastName(), customerPass.getEmail(), customerPass.getPhoneNumber(), customerPass.getCustomerPassId());

            updatedPass = getCustomerById(customerPass.getCustomerPassId());

        return updatedPass;
    }
    public int deleteCustomerPass(int id){
        String deleteCustomerPassSql = "DELETE FROM customer_pass WHERE customer_pass_id = ?";

        int numOfRows = jdbcTemplate.update(deleteCustomerPassSql, id);
        System.out.println("Your pass has been successfully deleted");

        return numOfRows;
    }
    public CustomerPass mapRowToCustomerPass(SqlRowSet rowSet) {
        CustomerPass customerPass = new CustomerPass();
        customerPass.setCustomerPassId(rowSet.getInt("customer_pass_id"));
        customerPass.setFirstName(rowSet.getString("first_name"));
        customerPass.setLastName(rowSet.getString("last_name"));
        customerPass.setEmail(rowSet.getString("email"));
        customerPass.setPhoneNumber(rowSet.getString("phone_number"));
        return customerPass;
    }
}
