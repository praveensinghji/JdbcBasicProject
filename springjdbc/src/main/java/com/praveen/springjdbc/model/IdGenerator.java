package com.praveen.springjdbc.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class IdGenerator {
    public String idGenretor(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyMMddHHmmssSSS");
        LocalDateTime now = LocalDateTime.now();
        String timeStamp = now.format(formatter);
        System.out.println("Request No- REQ" + timeStamp);
        System.out.println(timeStamp.length()+3);
        return "REQ"+timeStamp;
    }
}
