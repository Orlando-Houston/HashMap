import java.util.HashMap;

public class SizeOfHashMap {
    public static void main(String[] args) {


    // Creating a HashMap of int keys and String values
    HashMap<Integer, String> hashMap = new HashMap<Integer, String> ();
    // Adding Key and Value pairs to HashMap
        hashMap.put (11,"value1");
        hashMap.put (22,"value");
        hashMap.put (33,"value3");
        hashMap.put (44,"values");
        hashMap.put (55,"value5");

        // int size() method returns the number of key value pairs
        System.out.println("Size of HashMap : " + hashMap.size());
    }



}
