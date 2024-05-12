package com.praveen.springjdbc.jdbcTemplate;

import com.praveen.springjdbc.model.Praveen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

@Repository
public class JdbcTemplateWithQuery{
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public JdbcTemplateWithQuery(DataSource dataSource){
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public List<Praveen> getData(){
        String GET_ALL_DATA_QUERY="SELECT * FROM myTable ;";
        return jdbcTemplate.query(GET_ALL_DATA_QUERY,(rs, rowNum) -> {
            Praveen person = new Praveen();
            person.setRequestNo(rs.getString("requestNo"));
            person.setFirstName(rs.getString("firstName"));
            person.setLastName(rs.getString("lastName"));
            person.setSchool(rs.getString("school"));
            return person;
        });
    }

    public String savePraveen(Praveen praveen){
        String QUERY_FOR_SAVE="INSERT INTO MYTABLE(requestNo,firstName, lastName, school) VALUE (?,?,?,?)";
        jdbcTemplate.update(QUERY_FOR_SAVE,praveen.getRequestNo(),praveen.getFirstName(),praveen.getLastName(),praveen.getSchool());
        return praveen.getRequestNo();
    }

    public Object getDataById(String requestNo){
        String QUERY_FOR_CALLING_DATA_BY_ID="SELECT * FROM myTable where requestNo=?";
        Object[] ob = {requestNo};
        return jdbcTemplate.queryForObject(QUERY_FOR_CALLING_DATA_BY_ID,ob,(rs, rowNum) -> {
            Praveen person = new Praveen();
            person.setRequestNo(rs.getString("requestNo"));
            person.setFirstName(rs.getString("firstName"));
            person.setLastName(rs.getString("lastName"));
            person.setSchool(rs.getString("school"));
            return person;
        });
    }
    public void updateById(Praveen praveen,String requestNo){
        String QUERY_FOR_UPDATE_BY_ID="UPDATE MYTABLE SET firstName=?, lastName=?,school=? WHERE requestNo=?";
        jdbcTemplate.update(QUERY_FOR_UPDATE_BY_ID,praveen.getFirstName(),praveen.getLastName(),praveen.getSchool(),requestNo);
    }
}
