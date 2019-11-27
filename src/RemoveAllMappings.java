import java.util.HashMap;

public class RemoveAllMappings {
    public static void main(String[] args) {


    //creating a HashMap of  int keys and string values
    HashMap<Integer,String>hashMap=new HashMap<Integer, String> ();
    //Adding  Key and Value pairs to HashMap
        hashMap.put (12,"w1");
        hashMap.put (24,"w2");
        hashMap.put (36,"w3");
        hashMap.put (48,"w4");
        hashMap.put (60,"w5");
        hashMap.put (72,"w6");
        //Displaying Hashmaps Elements
        System.out.println ("HashMap Elements Elements:"+hashMap);
        //Removing all Mapping
        hashMap.clear ();
        //displaying HashMap Elements after remove
        System.out.println ("After calling clear():");
        System.out.println ("----------------------");
        System.out.println ("HashMap Elements:"+hashMap);

    }
}
