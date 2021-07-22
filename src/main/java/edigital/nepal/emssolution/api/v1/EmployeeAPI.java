package edigital.nepal.emssolution.api.v1;

import edigital.nepal.emssolution.models.Employee;
import edigital.nepal.emssolution.service.EmployeeManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("api/v1/employees")
@RestController
public class EmployeeAPI {


    EmployeeManagerService employeeManagerService;
    @Autowired
    public EmployeeAPI(EmployeeManagerService employeeManagerService){
        this.employeeManagerService = employeeManagerService;
    }

    @GetMapping()
    public List<Employee> getAllEmployees(){
        return employeeManagerService.getAllEmployee();
    }
}
