package edigital.nepal.emssolution.models.dao;

import edigital.nepal.emssolution.models.Designation;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DesignationDAO {

    List<Designation> designationTable = new ArrayList<>();

    public DesignationDAO(){

    }

    public List<Designation> fetchDegnations(int[] designationIds) {
        for(int i=0;i < designationIds.length - 1; i++){
            //database call for fetching a designation
            designationTable.add(getDesignation(designationIds[i]));
        }

        return designationTable;
    }

    public Designation getDesignation(int designationId){
        return new Designation(10,"Developer","Software Developement.");
    }
}
