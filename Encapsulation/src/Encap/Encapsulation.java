
package Encap;

public class Encapsulation {

    public static void main(String[] args) {
        User user = new User(1, "Aishwarya", "aishwaryahalakatti2001@gmail.com");
        Student student = new Student(2, "Aishwarya Halakatti");

        
          // Accessing and displaying user information
        System.out.println("User Information:");
        user.displayInfo();
        System.out.println("------------");

       
        // Accessing and displaying student information
        System.out.println("Student Information:");
        student.displayInfo();
        System.out.println("------------");
        
       
    }
    
}
