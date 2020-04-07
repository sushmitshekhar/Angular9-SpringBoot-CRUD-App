import { Component, OnInit } from '@angular/core';
import {TodoDataService} from '../service/data/todo-data.service';
import {ActivatedRoute, Router} from '@angular/router';
import {Todo} from '../todos/todos.component';

@Component({
  selector: 'app-create-todos',
  templateUrl: './create-todos.component.html',
  styleUrls: ['./create-todos.component.css']
})
export class CreateTodosComponent implements OnInit {
  id: number;
  todo: Todo;
  constructor(
    private router: Router,
    private route: ActivatedRoute,
    private todoservice: TodoDataService
  ) {
    this.route.params.subscribe(params => this.id = Number(params.id));
    this.todo = new Todo(this.id, 'sushmit', '', new Date() , true);

  }

  ngOnInit(){
      if (this.id !== -1) {this.todoservice.retrieveTodo(this.id).subscribe (data => this.todo = data );
    }
  }
    saveTodo(){
    if (this.id === -1) {
      this.todoservice.createTodo(this.todo).subscribe (
        data => {console.log(data);
                 this.router.navigate(['todos']);
        });
      }
     else {
      this.todoservice.updateTodo(this.id, this.todo).subscribe (
          data => {
            console.log(data);
            this.router.navigate(['todos', this.id]);
          }
        );
    }
  }
}
