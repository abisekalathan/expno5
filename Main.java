
package Exp5no1;

import Calculator.*;
import java.util.Scanner;

/**
 *
 * @author VISHNU KUMAR M.J
 */
public class Main extends calci {

    public static void main(String[] args) {
        // TODO code application logic here
        Main objc=new Main();
        
        Scanner o=new Scanner(System.in);
        
        OUTER:
        while(true)
        {
            System.out.println("1.Calculator\n2.Scientific Calculator\n3.Exit");
            System.out.print("Enter your choice:");
            int ch=o.nextInt();
            switch (ch){
                case 1:
                    objc.display();
                    break;
                case 2:
                    objc.operation();
                    break;
                case 3:
                    break OUTER;
                default:
                    System.out.println("Wrong Chice Enter Coorect Choice!!!");
            }
        }
        System.out.println("Successfully Done!!!");
    }
    
}
