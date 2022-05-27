/*
Реализовать функцию возведения числа а в степень b. a, b ∈ Z. Сводя количество выполняемых действий к минимуму.
Пример 1: а = 3, b = 2, ответ: 9
Пример 2: а = 2, b = -2, ответ: 0.25
Пример 3: а = 3, b = 0, ответ: 1
Пример 4: а = 0, b = 0, ответ: не определено
Пример 5
входные данные находятся в файле input.txt в виде
b 3
a 10
Результат нужно сохранить в файле output.txt
1000
*/
import java.util.Scanner;

public class program_one {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("int a: ");
        boolean flag = iScanner.hasNextInt();
        while (flag == false) {
            System.out.printf("Вы ввели неправильное число, попробуйте еще раз, а = ");
            String z = iScanner.nextLine();
            boolean flag2 = iScanner.hasNextInt();
            flag = flag2;
            if (flag == false) {
                System.out.println("Это разве целое число??? " + z);
            }
        }
        int x = iScanner.nextInt();
        System.out.printf("int b: ");
        boolean flag_two = iScanner.hasNextInt();
        while (flag_two == false) {
            System.out.printf("Вы ввели неправильное число, попробуйте еще раз, b = ");
            String z2 = iScanner.nextLine();
            boolean flag3 = iScanner.hasNextInt();
            flag_two = flag3;
            if (flag_two == false) {
                System.out.println("Это разве целое число??? " + z2);
            }
        }
        int y = iScanner.nextInt();
        if (x == 0 & y == 0) {
            System.out.println("Не определено!");
        } else {
            double z = Math.pow(x, y);
            System.out.println(z);
        }
        iScanner.close();
    }
}
/*
       } 
       public static void sum(String[] args) {
        System.out.println(Solution.pow(7, 4));
     }
     
     public static int pow(int value, int powValue) {
        int result = 1;
        for (int i = 1; i <= powValue; i++) {
            result = result * value;
        }
        return result;
    }
*/