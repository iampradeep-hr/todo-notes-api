package com.pradeep.todo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pradeep.todo.entities.Todo;
import com.pradeep.todo.services.TodoService;

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

    @GetMapping("/getTodoById/{id}")
    public ResponseEntity<Todo> getTodoById(@PathVariable("id") int id){
        Todo temp=todoService.getTodoById(id);
        if(temp.getBody()==null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();

        }
        return ResponseEntity.of(Optional.of(temp));
       
    }

    @PostMapping("/addTodo")
    public Todo addTodo(@RequestBody Todo todo){
        Todo savedTodo=todoService.addTodo(todo);
        return savedTodo;
    }

    @DeleteMapping("deleteTodo/{id}")
    public Todo deleteTodo(@PathVariable("id") int id){
            Todo temp=this.todoService.deleteTodo(id);
            return temp;
    }
     
}
