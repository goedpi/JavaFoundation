package chapter9;

public class Person {
    private String name; 
    private int age; 
    private String gender;
   
    public Person(){
        System.out.println("Employee constructor");
    }
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
