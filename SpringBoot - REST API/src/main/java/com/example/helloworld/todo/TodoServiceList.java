package com.example.helloworld.todo;

import java.util.List;

public interface TodoServiceList {

    List<Todo> findAll();

    Todo save(Todo todo);

    Todo deleteById(long id);

    Todo findById(long id);
}
