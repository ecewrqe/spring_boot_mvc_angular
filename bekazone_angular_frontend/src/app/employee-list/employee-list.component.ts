import { Component, OnInit } from '@angular/core';
import { Employee } from '../employee';
import { EmployeeService } from '../employee.service';

@Component({
  selector: 'app-employee-list',
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.scss']
})
export class EmployeeListComponent implements OnInit {
  employees!: Employee[];

  constructor(private employeeService: EmployeeService){}

  ngOnInit(): void {
    // add recorde to employees
    console.log("get Employees");
    this.getEmployees();
  }

  getEmployees() {
    return this.employeeService.getEmployeeList().subscribe(data=>{
      this.employees = data;
      console.log(data);
    })
  }

}
