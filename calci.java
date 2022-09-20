
package Calculator;
import scientific.*;
import java.util.Scanner;
public class calci extends scicalci {
    int a,b,c;
    Scanner obj=new Scanner(System.in);
    public void display()
    {
        
        OUTER:
        while (true) {
            System.out.println("1.Addition\n2.Substrcation\n3.Multiplication\n4.Division\n5.Exit");
            System.out.print("Enter your choice:");
            c=obj.nextInt();
            System.out.print("Enter the value of a:");
            a=obj.nextInt();
            System.out.print("Enter the value of b:");
            b=obj.nextInt();
            switch (c) {
                case 1 -> System.out.println("The Addition of Two Numbers:"+a+"+"+b+"="+(a+b));
                case 2 -> System.out.println("The Substraction of Two Numbers:"+a+"-"+b+"="+(a-b));
                case 3 -> System.out.println("The Multiplication of Two Numbers:"+a+"*"+b+"="+(a*b));
                case 4 -> {
                    float f=a/b;
                    System.out.println("The Division of Two Numbers:"+a+"/"+b+"="+f);
                }
                case 5 -> {
                    break OUTER;
                }
                default -> System.out.println("Wrong Choice Enter coorect Choice!!");
            }
        }
        
    }
}
