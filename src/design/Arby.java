package design;

public abstract class Arby implements Employee {

    protected Department2 department2;
    protected String location;
    public Arby(Department2 department,String location) {

        this.department2 = department;
        this.location = location;


    }

    public Department2 getDepartment() {

        return department2;
    }

    public void setDepartment(Department2 department) {
        this.department2 = department;
    }
     public String getLocation() {
        return location;
     }


     public void setLocation(String location) {
         this.location = location;
     }

     @Override
    public void assignDepartment(Department2 department) {
        this.department2=department;
     }
     public void departmentDuties() {
        switch (department2) {
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
