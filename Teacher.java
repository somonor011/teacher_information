import java.lang.System;
import java.util.Scanner;
public class Teacher {

    public static void main(String[] args){
        String name;
        int Id;
        float salary;
        Scanner cin = new Scanner(System.in);
        System.out.print("Input Teacher's name : "); name=cin.nextLine();
        System.out.print("Input Teacher's ID   : "); Id=cin.nextInt();
        System.out.print("Input Teacher's Salary : "); salary=cin.nextFloat();
        
        System.out.println("Teacher's Information.");
        System.out.println("Name : " + name + "\tID : " + Id + "\tSalary : " + salary);
    }

}