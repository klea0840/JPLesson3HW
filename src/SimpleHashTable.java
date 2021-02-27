import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class SimpleHashTable extends HashMap implements Map {

    @Override
    public Object put(Object key, Object value) {
        System.out.println("Entered value " + value + " the key is " + key + "\nthe size is "  + size());
        return super.put(key, value);
    }

    @Override
    public boolean remove(Object key, Object value) {
        System.out.println("Removed value " + value + " the key is " + key + "\nthe size is "  + size());
        return super.remove(key, value);
    }

    @Override
    public Object replace(Object key, Object value) {
        System.out.println("Replaced value " + value + " the key is " + key + "\nthe size is " + size());
        return super.replace(key, value);
    }

    public static void main(String[] args) {

        SimpleHashTable hashtable = new SimpleHashTable();

        hashtable.put("t", 1);
        hashtable.put("v", 2);
        hashtable.put("n", 3);
        hashtable.remove("n", 3);
        hashtable.put("b", 4);
        hashtable.replace("n","Bye");
        hashtable.put("c", 5);

        System.out.println("\u001B[32m" + hashtable);
    }
}
