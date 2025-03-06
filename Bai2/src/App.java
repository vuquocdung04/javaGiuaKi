import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("So luong tam giac(n): ");
        int n = scanner.nextInt();
        TamGiac[] danhSach = new TamGiac[n];

        for(int i = 0 ; i < n;i++){
            System.out.println("Nhap 3 canh tam giac: " + i + 1);
            int[] canh = {scanner.nextInt(), scanner.nextInt(), scanner.nextInt()};
            danhSach[i] = new TamGiac(canh);
        }

        //4. in ra danh sach tam giac theo dang bang
        System.out.println("\nDanh sach cac tam giac: ");
        for(int i = 0 ; i < n ; i++){
            System.out.println("Tam giac " + (i+1) +": ");
            danhSach[i].GiaTriCanh();
        }

        //5. tim cac tam giac co dien tich lon nhat
        double maxDienTich = 0;
        for (TamGiac tamGiac : danhSach) {
            maxDienTich = Math.max(maxDienTich, tamGiac.DienTich());
        }

        System.out.println("\nTam giac co dien tich lon nhat:  ");
        for (TamGiac tamGiac : danhSach) {
            if(tamGiac.DienTich() == maxDienTich){
                tamGiac.GiaTriCanh();
            }
        }

        // 6. tim kiem tam giac theo vi tri index
        int index =  scanner.nextInt();
        if(index >= 1  && index <= n){
            System.out.println("Nhap thong tin tam giac tai vi tri " + index + ": ");
            danhSach[index -1].GiaTriCanh();
        }

        //7. Sap xep mang tam giac theo dien tich tang dan
        Arrays.sort(danhSach, Comparator.comparingDouble(TamGiac::DienTich));

        System.out.println("\nDanh sach tam giac sau khi sap xep theo dien tich tang dan");
        for(int i = 0; i < n;i++){
            System.out.println("Tam giac: " + (i + 1) +": ");
            danhSach[i].GiaTriCanh();;
        }

        scanner.close();



    }
}
