package HW_1;

public class HW_1_2 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        for (int i = 4; i <= 1000; i++) {

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    break;
                } else if (j == i - 1) {
                    System.out.println(i);
                }

            }
        }

    }

}
