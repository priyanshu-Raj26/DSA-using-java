public class Profile {

    static class Priyanshu {
        String name;
        int age;
        int rollno;
        String course;

        void Data(String name, int age, int rollno, String course) {
            System.out.println(name);
            System.out.println(age);
            System.out.println(rollno);
            System.out.println(course);
        }
    }
    public static void main(String args[]) {
        Priyanshu d1 = new Priyanshu();

        d1.Data("Priyanshu", 20, 123, "B.tech");
    }
}