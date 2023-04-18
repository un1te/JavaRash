package file.fileValuesSorting;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


// Зчитатати з файла  набір чисел.
// Вивести в консолі лише парні, відсортовані за зростанням.

public class solution {
    public static void main(String[] args) throws Exception {
        String sourceFileName = "src/main/java/file/source/test.txt";
        Scanner scanner = new Scanner(new FileInputStream(sourceFileName));

        List<Integer> data = new ArrayList<>();
        while (scanner.hasNext()) {
            int value = scanner.nextInt();
            if (value % 2 == 0) data.add(value);

        }

        Collections.sort(data);
        for (Integer value : data) {
            System.out.println(value);
        }

        scanner.close();
    }
}