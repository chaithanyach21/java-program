package citnc; 

import java.util.Scanner; 

public class NameAndAge {
    
    String name;
    int age;

    
    public NameAndAge() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your name: ");
        this.name = sc.next(); 
        
        System.out.println("Enter your age: ");
        this.age = sc.nextInt();
        
        sc.close(); 
    }

    
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    
    public static void main(String[] args) {
        NameAndAge person = new NameAndAge();  
        person.display();                     
    }
}
