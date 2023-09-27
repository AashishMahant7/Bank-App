import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name, password,balance to create an account");
        String name=sc.next();
        String password=sc.next();
        double balance=sc.nextDouble();
        SBIUser user=new SBIUser(name,balance,password);
        System.out.println("The account of new SBI is"+user.getAccountNo());
       String mesaage= user.addMoney(59999);
        System.out.println(mesaage);
        System.out.println("enter withdraw");
        int  money=sc.nextInt();
        System.out.println(" please enter your password");
        String pass=sc.next();
        System.out.println(user.withdrawMoney(money,pass));
        System.out.println(user.calculateInterest(10));
        System.out.println("chanege");
        System.out.println("hlo sir this is commit line");

    }
}
