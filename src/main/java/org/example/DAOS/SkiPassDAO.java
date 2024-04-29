package org.example.DAOS;

import org.apache.commons.dbcp2.BasicDataSource;
import org.example.models.SkiPass;
import org.example.models.SkiResort;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

public class SkiPassDAO {
    private JdbcTemplate jdbcTemplate;

    public SkiPassDAO(DataSource dataSource) {
    }

    public void skiPassDAO (DataSource dataSource){
        jdbcTemplate = new JdbcTemplate(dataSource);
    }
    public List<SkiPass> getAllSkiPasses(){
        List<SkiPass> skiPass = new ArrayList<>();
        SqlRowSet rowSet = jdbcTemplate.queryForRowSet("SELECT * FROM ski_pass");
        while(rowSet.next()){
            skiPass.add(mapRowToSkiPass(rowSet));
        }
        return skiPass;
    }
    public SkiPass mapRowToSkiPass(SqlRowSet rowSet){
        SkiPass skiPass = new SkiPass();
        skiPass.setPass_id(rowSet.getInt("pass_id"));
        skiPass.setPass_name(rowSet.getString("pass_name"));

        return skiPass;
    }
}
