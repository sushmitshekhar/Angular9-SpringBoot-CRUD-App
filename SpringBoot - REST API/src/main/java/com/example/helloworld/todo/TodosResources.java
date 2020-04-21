//package com.example.helloworld.todo;
//
//import java.net.URI;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
//
//@CrossOrigin(origins = "http://localhost:4200")
//@RestController
//public class TodosResources {
//
//    @Autowired
//    private TodoHardcodedService todoService;
//
//	@Autowired
//	private TodoJpaRepository todoJpaRepository;
//
//    @GetMapping("/jpa/users/sushmit/todos")
//    public List<Todo> getAllTodos(){
//    	return todoJpaRepository.findAll();
////    	return todoService.findAll();
//    }
//    @GetMapping("/jpa/users/sushmit/todos/{id}")
//	public Todo getTodo(@PathVariable long id){
//		return todoJpaRepository.findById(id).get();
////    	return todoService.findById(id);
//	}
//
//	//DELETE /users/sushmit/todos/{id}
//	@DeleteMapping("/jpa/users/sushmit/todos/{id}")
//	public ResponseEntity<Void> deleteTodo(@PathVariable long id){
//		todoJpaRepository.deleteById(id);
//		return ResponseEntity.noContent().build();
//	}
////
////	//Edit/Update a Todo
////	//PUT /users/{user_name}/todos/{todo_id}
//	@PutMapping("/jpa/users/sushmit/todos/{id}")
//	public ResponseEntity<Todo> updateTodo(@PathVariable long id, @RequestBody Todo todo){
//		Todo todoUpdated = todoJpaRepository.save(todo);
//		return new ResponseEntity<Todo>(todo, HttpStatus.OK);
//	}
//
//	@PostMapping("/jpa/users/sushmit/todos")
//	public ResponseEntity<Void> updateTodo(@RequestBody Todo todo){
//		Todo createdTodo = todoJpaRepository.save(todo);
//		//Location
//		//Get current resource url
//		///{id}
//		URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
//				.path("/{id}").buildAndExpand(createdTodo.getId()).toUri();
//
//		return ResponseEntity.created(uri).build();
//	}
//}
