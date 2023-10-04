package HW_1;

public class HW_1_1 {
    public static void main(String[] args) {
        int n = 0;

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            n = 6;
        } else {
            n = Integer.parseInt(args[0]);
        }
        Answer ans = new Answer();
        int itresume_res = ans.countNTriangle(n);
        System.out.println(itresume_res);
    }
}

class Answer {
    public int countNTriangle(int n) {
        int count = 0;
        for (int i = 1; i < n + 1; i++) {
            count = count + i;
        }
        return count;

    }
}
