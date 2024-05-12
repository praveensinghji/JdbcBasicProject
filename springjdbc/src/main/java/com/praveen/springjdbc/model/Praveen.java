package com.praveen.springjdbc.model;

public class Praveen {
    private String requestNo;
    private String firstName;
    private String lastName;
    private String school;

    public Praveen() {
    }

    public Praveen(String requestNo, String firstName, String lastName, String school) {
        this.requestNo = requestNo;
        this.firstName = firstName;
        this.lastName = lastName;
        this.school = school;
    }

    public String getRequestNo() {
        return requestNo;
    }

    public void setRequestNo(String requestNo) {
        this.requestNo = requestNo;
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

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "Praveen{" +
                "requestNo='" + requestNo + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", school='" + school + '\'' +
                '}';
    }
}
