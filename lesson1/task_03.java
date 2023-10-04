package lesson1;

import java.util.Arrays;

public class task_03 {
    public static void main(String[] args) {
        int array[] = { 3, 2, 2, 3 };
        int val = 3;
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == val) {
                int j = array.length - 1;
                while (j > i) {
                    if (array[j] != val) {
                        temp = array[j];
                        array[j] = array[i];
                        array[i] = temp;
                        break;
                    }
                    j--;
                }
                if (j == i) {
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
