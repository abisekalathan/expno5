/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scientific;

import java.util.Scanner;
public class scicalci {
    Scanner objs=new Scanner(System.in);
    double a,b;
    protected void operation(){
        System.out.println("Enter the degree to get value:");
        b=objs.nextDouble();
        a=Math.toRadians(b);
        System.out.println("The corresponding sin value:"+Math.sin(a));
        System.out.println("The corresponding cos value:"+Math.cos(a));
        System.out.println("The corresponding tan value:"+Math.tan(a));
        System.out.println("The corresponding cosec value:"+(1/(Math.sin(a))));
        System.out.println("The corresponding sec value:"+(1/(Math.cos(a))));
        System.out.println("The corresponding cot value:"+(1/(Math.tan(a))));
    } 
    
}
