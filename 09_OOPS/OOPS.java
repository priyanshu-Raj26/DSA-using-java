public class OOPS {

    public static void main(String[] args) {
        Pen p1 = new Pen(); // created a pen object called p1
        p1.setcolor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        // p1.setcolor("Yellow");
        p1.color = "Yellow";
        System.out.println(p1.color);

        BankAccount myAcc = new BankAccount();
        myAcc.username = "priyanshuraj";
        // myAcc.password = "abcdefghi";  cannot accesable
        myAcc.setPassword("abcdefghi");

    }
}


class BankAccount {
    public String username;
    private String password;

    public void setPassword(String pwd) {
        password = pwd;
    }
}



class Pen {
    String color;
    int tip;

    void setcolor(String newcolor) {
        color = newcolor;
    }

    void setTip(int newTip){
        tip = newTip;
    }
}

class Student {
    String name;
    int age;
    float percentage;

    void calcPercentage(int phy, int chem, int math) {
        percentage = (phy + chem + math) / 3;
    }
}