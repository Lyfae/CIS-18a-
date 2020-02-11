//mail project version 4

import java.util.Scanner; //read in string values
import java.util.Random; //create the prices 

//creating a simple interface
interface Value{ 
}

class Info { 
//initialize the variables
private String name; 
private int member; 
private char choose;
private String address;
public int number;

//create the functions

String getName() { return name; }
void setName(String n) { name = n; } 
int getMember() { return member; }
void setMember(int m) { member = m; }
char getChoose() { return choose; } 
void setChoose(char c) { choose = c; }
int getNumItems() { return number; } 
void setNumItems(int n) { number = n; }
String getAddress() { return address; }
void setAddress(String a) { address = a; }
} 

class Data extends Info {
String name() { return getName(); }
String address() { return getAddress(); }
int member() { return getMember(); } 
int number() { return getNumItems(); }
}

class Mail implements Value{ 
public static void main(String args[]) throws java.io.IOException { 

//create new object
Data mail = new Data();
Scanner m = new Scanner(System.in);
Random rand = new Random();

//variables
int numItems;
int total = 0;
char option;
String nameItems;

//input user input. 
//ask for name
System.out.print("Hello Customer, please enter your name: ");
String name = m.nextLine();
mail.setName(name);
System.out.println();

//ask for address to mail
System.out.println("Please enter the address you would want your items to be delivered to.");
System.out.println("House/Apparment # / Street name / City / State / Zip Code");
String address = m.nextLine();
mail.setAddress(address); 
System.out.println();

//ask to input membership ID
System.out.print("Please enter the last four digits of your Membership ID: ");
int memberID = m.nextInt();
mail.setMember(memberID);
System.out.println();

System.out.println("Welcome " + mail.name() + ", to Cero's Online Shopping Center.");
System.out.println("This is the designated address of delivery: " + mail.address());
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

do { 

//Customer Purchasing Items
System.out.println("How many items are looking to buy today?");
numItems = m.nextInt();
mail.setNumItems(numItems);

//ingnore input buffer
m.nextLine();

//create an array to hold the items
String items[] = new String[mail.number];

for(int i=0; i<numItems; i++) { 
 System.out.println("Please Input Item #" + (i+1) + "that you would want to buy: ");
 items[i] = m.nextLine();
 System.out.println("Item " + (i+1) + " is " + items[i]);

//implement the random number for price
 int n = rand.nextInt(50);
 int l = rand.nextInt(50);
 int o = rand.nextInt(50);
 int p = rand.nextInt(50);

//adding one to the random number generated to avoid free things
 n += 1;
 l += 1;
 o += 1;
 p += 1;

//check for the prices at different places
System.out.println("At Costco, the price for " + items[i] + " is $" + n);
System.out.println("At Vons, the price for " + items[i] + " is $" + l);
System.out.println("At Walmart, the price for " + items[i] + " is $" + o);
System.out.println("At Whole Foods, the price for " + items[i] + " is $" + p);
System.out.println();

//give the customer a choice
System.out.println("Press 1 to buy the item at Costco");
System.out.println("Press 2 to buy the item at Vons");
System.out.println("Press 3 to buy the item at Walmart");
System.out.println("Press 4 to buy the item at Whole Foods");

//implement the option for choice
char choice = (char) System.in.read();

switch(choice) { 
case '1':
 //add value of costco to total
 total +=n;
 break;
case '2': 
 total +=l;
 break;
case '3':
 total +=o;
 break;
case '4':
 total +=p;
 break;
default:
 System.out.println("You did not choose a valid choice, the program will log you out.");
 System.exit(0);
}

System.out.println("Your Current Total is: $" + total);
m.nextLine();
} //end of the for loop
 
//ask customer if they would like to continue shopping
System.out.println("Would you like to continue shopping?");
System.out.println("Press Y to contiue shopping, but if you are ready to check out, press N");
option = (char) System.in.read();

}while(option == 'Y' || option =='y');
//end of do loop
m.nextLine();

//checking out
System.out.println("Your total for this shopping session is $" + total);
System.out.println("Are you sure you want to continue checking out? (Y/N)");
char pick = (char) System.in.read();


//craete a random day where the shipment will return.
 int z = rand.nextInt(10);
 z +=1;
if(pick == 'Y' || pick =='y'){
 System.out.print("Thank you for shopping at Cero's Online Shopping Website! ");
 System.out.println("Your Shipment will come in " + z + " days to " + mail.address());
 System.out.println("See you soon!");
}
else{
 System.out.println("We are sorry things didn't go the way you expect it to. Please contact customer support at 1-800-DontContactThis for more information.");
}


}
}


//https://www.wikihow.com/Get-Input-from-a-User-in-Java 






