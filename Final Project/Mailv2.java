//mail project version 2

import java.util.Scanner;

class Info { 
//initialize the variables
private String name; 
private double member; 
private char choose;

//create the functions

String getName() { return name; }
void setName(String n) { name = n; } 
double getMember() { return member; }
void setMember(double m) { member = m; }
char getChoose() { return choose; } 
void setChoose(char c) { choose = c; }

}

class Data extends Info {
String name() { return getName(); }
double member() {return getMember(); } 
}

class Mail { 
public static void main(String args[]) { 

//create new object
Data mail = new Data();
Scanner m = new Scanner(System.in);

//input user input. 
//ask for name
System.out.print("Hello Customer, please enter your name: ");

String name = m.nextLine();
mail.setName(name);

System.out.print("Hello Customer, please enter the last four digits of your Membership ID: ");
double memberID = m.nextDouble();
mail.setMember(memberID);

System.out.println("Welcome " + mail.name() + ", to Costco's online resources.");
System.out.println("Here is your Member ID: " + mail.member());
  
}
}