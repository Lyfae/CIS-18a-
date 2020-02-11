//mail project version 3

import java.util.Scanner; //read in string values
import java.util.Random; //create the prices 

class Info { 
//initialize the variables
private String name; 
private int member; 
public int number;
private char choose;

//create the functions

String getName() { return name; }
void setName(String n) { name = n; } 
int getMember() { return member; }
void setMember(int m) { member = m; }
char getChoose() { return choose; } 
void setChoose(char c) { choose = c; }
int getNumItems() { return number; } 
void setNumItems(int n) { number = n; }
}

class Data extends Info {
String name() { return getName(); }
int member() { return getMember(); } 
int number() { return getNumItems(); }
}

class Mail { 
public static void main(String args[]) throws java.io.IOException { 

//create new object
Data mail = new Data();
Scanner m = new Scanner(System.in);

//variables
int numItems;
String nameItems;


//input user input. 
//ask for name
System.out.print("Hello Customer, please enter your name: ");

String name = m.nextLine();
mail.setName(name);

System.out.print("Hello Customer, please enter the last four digits of your Membership ID: ");
int memberID = m.nextInt();
mail.setMember(memberID);
System.out.println();

System.out.println("Welcome " + mail.name() + ", to Costco's online resources.\n");
System.out.println("Here is your Member ID: " + mail.member() + "\n");
 
//validating user input to continue or exit 
System.out.println("Lets Shop! Press the 'Y' key to continue or press the 'N' key to exit");
char choose = (char) System.in.read();
mail.setChoose(choose);
System.out.println();

if(choose =='Y' || choose =='y') {
 System.out.println("Great! Let's Continue!\n");
 System.out.println();
}
else {  
 System.out.print("Thanks for shopping at Costco, have a great day!\n");
 System.exit(0);
}

//Customer Purchasing Items
System.out.println("How many items are looking to buy today?");
numItems = m.nextInt();
mail.setNumItems(numItems);

//ingnore input buffer
m.nextLine();

//create an array to hold the items
String items[] = new String[mail.number];

for(int i=0; i<numItems; i++) { 
 System.out.println("Please Input the Items that you would want to buy: ");
 items[i] = m.nextLine();
 System.out.println("Item " + (i+1) + " is " + items[i]);
}

 
}
}


//https://www.wikihow.com/Get-Input-from-a-User-in-Java 






