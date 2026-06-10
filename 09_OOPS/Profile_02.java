import java.util.Scanner;

public class Profile_02 {
    
    static class Priyanshu {
        String name;
        int age;
        int rollno;
        String course;

        void Data(String name, int age, int rollno, String course) {
            System.out.println("Name: "+ name);
            System.out.println("Age: "+ age);
            System.out.println("Roll No : " + rollno);
            System.out.println("Course: " + course);
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter User Name: ");
        String user = sc.nextLine();
        
        if (user.equals("priyanshu")) {
            Priyanshu d1 = new Priyanshu();
            System.out.println("User Details: ");
            d1.Data("Priyanshu Raj", 20, 123, "B.tech");
        } else {
            System.out.println("Invaild user");
        }
    }

}
