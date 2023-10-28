import java.util.Scanner;
public class Triangle {
    public static void drawTriangle(int height) {
        for (int i = 1; i <= height; i++) {
            // In khoảng trắng
            for (int j = 1; j <= height - i; j++) {
                System.out.print(" ");
            }        
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println(); // Xuống dòng sau mỗi hàng
        }
    }     // Nguyễn Thị Minh Châu 20214997
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao chieu cao cua tam giac n sao: ");
        int n = sc.nextInt();
        drawTriangle(n);
    }
}
