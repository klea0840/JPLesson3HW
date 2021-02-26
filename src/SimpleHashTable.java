import java.util.Hashtable;

public class SimpleHashTable {

    public static void main(String[] args) {

        Hashtable<String, Integer> hashtable = new Hashtable<>();

        hashtable.put("t", 1);
        hashtable.put("v", 2);
        hashtable.put("n", 3);
        hashtable.put("b", 4);
        hashtable.put("c", 5);

        System.out.println(hashtable);
    }
}
