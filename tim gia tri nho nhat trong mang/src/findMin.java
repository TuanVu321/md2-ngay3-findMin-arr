import java.util.Scanner;

public class findMin {
    public static int min(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao kich thuoc mang");
        int size = scanner.nextInt();
        arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhap gia tri thu " + (i + 1));
            arr[i] = scanner.nextInt();
        }
        int min = min(arr);
        System.out.println("gia tri nho nhat la: "+min);
    }
}
