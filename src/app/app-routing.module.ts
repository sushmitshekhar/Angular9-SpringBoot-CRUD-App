import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {LoginPageComponent} from './login-page/login-page.component';
import {WelcomeComponent} from './welcome/welcome.component';
import {TodosComponent} from './todos/todos.component';
import {CreateTodosComponent} from './create-todos/create-todos.component';


const routes: Routes = [
  {path: '' , component : LoginPageComponent},
  {path: 'todos', component: TodosComponent},
  {path: 'welcome', component: WelcomeComponent},
  {path: 'todos/:id', component: CreateTodosComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
