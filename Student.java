public class Student {
    String name;
    int rollNo;
    double grade;
    String phone;  
    String branch;

    public Student(String name, int rollNo, double grade, String phone,String branch)  {
        this.name = name;
        this.rollNo = rollNo;
        this.grade = grade;
        this.phone = phone;
        this.branch = branch;
    }

    public void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Grade: " + grade);
        System.out.println("Phone Number: " + phone); 
        System.out.println("Branch: " + branch);  
    } 
    

    public static void main(String[] args) {
        Student student1 = new Student("Vaishnavi", 101, 88.5, "7483360846","BCA");  // Phone number as a string
        student1.displayInfo();
    }
}
