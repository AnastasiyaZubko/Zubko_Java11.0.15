package Zubko;

import java.util.Scanner;

public class Name {
    public void enterName() {
        String name = "Вячеслав";
        String str = "Привет,";
        System.out.println("Введите имя: \n");
        Scanner scanner = new Scanner(System.in);
        String name1 = scanner.nextLine();
        double compare = name.compareTo(name1);
        if (compare == 0) {
            System.out.println(str + name);
        } else {
            System.out.println("Нет такого имени");
        }
    }
}




