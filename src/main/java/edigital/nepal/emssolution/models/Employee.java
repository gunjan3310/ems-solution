package edigital.nepal.emssolution.models;

import java.util.List;

public class Employee {
    public String firstName;

    public String lastName;
    public String email;
    public String id;
    public List<Designation> designations;
    public String phoneNumber;
    public Employee(String firstName, String lastName, String email, String id, List<Designation> designations, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.id = id;
        this.designations = designations;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Designation> getDesignations() {
        return designations;
    }

    public void setDesignations(List<Designation> designations) {
        this.designations = designations;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", id='" + id + '\'' +
                ", designations=" + designations +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
