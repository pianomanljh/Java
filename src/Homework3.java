import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("몇 개의 수를 입력할 예정인가요? ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.print("수를 입력하세요: ");
        for (int i = 0 ; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int min = arr[0], max = arr[0];
        for (int a : arr) {
            if (a < min) min = a;
            if (a > max) max = a;
        }
        System.out.printf("최대값: %d\n", max);
        System.out.printf("최소값: %d\n", min);
    }
}
