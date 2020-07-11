package design;

import Department2.Department;

public abstract class Arby implements Employee {

    protected Department department;
    protected String location;
    public Arby(Department department,String location) {

        this.department = department;
        this.location = location;


    }

    public Department getDepartment() {

        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
     public String getLocation() {
        return location;
     }


     public void setLocation(String location) {
         this.location = location;
     }

     @Override
    public void assignDepartment(Department department) {
        this.department=department;
     }
     public void departmentDuties() {
        switch (department) {
            case HUMAN_RESOURCES: System.out.println("recruiting,interviewing, workers" + " for arby. payroll arby, benefits and training.");
            break;
            case MARKETING: System.out.println("peolple interested services arby.");
            break;
            case INVENTORY: System.out.println("manufactures inside the warehouses.");
            break;
            case FINANCE: System.out.println("managing finance in arby.");
            break;
            case MANAGEMENT: System.out.println("aspects of bussiness operation and control.");

        }
     }





}
