//mail project version 1

import java.util.Scanner;

class Mail { 
public static void main(String args[]) throws java.io.IOException { 

//create new object
Scanner mail = new Scanner(System.in);

//input user input. 
System.out.print("Hello Customer, please enter your name: ");

String name = mail.nextLine();

System.out.println("Welcome " + name + " to Costco's online resources.");  

}
}