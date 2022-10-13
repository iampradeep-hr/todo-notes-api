package com.pradeep.todo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.pradeep.todo.services.TodoService;


import com.pradeep.todo.entities.Todo;

@RestController
public class TodoController {

    @Autowired
    private TodoService todoService;

    @RequestMapping(value = "/getTodo",method = RequestMethod.GET)
    public Todo getTodo(){
       
       return new Todo(1,"buy earpods","Oct 13  1:10 AM");
    }

    @GetMapping("/getAllTodos")
    public List<Todo> getAllTodos(){
        return todoService.getAllTodos();
    }
    
}
