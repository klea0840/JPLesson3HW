import java.util.Hashtable;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Hashtable<String, String> hashtable = new Hashtable<>();

        hashtable.put("Moscow", "Ivanov");
        hashtable.put("London", "Abramovich");
        hashtable.put("Kiev", "Petrov");

        System.out.println(hashtable.get("Moscow"));


        System.out.println(hashtable);
    }
    }

