import { Component, OnInit } from '@angular/core';
import {Router} from '@angular/router';

@Component({
  selector: 'app-login-page',
  templateUrl: './login-page.component.html',
  styleUrls: ['./login-page.component.css']
})
export class LoginPageComponent implements OnInit {

  userName = '';
  passWord = '';
  LoginMessage = false;

  constructor(private router: Router) { }
  ngOnInit(): void {
  }
  login() {
    if ((this.userName === 'admin' && this.passWord === 'admin')) {
      this.LoginMessage = true;
      console.log('Successful login', this.userName, this.passWord);
      this.router.navigate(['welcome']);
    } else {
      this.LoginMessage = false;
      console.log('Error wrong username and password ', this.userName, this.passWord);
    }
    // console.log(this.username);
  }
}
