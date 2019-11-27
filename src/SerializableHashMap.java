import java.io.*;
import java.util.HashMap;

public class SerializableHashMap {
    public static void main(String [] args) throws IOException {
        HashMap<Integer, String> hMap = new HashMap<Integer, String>();
        //Adding elements to HashMap
        hMap.put(11, "AB");
        hMap.put(2, "CD");
        hMap.put(33, "EF");
        hMap.put(9, "GH");
        hMap.put(3, "IJ");
       try {
           FileOutputStream fos;
           fos = new FileOutputStream ("hashmap.ser");

           ObjectOutputStream objectOutputStream = new ObjectOutputStream (fos);
           objectOutputStream.writeObject (hMap);
           objectOutputStream.close ();
           fos.close ();
           System.out.printf ("Serialized HashMap data is saved in hashmap.ser");
       }
       catch (IOException ioe){
           ioe.printStackTrace ();
       }
    }}


