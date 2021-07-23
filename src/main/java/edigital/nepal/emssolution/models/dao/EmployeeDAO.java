package edigital.nepal.emssolution.models.dao;

import edigital.nepal.emssolution.models.Designation;
import edigital.nepal.emssolution.models.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class EmployeeDAO {
    List<Designation> designations;
    List<Employee> employeeTable;
    DesignationDAO designationDAO;
    @Autowired
    public EmployeeDAO(DesignationDAO designationDAO){
        employeeTable = new ArrayList<>();
        designations = new ArrayList<>();
        int[] designationIds = {};
        designations = designationDAO.fetchDegnations(designationIds);
        employeeTable.add(
                new Employee("Gunjan",
                        "Yadav",
                        "yadavgunjan3310@gmail.com",
                        "1001",
                        designations,
                        "+9779842954703"
                )

        );
    }

    public List<Employee> getAll(){
        return employeeTable;
    }





}
