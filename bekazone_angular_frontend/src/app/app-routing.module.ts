import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { EmployeeListComponent } from './employee-list/employee-list.component';
import { BannerComponent } from './banner/banner.component';
import { CreateEmployeeComponent } from './create-employee/create-employee.component';

const routes: Routes = [
  {path: "employees", component: EmployeeListComponent},
  {path: "banner", component: BannerComponent},
  {path: "create-employee", component: CreateEmployeeComponent},
  {path: "source", redirectTo: "http://localhost:8080/api/v1/employees?title=angular"},
  {path: "", redirectTo: "employees", pathMatch: 'full'},
  

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
