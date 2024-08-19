package chapter9;

public class Employee extends Person {
    private String employeeId; 
    private String title;

    public Employee(){
        System.out.println("Employee constructor");
    }
    
    public String getEmployeeId() {
        return this.employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
