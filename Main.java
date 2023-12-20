package tasktwo;
class personn {
 protected String name;
 protected int age;

 public personn(String name, int age) {
     this.name = name;
     this.age = age;
 }
 public String getName() {
     return name;
 }

 public int getAge() {
     return age;
 }
}


class Employee extends personn {
 
 private int employeeId;
 private double salary;

 
 public Employee(String name, int age, int employeeId, double salary) {
     super(name, age);
     this.employeeId = employeeId;
     this.salary = salary;
 }

 
 public int getEmployeeId() {
     return employeeId;
 }

 public double getSalary() {
     return salary;
 }
}


public class Main {
 public static void main(String[] args) { 
     Employee employee1 = new Employee("Ajith", 23, 12345, 50000.0);  
     System.out.println("Name: " + employee1.getName());
     System.out.println("Age: " + employee1.getAge());
     System.out.println("Employee ID: " + employee1.getEmployeeId());
     System.out.println("Salary: $" + employee1.getSalary());
 }
}
