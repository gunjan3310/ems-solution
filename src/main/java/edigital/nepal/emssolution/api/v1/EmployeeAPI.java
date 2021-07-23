package edigital.nepal.emssolution.api.v1;

import edigital.nepal.emssolution.models.Employee;
import edigital.nepal.emssolution.service.EmployeeManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
@Controller
public class EmployeeAPI {


    EmployeeManagerService employeeManagerService;
    @Autowired
    public EmployeeAPI(EmployeeManagerService employeeManagerService){
        this.employeeManagerService = employeeManagerService;
    }

    @RequestMapping(value = "api/v1/employees")
    @ResponseBody
    public List<Employee> getAllEmployees(){
        return employeeManagerService.getAllEmployee();
    }



}

