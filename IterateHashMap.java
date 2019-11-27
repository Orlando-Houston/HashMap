import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IterateHashMap {
    public static void main(String[] args) {
        HashMap<Integer,String>hmap=new HashMap<Integer, String> ();
        hmap.put (1,"AB");
        hmap.put (3,"CD");
        hmap.put (5,"EF");
        hmap.put (2,"GH");
        hmap.put (4,"KL");
        //for loop
        System.out.println ("for loop:");
        for(Map.Entry me:hmap.entrySet ()){
            System.out.println ("Key"+me.getKey ()+"& Value:"+me.getValue ());
        }
        //WHILE KOOP&ITERATOR
        System.out.println ("While Loop");
        Iterator iterator=hmap.entrySet ().iterator ();
        while (iterator.hasNext ()){
            Map.Entry me2=(Map.Entry)iterator.next ();
            System.out.println ("Key:"+me2.getKey ()+"&Valie:"+me2.getValue ());

        }
    }
}
