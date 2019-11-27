import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MainHashMap {
    public static void main(String[] args) {
        //this is how to declare HashMap
        HashMap<Integer,String>hashMap=new HashMap <Integer, String>();

        //Adding elements to HashMap
        hashMap.put (1,"Coskun");
        hashMap.put (2,"Safiye");
        hashMap.put (3,"Turgay");
        hashMap.put (4,"Hatice");
        hashMap.put (5,"Altun");
        hashMap.put (6,"Fatma");
        //display content using Iterator
        Set set=hashMap.entrySet ();
        Iterator iterator=set.iterator ();
        while (iterator.hasNext ()){
            Map.Entry mentry=(Map.Entry)iterator.next ();
            System.out.print ("key is:"+mentry.getKey ()+"&Value is:");
            System.out.println (mentry.getValue ());
        }
        //get values based on key
        String var=hashMap.get (2);
        System.out.println ("value at idex to is 2"+var);

        //Remove values based on key
        hashMap.remove (3);
        System.out.println ("Map key and values after removal:");
        Set set2=hashMap.entrySet ();
        Iterator iterator2=set2.iterator ();
        while (iterator2.hasNext ()){
            Map.Entry mentry2=(Map.Entry)iterator2.next ();
            System.out.print ("Key is: "+mentry2.getKey() + " & Value is: ");
            System.out.println (mentry2.getValue ());
        }








    }

}
