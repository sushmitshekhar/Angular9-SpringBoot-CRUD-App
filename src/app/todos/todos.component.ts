import {Component, OnInit} from '@angular/core';
import {TodoDataService} from '../service/data/todo-data.service';
import {Router} from '@angular/router';

export class Todo {
  id: number;
  username: string;
  description: string;
  targetDate: Date;
  done: boolean;

  constructor(id: number, username: string, description: string, targetDate: Date, done: boolean) {
    this.id = Number(id);
    this.username = username;
    this.description = description;
    this.targetDate = targetDate;
    this.done = done;
  }
}

@Component({
  selector: 'app-todos',
  templateUrl: './todos.component.html',
  styleUrls: ['./todos.component.css']
})
export class TodosComponent implements OnInit {

  todos: Todo[];
  message: string;

  constructor(
    private router: Router,
    private todoservice: TodoDataService
  ) {
  }

  ngOnInit(): void {
    this.refreshTodos();
  }

  refreshTodos() {
    this.todoservice.retriveAllTodos().subscribe(
      response => {
        console.log(response);
        this.todos = response;
      });
  }

  deleteTodo(id) {
    console.log(`Delete Todo ${id}`);
    this.todoservice.deleteTodo(id).subscribe(
      response => {
        console.log(response);
        this.message = 'Delete Successful';
        this.refreshTodos();

      });
  }

  updateTodo(id) {
    console.log(`update ${id}`);
    this.router.navigate(['todos', id]);
  }

  addTodo() {
    this.router.navigate(['todos', -1]);
  }
}
