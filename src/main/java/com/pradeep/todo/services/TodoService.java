package com.pradeep.todo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.pradeep.todo.dao.TodoRepository;
import com.pradeep.todo.entities.Todo;

@Component
public class TodoService{

    @Autowired
    private TodoRepository todoRepository;

    

    //get all todos
    public List<Todo> getAllTodos(){
        List<Todo> list=(List<Todo>) this.todoRepository.findAll();
        return list;
        
    }

    //get single todo with id
    public Todo getTodoById(int id){
       Optional<Todo> s=null;
       try{
            s=todoRepository.findById(id);
       }catch(Exception e){
            e.printStackTrace();
       }
        return s.get();
        
    }

    public Todo addTodo(Todo todo){
        Todo temp=todoRepository.save(todo);
        return temp;
    }

    //  delete todo with id
     public Todo deleteTodo(int id){
        Todo s=new Todo();
        
            s=todoRepository.findById(id).get();
            if(s.getBody()!=null){
                todoRepository.deleteById(id);
            }
            return s;

         
     }




}