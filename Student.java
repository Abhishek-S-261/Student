public class Student {
    // Student attributes
    String name;
    int id;
    String course;
    String phoneNo;
    String address;
   

    // Constructor
    public Student(String name, int id, String course,String phoneNo,String address) {
        this.name = name;
        this.id = id;
        this.course = course;
        this.phoneNo = phoneNo;
        this.address = address;
       
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Course: " + course);
        System.out.println("Phone Number: " + phoneNo);
        System.out.println("Address: " + address);
    }

    // Main method
    public static void main(String[] args) {
        // Creating a student object with hardcoded data
        Student s1 = new Student(
            "Abhishek",    // name
            109,                // id
            "BCA" ,
            "7899296504",
            "Vidya Nagar"
            
        );

        // Display student details
        s1.displayDetails();
    }
}
