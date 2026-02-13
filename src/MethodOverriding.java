class Employee {
    void display() {
        System.out.println("Name of class is Employee");
    }
}

class Engineer extends Employee {
    public class MethodOverriding {
   
        Engineer eng = new Engineer();
        
        eng.display();
    }
    @Override
    void display() {
        System.out.println("Name of class is Engineer");
        
        super.display();
    }



}


       
