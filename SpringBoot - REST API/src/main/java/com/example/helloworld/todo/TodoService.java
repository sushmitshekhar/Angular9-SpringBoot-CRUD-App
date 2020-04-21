package com.example.helloworld.todo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class TodoService implements TodoServiceList {

    private static List<Todo> todos = new ArrayList<>();

    private static long idCounter=0;
    static {
        todos.add(new Todo(++idCounter, "Sushmit" , "Angular and TS", new Date() , false));
        todos.add(new Todo(++idCounter, "Sushmit" , "Presentation", new Date() , false));
        todos.add(new Todo(++idCounter, "Sushmit" , "Spring Boot examples", new Date() , false));
    }
    @Override
    public List<Todo> findAll(){
        return todos;
    }

    @Override
    public Todo save(Todo todo) {
        if(todo.getId()==-1 || todo.getId()==0) {
            todo.setId(++idCounter);
            todos.add(todo);
        } else {
            deleteById(todo.getId());
            todos.add(todo);
        }
        return todo;
    }

    @Override
    public Todo deleteById(long id) {
        Todo todo = findById(id);

        if(todo==null) return null;

        if(todos.remove(todo)) {
            return todo;
        }
        return null;
    }

    @Override
    public Todo findById(long id) {
        for(Todo todo:todos) {
            if(todo.getId() == id) {
                return todo;
            }
        }
        return null;
    }

}
