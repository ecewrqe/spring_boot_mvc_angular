import { HttpClient, HttpHandler, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Employee } from './employee';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  private base_url = "http://localhost:8080/api/v1/employees?title=angular";
  constructor(private httpClient: HttpClient) {

  }

  getEmployeeList(): Observable<Employee[]>{
    console.log("this.base_url======", this.base_url);
    let headers = new HttpHeaders({
      // 'aaa': [1,2,3,4]
    });
    // headers.set('aaa', 'bbb');
    const httpOptions = {
      'headers': headers
    }
    let res = this.httpClient.get<Employee[]>(`${this.base_url}`, httpOptions);
    return res;
  }

  createEmployee(employee: Employee): Observable<any>{
    return this.httpClient.post(this.base_url, employee);
  }
}
