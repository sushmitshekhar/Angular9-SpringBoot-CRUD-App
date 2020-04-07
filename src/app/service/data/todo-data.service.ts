import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Todo} from '../../todos/todos.component';

@Injectable({
  providedIn: 'root'
})
export class TodoDataService {

  constructor(
    private http: HttpClient
  ) { }

  retriveAllTodos(){
    return this.http.get<Todo[]>('http://localhost:8080/users/sushmit/todos');
  }
  deleteTodo(id) {
    return this.http.delete(`http://localhost:8080/users/sushmit/todos/${id}`);
  }

  retrieveTodo(id){
    return this.http.get<Todo>(`http://localhost:8080/users/sushmit/todos/${id}`);
  }

  updateTodo(id , todo){
    return this.http.put( `http://localhost:8080/users/sushmit/todos/${id}`, todo);
  }

  createTodo(todo){
    return this.http.post(`http://localhost:8080/users/sushmit/todos`, todo);
  }
}
