public class Razbor {
    public static void main(String[] args) {
        // дано число n, необходимо его реверсировать

//        Scanner sc = new Scanner(System.in);
       /* int n = Integer.MAX_VALUE - 100;

        long startTime = System.currentTimeMillis();
        int reverse = 0;

        while (n > 0) {
            reverse = reverse * 10 + n % 10;
            n /= 10;
        }

        long endTime = System.currentTimeMillis();

        System.out.println("Число=" + reverse + " Время выполнения=" + (endTime - startTime) + "ms");

        int n2 = Integer.MAX_VALUE - 100;

        long startTimeStr = System.currentTimeMillis();
        StringBuilder reverseStr = new StringBuilder();

        while (n2 > 0) {
            reverseStr.append(n2 % 10);
//            reverseStr += (char) n2 % 10;
            n2 /= 10;
        }
        long endTimeStr = System.currentTimeMillis();

        System.out.println("Число=" + reverseStr + " Время выполнения через строки =" + (endTimeStr - startTimeStr) + "ms");
*/

        // найти нок через нод
        int a = 6, b = 8;
        int x = a;
        int y = b;

//        a % b == 0, b - НОД
//        НОД(a,b) = НОД (b, a % b)

        int nod = a;
        while (b != 0) {
            int temporary = b;
            b = nod % b;
            nod = temporary;
        }

        System.out.println(nod);
        System.out.println((x * y) / nod);
    }
}