package org.example.DAOS;

import org.example.models.SkiResortPass;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

public class SkiResortPassDAO {
    private JdbcTemplate jdbcTemplate;


    public  SkiResortPassDAO (DataSource dataSource){
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public List<SkiResortPass> getSkiResortsByPassName(String passName) {
        List<SkiResortPass> resorts = new ArrayList<>();
        SqlRowSet rowSet = jdbcTemplate.queryForRowSet("select * from ski_resort_pass join us_ski_resort on us_ski_resort.ski_resort_id = ski_resort_pass.ski_resort_id join ski_pass on ski_pass.pass_id = ski_resort_pass.pass_id where ski_pass.pass_name =?", passName);
        while (rowSet.next()) {
            resorts.add(mapRowToSkiResortPass(rowSet));
        }
        return resorts;
    }
    public SkiResortPass mapRowToSkiResortPass(SqlRowSet rowSet){
        SkiResortPass skiResortPass = new SkiResortPass();
        skiResortPass.setSki_resort_id(rowSet.getInt("ski_resort_id"));
        skiResortPass.setName(rowSet.getString("name"));
        skiResortPass.setState_name(rowSet.getString("state_name"));
        skiResortPass.setRegion(rowSet.getString("region"));

        skiResortPass.setPass_id(rowSet.getInt("pass_id"));
        skiResortPass.setPass_name(rowSet.getString("pass_name"));

        return skiResortPass;
    }
}
