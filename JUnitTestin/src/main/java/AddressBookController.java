import java.util.Scanner;

public class AddressBookController {

    static int selection;
    static boolean quit = false;
    static Scanner keyboard = new Scanner(System.in);
    static AddressBook ultimateLedger = new AddressBook();
    static Address address1;
    static String nameAdd;
    static String nameRemove;
    static String nameFind;



    public static void main(String[] args){


        do{

            //menu print
            System.out.println("""
                    Please select the operation you wish to perform:
                     1. Add Address
                     2. Delete Address
                     3. Find Address
                     4.Address Count
                     5. List All Addresses
                     6 - Quit""");
            selection = keyboard.nextInt();

            //switch to navigate the menu
            switch (selection){
                //adds
                case 1:
                    nameAdd = getName();
                    address1 = getAddress();
                    ultimateLedger.putAddress(nameAdd,address1);
                    System.out.println("Address Added to the Address Book");
                    pause();
                    break;
                //removes
                case 2:
                    nameRemove = getName();
                    ultimateLedger.removeAddress(nameRemove);
                    pause();
                    break;
                //searches
                case 3:
                    nameFind = getName();
                    ultimateLedger.findAddress(nameFind);
                    pause();
                    break;
                //gives total count of addresses
                case 4:
                    System.out.println("Total count is " + ultimateLedger.getCount());
                    pause();
                    break;
                //prints the whole address book
                case 5:
                    ultimateLedger.getBook();
                    pause();
                    break;
                //quits
                case 6:

                    quit = true;
                    pause();

                    break;
            }

        }while(!quit);
        keyboard.close();
    }

    //a function to use to get a full name as a key of our map
    public static String getName()
    {

        System.out.println("Please enter first name");
        String x = keyboard.next();


        System.out.println("Please enter last name");
        String y = keyboard.next();


        return x + " " + y;
    }
    //a function to get an address object to insert into our hashmap
    public static Address getAddress(){
        System.out.println("Please enter street number");
        int a = keyboard.nextInt();

        System.out.println("Please enter street name");

        String b = keyboard.next();
        System.out.println("Please enter city");
        String c = keyboard.next();
        System.out.println("Please enter state");
        String d = keyboard.next();
        System.out.println("Please enter zipcode");
        int e = keyboard.nextInt();

        return new Address(a,b,c,d,e);
    }

    //pauses
    public static void pause() {
        System.out.println("Enter 1 to continue");
        Scanner s = new Scanner(System.in);
        s.next();
    }

}
