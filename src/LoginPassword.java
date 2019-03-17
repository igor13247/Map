/**
 * Класс LoginPassword
 * @version 1.10 17 Mar 2019
 * @author  Igor Tsukanov
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LoginPassword {
    public static void main(String[] args) {
        Scanner stringSc = new Scanner(System.in);
        Map<String, String> map = new HashMap<>();

        /*map.put("111", "a");
        map.put("222", "b");
        map.put("333", "c");
        map.put("444", "d");
        map.put("555", "e");
        map.put("666", "f");*/

        System.out.println("Введите " +
                "количество пользователей");
        int kol = stringSc.nextInt();
        for (int i = 0; i < kol; i++) {
            System.out.println("Введите свой логин:");
            String login = stringSc.next();
            System.out.println("Введите свой пароль:");
            String password = stringSc.next();
            map.put(login, password);
            }
        /* После ввода пользователем логина,
        будет выведен пароль*/
        System.out.println("Введите свой логин: ");
        String log2 = String.valueOf(stringSc.nextInt());

        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (log2.equals(entry.getKey())) {
                System.out.println("Ваш пароль: ");
                System.out.println(entry.setValue(""));
            }
        }
        System.out.println(map);
    }
}
