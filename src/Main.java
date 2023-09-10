import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.nextLine();

        if (n > 100) {
            System.out.println("Số lượng gậy không được vượt quá 100. Vui lòng nhập lại.");
            scanner.close();
            return;
        }

        int[] arr = new int[n];
        int[] arr2 = new int[n];
        String message = "YES";

        String input = scanner.nextLine();
        String[] numbers = input.split(" ");
        String input2 = scanner.nextLine();
        String[] numbers2 = input2.split(" ");

        if (numbers.length != n || numbers2.length != n) {
            System.out.println("Số lượng phần tử không khớp với số lượng gậy. Vui lòng nhập lại.");
            scanner.close();
            return;
        }

        try {
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(numbers[i]);
                arr2[i] = Integer.parseInt(numbers2[i]);
            }
        } catch (NumberFormatException e) {
            System.out.println("Đã xảy ra lỗi khi chuyển đổi số nguyên. Vui lòng nhập lại các độ dài.");
            scanner.close();
            return;
        }

        Arrays.sort(arr);
        Arrays.sort(arr2);

        for (int i = 0; i < n; i++) {
            if (arr[i] > arr2[i])
                message = "NO";
        }
        System.out.println(message);
    }
}
