import java.util.*;

public class SortHashMap {
    public static void main(String[] args) {


    HashMap<Integer,String> hashMap=new HashMap<Integer, String> ();
    hashMap.put (5,"Apple");
    hashMap.put (7,"Pear");
        hashMap.put (9,"Orange");
        hashMap.put (11,"Grape");
        hashMap.put (3,"Strawbery");
        hashMap.put (8,"peach");
        hashMap.put (15,"Fig");
        System.out.println ("Before Sorting:");
        Set set=hashMap.entrySet ();
        Iterator iterator=set.iterator ();
        while (iterator.hasNext ()){
            Map.Entry me=(Map.Entry)iterator.next ();
            System.out.print(me.getKey ()+":");
            System.out.println (me.getValue ());
        }

        Map<Integer,String>map=new TreeMap<Integer, String> (hashMap);
        System.out.println ("After Sorting");
        Set set2=map.entrySet ();
        Iterator iterator2=set2.iterator ();
        while (iterator2.hasNext ()){
            Map.Entry me2=(Map.Entry)iterator2.next ();
            System.out.print (me2.getKey ()+":");
            System.out.println (me2.getValue ());
        }



}}
