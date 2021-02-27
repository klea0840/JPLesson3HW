import java.util.Hashtable;
import java.util.Scanner;

// TODO: сделай так, чтобы вводить можно было из консоли,
//  ввод заканчивался по строке "end", после чего запрашивался
//  город и выводился список живущих там. Вывод заканчивается также
//  по "end". Пока нет "end", показывать приглашение ввести название
//  города.
//  ВАЖНО: предусмотреть вариант, когда в городе живет несколько семей.
//  Это потребует, возможно, изменить типы данных в таблице.

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

