import java.util.HashMap;

public class EmptyCheckHashMap {
    public static void main(String[] args) {


        //create a HashMap
        HashMap<Integer,String> hashMap=new HashMap <Integer, String>();

        //Checking whether HashMap is empty ot not
        /*is empty() method signature and description
        public boolean is empty();Returns true if this map
        contains no key- value mappings
         */
        System.out.println ("is HashMap Empty?"+hashMap.isEmpty ());




        //Adding key  and Value pairs to HashMap
        hashMap.put (2,"Peter");
        hashMap.put (6,"Rosa");
        hashMap.put (10,"Mark");
        hashMap.put (4,"Jany");
        hashMap.put (14,"Andrew");
        hashMap.put (8,"Mary");
        //Checking again
        System.out.println ("is HashMap Empty" +hashMap.isEmpty ());

    }
}
