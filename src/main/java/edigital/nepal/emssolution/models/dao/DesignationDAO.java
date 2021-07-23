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
        designationTable.add(new Designation(10,"Developer","Software Development"));
        designationTable.add(new Designation(11,"Tester","Testing Deployment"));
    }

    public List<Designation> fetchDegnations(int[] designationIds) {
        System.out.println(designationIds.toString());
        if(designationIds.length !=0){
            for (int i = 0; i < designationIds.length - 1; i++) {
                //database call for fetching a designation
                designationTable.add(getDesignation(designationIds[i]));
            }
        }

        return designationTable;
    }

    public Designation getDesignation(int designationId){
        //mock database call
        for(int j=0; j<designationTable.size()-1;j++){
            if(designationTable.get(j).designationId == designationId){
                System.out.println("Designation "+ designationTable.get(j));
                return designationTable.get(j);
            }
        }
        return null;
    }
}
