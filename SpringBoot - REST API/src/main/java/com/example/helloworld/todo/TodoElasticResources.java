package com.example.helloworld.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class TodoElasticResources {

    @Autowired
    TodoService searchRepository;

    @GetMapping("/users/sushmit/todos")
    public List<Todo> getAllTodos(){
        return searchRepository.findAll();
    }


    @GetMapping("/users/sushmit/todos/{id}")
    public Todo getTodo(@PathVariable long id){
        return searchRepository.findById(id);
    }

    //DELETE /users/sushmit/todos/{id}
    @DeleteMapping("/users/sushmit/todos/{id}")
    public ResponseEntity<Void> deleteTodo(@PathVariable long id){
        searchRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }

//	//Edit/Update a Todo
//	//PUT /users/{user_name}/todos/{todo_id}
    @PutMapping("/users/sushmit/todos/{id}")
    public ResponseEntity<Todo> updateTodo(@PathVariable long id, @RequestBody Todo todo){
        Todo todoUpdated = searchRepository.save(todo);
        return new ResponseEntity<Todo>(todo, HttpStatus.OK);
    }

    @PostMapping("/users/sushmit/todos")
    public ResponseEntity<Void> updateTodo(@RequestBody Todo todo){
        Todo createdTodo = searchRepository.save(todo);
        //Location
        //Get current resource url
        ///{id}
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}").buildAndExpand(createdTodo.getId()).toUri();

        return ResponseEntity.created(uri).build();
    }
}
