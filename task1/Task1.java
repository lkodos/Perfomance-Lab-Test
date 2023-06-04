public class Task1 {

    public static void main(String[] args) {

        int n = Integer.valueOf(args[0]);
        int m = Integer.valueOf(args[1]);

        int element = 1;
        do {
            System.out.print(element);
            element = ((element + m - 2) % n) + 1;
        } while (element != 1);
    }
}