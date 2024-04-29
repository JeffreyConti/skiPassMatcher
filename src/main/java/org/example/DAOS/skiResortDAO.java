package org.example.DAOS;

import org.example.models.SkiResort;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

public class skiResortDAO {
    private JdbcTemplate jdbcTemplate;

    public skiResortDAO(DataSource dataSource){
        jdbcTemplate = new JdbcTemplate(dataSource);
    }
    public List<SkiResort> getSkiResortsByStateName(String stateName) {
        List<SkiResort> resorts = new ArrayList<>();
        SqlRowSet rowSet = jdbcTemplate.queryForRowSet("SELECT * FROM us_ski_resort JOIN ski_resort_pass on ski_resort_pass.ski_resort_id = us_ski_resort.ski_resort_id JOIN ski_pass on ski_pass.pass_id = ski_resort_pass.pass_id WHERE state_name = ? ", stateName);
            while (rowSet.next()) {
            resorts.add(mapRowToSkiResort(rowSet));
        }
        return resorts;
    }
    public List<SkiResort> getSkiResortByRegion (String region){
        List<SkiResort> resorts = new ArrayList<>();
        SqlRowSet rowSet = jdbcTemplate.queryForRowSet("SELECT * from us_ski_resort WHERE region = ?", region);
            while(rowSet.next()){
            resorts.add(mapRowToSkiResort(rowSet));
        }
        return resorts;
    }
    public int getNumberOfSkiResortsByStateName(String stateName){
        SqlRowSet rowSet = jdbcTemplate.queryForRowSet("SELECT count(name) FROM us_ski_resort WHERE state_name = ? GROUP BY state_name", stateName);
        if(rowSet.next()){
            return rowSet.getInt(0);
        }
        return 0;
    }

    public int getNumberOfSkiResortsByRegion(String region){
        SqlRowSet rowSet = jdbcTemplate.queryForRowSet("SELECT count(name) FROM us_ski_resort WHERE region = ? GROUP BY region", region);
        if(rowSet.next()){
            return rowSet.getInt(0);
        }
        return 0;
    }

    public List<SkiResort> getAllSkiResorts() {
        List<SkiResort> resorts = new ArrayList<>();
        String sql = "SELECT * FROM us_ski_resort";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
        while (results.next()) {
            SkiResort resort = mapRowToSkiResort(results);
            resorts.add(resort);
        }
        return resorts;
    }
    public SkiResort mapRowToSkiResort(SqlRowSet rowSet){
        SkiResort skiResort = new SkiResort();
        skiResort.setSki_resort_id(rowSet.getInt("ski_resort_id"));
        skiResort.setName(rowSet.getString("name"));
        skiResort.setState_name(rowSet.getString("state_name"));
        skiResort.setRegion(rowSet.getString("region"));
        return skiResort;
    }
}
