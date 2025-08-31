public class Main {
    public static void main(String[] args) {
        /*int i = 200;
        while (true) {
            if (i % 17 == 0) {
                System.out.println(i);
                break;
            }
            i++;
        }*/

        /*
        * Найти максимальное из натуральных чисел, не превышающих 5000, которое
          нацело делится на 39 */

        /*int max = 0;
        for (int i = 1; i < 5000; i++) {
            if (i % 39 == 0 && i > max) {
                max = i;
            }
        }
        System.out.println(max);*/

        /*for (int i = 5000; i > 0; i--) {
            if (i % 39 == 0) {
                System.out.println(i);
                break;
            }
        }*/

        /*
        Гражданин 1 марта открыл счет в банке, вложив 1000 руб. Через каждый
        месяц размер вклада увеличивается на 2% от имеющейся суммы. Определить:
а) за какой месяц размер выплаты по вкладу будет больше 30 рублей.
б) через сколько месяцев размер вклада превысит 1200 руб.
         */
       /* int countMonth = 0;
        double sum = 1000;
        int answerA = 0;
        int answerB = 0;

        while (true) {
            sum = sum * 1.02;

            if ((sum * 0.02) > 30.0) {
                if (answerA == 0) {
                    answerA = countMonth;
                }
            }

            if (sum > 1200) {
                if (answerB == 0) {
                    answerB = countMonth;
                }
            }

            countMonth++;

            if (answerA != 0 && answerB != 0) break;
        }

        System.out.println(answerA);
        System.out.println(answerB);*/

        /*for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                System.out.println("i=" + i + " j=" + j);
            }
        }*/

       /* for (int i = 5; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print(i + " ");
            }
            System.out.println();
        }*/

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print((5 * (i + 1)) + " ");
            }
            System.out.println();
        }
    }
}
