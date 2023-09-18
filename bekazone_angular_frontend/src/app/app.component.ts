import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  title = 'bekazone_mysql_spring_angular_frontend';
  subTitle = 'doll_list_CRUD';
  source_link = 'http://localhost:8080/api/v1/employees?title=angular';
}
