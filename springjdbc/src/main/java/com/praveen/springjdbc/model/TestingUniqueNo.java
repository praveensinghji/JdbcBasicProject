package com.praveen.springjdbc.model;

import jakarta.persistence.Id;
import jakarta.servlet.ServletOutputStream;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

public class TestingUniqueNo {
    public static void main(String[] args) {
        IdGenerator idGenerator = new IdGenerator();
        System.out.println("RequestNo : "+ idGenerator.idGenretor());
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyMMddHHmmssSSS");
//        //String requestNo = UUID.randomUUID().toString();
//        LocalDateTime now = LocalDateTime.now();
//        String timeStamp = now.format(formatter);
//        //long timeStamp = System.currentTimeMillis();
//        System.out.println("Request No- REQ" + timeStamp);
//        System.out.println(timeStamp.length()+3);
    }
}
