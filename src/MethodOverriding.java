class Employee {
    void display() {
        System.out.println("Name of class is Employee");
    }
}

class Engineer extends Employee {
    // Overriding the display method
    @Override
    void display() {
        System.out.println("Name of class is Engineer");
        
        // Calling the base class display method using super
        super.display();
    }


public class MethodOverriding {
   
         // Creating an Engineer object
        Engineer eng = new Engineer();
        
        // Calling display() on the Engineer object
        eng.display();
    }
}


       
