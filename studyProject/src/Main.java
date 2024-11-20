import lesson3.Lesson3;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Lesson3 lesson3 = new Lesson3();
        Scanner scanner = new Scanner(System.in);
        System.out.println("write tut 1");
        System.out.println("write tut 2");

//        int numderScan = scanner.nextInt();
//        System.out.println(numderScan);

        lesson3.numberLesson3 = scanner.nextInt();
        lesson3.number1Lesson3 = scanner.nextInt();
        System.out.println(lesson3.numberLesson3 + lesson3.number1Lesson3);


//        lesson3.nonStaticNum = 8;
//        lesson3.method();
//        System.out.println(lesson3.nonStaticNum);
//        System.out.println(Lesson3.number);

    }
}

        //3.   + , - , / , * , %
        //int x = 4 + 5;
        //int y = 5 - 4;
        //int umn = 5 * 5;
        //int delenie = 7 % 5;
        //double d = (double) 6 / 5; //будет дробная часть
        //int d2 = 6 / 5; // не будет дробная часть
        //System.out.println(x);
        //System.out.println(delenie);
        //System.out.println(6 + 9);
        //1.Дано: два целочисленных числа: 168 и 1500.
        //Примените все математические операторы, результат операций вывести в консоль.
        /*int number1 = 168;
        int number2 = 1500;
        int x = 168 + 1500;
        int y = 168 - 1500;
        int umn = 168 * 1500;
        int delenie = 168 % 1500;
        double d = (double) 6 / 5;
        int d2 = 168 / 1500;
        //System.out.println(number1 + number2);
        System.out.println(x);
        System.out.println(y);
        System.out.println(umn);
        System.out.println(delenie);
        System.out.println(168 / 1500);
         */
        /*2.В методе main инициализировать все примитивные типы.
        Выведите в консоль char и сумму сложение всех численных переменнных
         */
