package com.pradeep.todo.dao;

import org.springframework.data.repository.CrudRepository;

import com.pradeep.todo.entities.Todo;


public interface TodoRepository extends CrudRepository<Todo,Integer> {


}
