import { Component, OnInit } from '@angular/core';
import { Employee } from '../employee';
import { EmployeeService } from '../employee.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-create-employee',
  templateUrl: './create-employee.component.html',
  styleUrls: ['./create-employee.component.scss']
})
export class CreateEmployeeComponent implements OnInit{
  employee: Employee = new Employee();

  constructor(private employeeService: EmployeeService, private router: Router){

  }

  saveEmployee(){
    this.employeeService.createEmployee(this.employee).subscribe(data=>{
      console.log(data);
      console.log("success");
      this.gotoEmployeeList();
    }, err=>{
      console.log(err.message);
    })
  }

  gotoEmployeeList(){
    this.router.navigate(["/employees"]);
  }
  ngOnInit(): void {
    
  }
  onSubmit(){
    console.log(this.employee);
    this.saveEmployee();
  }

}
