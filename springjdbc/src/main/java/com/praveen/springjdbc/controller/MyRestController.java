package com.praveen.springjdbc.controller;

import com.praveen.springjdbc.jdbcTemplate.JdbcTemplateWithQuery;
import com.praveen.springjdbc.model.IdGenerator;
import com.praveen.springjdbc.model.Praveen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyRestController {

    @Autowired
    private JdbcTemplateWithQuery source;

    private final IdGenerator idGenerator = new IdGenerator();

    @GetMapping("/praveen")
    public List<Praveen> getData(){
        return source.getData();
    }

    @GetMapping("/save")
    public String save(){
        Praveen person = new Praveen();
        person.setRequestNo(idGenerator.idGenretor());
        person.setFirstName("Shweta");
        person.setLastName("Singh");
        person.setSchool("JPIC Kaptanganj");
        String request = source.savePraveen(person);
        return request;
    }

    @GetMapping("/byid")
    public Object getdataByid(){
        String requestId = "REQ240512180009834";
        return source.getDataById(requestId);
    }
    @GetMapping("/update")
    public String updateById(){
        String requestNo = "REQ240512180259316";
        Praveen person = new Praveen();
        person.setFirstName("Vishal");
        person.setLastName("Singh");
        person.setSchool("JPIC Kaptanganj");
        source.updateById(person,requestNo);
        return "Update Successfully";
    }
}
