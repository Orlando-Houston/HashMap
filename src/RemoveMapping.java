import java.util.HashMap;

public class RemoveMapping {
    public static void main(String[] args) {


        // Creating a HashMap of int keys and String values
        HashMap<Integer, String> hashMap = new HashMap<Integer, String> ();
        // Adding Key and Value pairs to HashMap
        hashMap.put (11, "value1");
        hashMap.put (22, "value2");
        hashMap.put (33, "value3");
        hashMap.put (44, "values4");
        hashMap.put (55, "value5");
        hashMap.put (66, "values6");

        // Displaying HashMap Elements
        System.out.println ("HashMap Elements: " + hashMap);

        // Removing Key-Value pairs for key 33
        Object removedElement1 = hashMap.remove (33);
        System.out.println ("Element removed is: " + removedElement1);

        // Removing Key-Value pairs for key 55
        Object removedElement2 = hashMap.remove (55);
        System.out.println ("Element removed is: " + removedElement2);


        // Displaying HashMap Elements after remove
        System.out.println ("After Remove:");
        System.out.println ("--------------");
        System.out.println ("HashMap Elements: " + hashMap);


    }
}






