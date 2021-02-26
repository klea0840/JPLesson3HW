import java.util.Hashtable;

public class Task3 {
    public static void main(String[] args) {

        Hashtable<String, Integer> hashtable = new Hashtable<>();

        hashtable.put("t", 1);
        hashtable.put("v", 2);
        hashtable.put("n", 3);
        System.out.println(hashtable);
        hashtable.replace("v", 4);
        hashtable.replace("t", 7);
        System.out.println(hashtable);
        hashtable.put("c", 5);
        hashtable.remove("c");

        System.out.println(hashtable);


    }
}

