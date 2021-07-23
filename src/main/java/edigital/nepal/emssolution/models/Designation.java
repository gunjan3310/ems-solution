package edigital.nepal.emssolution.models;

public class Designation {
    public int designationId;
    public String designation;
    public String discription;

    public Designation(int designationId, String designation, String discription) {
        this.designationId = designationId;
        this.designation = designation;
        this.discription = discription;
    }

    public int getDesignationId() {
        return designationId;
    }

    public void setDesignationId(int designationId) {
        this.designationId = designationId;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }


}
