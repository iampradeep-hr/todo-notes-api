package com.pradeep.todo.entities;

import java.util.Date;

public class Todo {

    private int id;
    private String body;
    private String dateTime;

    public Todo() {
    }

    public Todo(int id, String body, String dateTime) {
        this.id = id;
        this.body = body;
        this.dateTime = dateTime;
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getBody() {
        return body;
    }
    public void setBody(String body) {
        this.body = body;
    }
    public String getDateTime() {
        return dateTime;
    }
    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }


    
}
