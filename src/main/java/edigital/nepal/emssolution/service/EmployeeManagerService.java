package edigital.nepal.emssolution.service;

import edigital.nepal.emssolution.models.Designation;
import edigital.nepal.emssolution.models.Employee;
import edigital.nepal.emssolution.models.dao.DesignationDAO;
import edigital.nepal.emssolution.models.dao.EmployeeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeManagerService {

    EmployeeDAO employeeDAO;
    DesignationDAO designationDAO;

    @Autowired
    public EmployeeManagerService(EmployeeDAO employeeDAO, DesignationDAO designationDAO){
        this.designationDAO = designationDAO;
        this.employeeDAO = employeeDAO;
    }


    public List<Designation> getDesignations( int[] designationIds){
        return designationDAO.fetchDegnations(designationIds);
    }

    public List<Employee> getAllEmployee(){

        return employeeDAO.getAll();
    }


    public boolean addEmployee(){

        return false;
    }


}
