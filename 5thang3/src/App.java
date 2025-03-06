
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);


        ListCD boSuuTap = new ListCD(10);

        while (true) {
            System.out.println("\n----------Menu-------------");
            System.out.println("1.Them CD:");
            System.out.println("2.Xuat danh sach CD");
            System.out.println("3.Tinh so luong CD");
            System.out.println("4.Tinh tong gia thanh");
            System.out.println("5.Sap xep giam dan theo gia");
            System.out.println("6.Sap xep tang dan theo ten");
            System.out.println("0.Thoat");
            System.out.println("Chon chuc nag: ");

            int chon = scanner.nextInt();
            scanner.nextLine();

            switch (chon) {
                case 1:
                    System.out.print("Nhap ma CD: ");
                    int maCD = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Nhap ten CD: ");
                    String tenCD = scanner.nextLine();

                    System.out.print("Nhap ten ca sy");
                    String caSy = scanner.nextLine();

                    System.out.print("Nhap so bai hat:");
                    int soBaiHat = scanner.nextInt();

                    System.out.print("Nhap gia thanh: ");
                    float giaThanh = scanner.nextFloat();

                    CD cd = new CD(maCD, tenCD, caSy,soBaiHat, giaThanh);
                    boSuuTap.AddCD(cd);

                    break;
                case 2:
                boSuuTap.xuatDanhSach();
                break;

                case 3:
                System.out.println("So luong cd: " + boSuuTap.CountCD());
                break;

                case 4:
                System.out.println("tong gia thanh: " + boSuuTap.CostCDs());
                break;

                case 5:
                boSuuTap.SortCD();
                break;

                case 6:
                boSuuTap.SortCDName();
                break;
                case 0:
                System.out.println("Ket thuc chuong trinh");
                break;
                default:
                System.out.println("Chuc nang khong hop le");
                    break;
            }
        }
    }
}
