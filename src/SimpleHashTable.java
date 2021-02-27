import java.util.Hashtable;

/* Я думаю, тут тебе надо создать собственный класс SimpleHashTable,
 * который наследует какому-либо из классов из урока, затем сделать
 * переопределение метода put(). Если помнишь, когда проходили классы
 * в целом, там была такая возможность (еще аннотация @Override).
 * Не думаю, что тут надо всю структуру класса и метода переделывать.
 * Достаточно, если при вызове метода put() он будет писать в консоли
 * что-то типа "вставил значение y по ключу x, всего в таблице N значений".
 * Точно также переопределить методы замещения и удаления.
 */

// TODO: создать субкласс и переопределить put() и др. методы.

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
