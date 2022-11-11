package Zubko;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyArray {
    public void enterArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = scanner.nextInt();
        int array[] = new int[size];
        List<Integer> list = new ArrayList<>();
        System.out.println("Введите элементы массива");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
            if (array[i] % 3 == 0) {
                list.add(array[i]);
            }
        }
        if (list.isEmpty()) {
            System.out.println("В данном массиве отсутствуют элементы кратные 3");
        } else {
            System.out.println("Элементы массива кратные 3: " + list);
        }
    }
}

