package Zubko;

import java.util.Scanner;

public class SelectTask {
    public void selectNumber() {
        Number enterNumber = new Number();
        Name enterName = new Name();
        MyArray enterArray = new MyArray();
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите номер задания: 1 или 2 или 3\n");
        System.out.println("1.Задание на ввод числа");
        System.out.println("2.Задание на ввод имени");
        System.out.println("3.Задание на ввод числового массива\n");
        while (!sc.hasNextInt()) {
            System.out.println("Вы ввели не число. Повторите. Введите 1 или 2 или 3 \n");
            sc.next();
        }
        int taskNumber = sc.nextInt();
        if (taskNumber == 1) {
            enterNumber.enterNumber();
        } else if (taskNumber == 2) {
            enterName.enterName();
        } else if (taskNumber == 3) {
            enterArray.enterArray();
        } else if (taskNumber == 0) {
            System.exit(0);
        } else {
            System.out.print("Такого задания не существует. Повторите попытку\n");
        }
        System.out.print("\n");
        selectNumber();

    }
}

