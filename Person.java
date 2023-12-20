package tasktwo;
public class Person {
    
    private String name;
    private int age;

    
    public Person() {
        this.age = 18;
    }

    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void displayName() {
        System.out.println("Name: " + name);
    }

    
    public void displayAge() {
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        
        Person a = new Person();
        a.setName("Ajith");

        
        a.displayName();
        a.displayAge();

        
        Person b = new Person("Sujith", 25);

        
        b.displayName();
        b.displayAge();
    }
}


