import { Component, OnInit } from '@angular/core';
import {WelcomeDataService} from '../service/data/welcome-data.service';

@Component({
  selector: 'app-welcome',
  templateUrl: './welcome.component.html',
  styleUrls: ['./welcome.component.css']
})
export class WelcomeComponent implements OnInit {
  WelcomeMessage: string;

  constructor(private service: WelcomeDataService) { }

  getWelcomeMessage() {
    // console.log(this.service.executeHelloWorldBeanService());
    this.service.executeHelloWorldBeanService().subscribe(
      response => this.handleSuccessfulResponse(response)
    );
    // console.log('HELLO');
  }
  handleSuccessfulResponse(response) {
    // console.log(response);
    // console.log(response.message);
    this.WelcomeMessage = response.message;
  }
  ngOnInit(): void {
  }

}
