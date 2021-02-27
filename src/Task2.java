import java.util.IdentityHashMap;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        IdentityHashMap<String, String> hashtable = new IdentityHashMap<>();
        String end = "end";
        Scanner sc = new Scanner(System.in);

        while (true) {
        System.out.println("Enter the city");
        String city = (String) sc.nextLine();

        if (city.equalsIgnoreCase(end)) {
            break;
        } else {
            System.out.println("Enter the name");
            String name = (String) sc.nextLine();

            hashtable.put(city, name);
        }
        }
        System.out.println(hashtable);

        while (true) {
            System.out.println("Enter the name of the city for search: ");
            String citys = (String) sc.nextLine();

            if (citys.equalsIgnoreCase(end)) {
                sc.close();
                break;
            } else {
                System.out.println(hashtable.get(citys));
//*почему-то при вводе ключа выдает null и цикл продолжается. Посмотри, пожалуйста
            }
        }
    }
    }

