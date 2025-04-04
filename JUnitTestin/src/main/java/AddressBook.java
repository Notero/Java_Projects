import java.util.HashMap;

public class AddressBook {

    //creates a hashmap for this class
    final private HashMap<String, Address> ledger = new HashMap<>();

    //adds to the hashmap using name as key and address as value
    public int putAddress(String fullName, Address address1 ){
        ledger.put(fullName,address1);
        //need to include testable return values
        if(ledger.get(fullName) != null){
            return 1;
        }else{
        return 0;
        }
    }
    //removes address using fullname
    public int removeAddress(String fullName){
        if(ledger.get(fullName) != null){
        ledger.remove(fullName);
        return 1;}else{
            return 0;
        }

    }
    //finds a value by searching its key and prints if found
    public boolean findAddress(String fullName){
        if(ledger.containsKey(fullName)){
            System.out.println("Address found!");
            System.out.println("Here is the " + ledger.get(fullName).toString());
            return true;
        }else{
            System.out.println("The address couldn't be found -_-");
            return false;
        }
    }
    //gets the size of hashmap
    public int getCount(){
        return ledger.size();
    }
    //this function iterate and prints the hashmap
    public void getBook(){

        System.out.println("All registered Addresses:");

        for(String name: ledger.keySet()){
            System.out.print(name + " ");
            for (Address address : ledger.values()) {
                System.out.println(address.toString());
            }
        }
    }
}
