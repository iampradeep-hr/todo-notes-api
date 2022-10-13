package com.pradeep.todo.services;

import java.util.ArrayList;

import org.springframework.stereotype.Component;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.pradeep.todo.entities.Todo;

@Component
public class TodoService{

    private static List<Todo> list=new ArrayList<>();

    static{
        list.add(new Todo(101,"submit assignment tomorrow","Oct 13 5:20 PM"));
        list.add(new Todo(102,"watch breaking bad s2 ep2","Oct 13 5:20 PM"));
        list.add(new Todo(103,"go to shopping","Oct 13 5:20 PM"));
        list.add(new Todo(104,"create a minecraft server","Oct 13 5:20 PM"));
    }

    //get all todos
    public List<Todo> getAllTodos(){
        return list;
    }

    //get single todo with id
    public Todo getTodoById(int id){
       Todo s=new Todo();
        for(int i=0;i<list.size();i++){
            if (list.get(i).getId()==id) {
                s=list.get(i);

            }
        }
        return s;
        
    }


}