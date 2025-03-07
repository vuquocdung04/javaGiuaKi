import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Account newAccount = new Account();

        while (true) {
            System.out.println("1.Khoi tao tai khoan");
            System.out.println("2.Nap tien");
            System.out.println("3.Rut tien");
            System.out.println("4.Dao han");
            System.out.println("5.Chuyen tien");
            System.out.println("6. TOStrING");
            System.out.print("Chon so:");
            int choose = scanner.nextInt();

            switch (choose) {
                case 1:
                    System.out.print("Nhap so tai khoan: ");
                    long soTaiKhoan = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nhap ten tai khoan: ");
                    String tenTaiKhoan = scanner.nextLine();

                    System.out.print("Nhap so tien trong tai khoan: ");
                    double tienTaiKhoan = scanner.nextDouble();
                    if(tienTaiKhoan == 0) tienTaiKhoan = 50000;
                    
                    newAccount = new Account(soTaiKhoan,tenTaiKhoan,tienTaiKhoan);
                    break;
                case 2:
                    System.out.print("So tien can nap: ");
                    long napTien = scanner.nextLong();
                    if(napTien < 0){
                        System.out.print("Nhap lai: ");
                        napTien = scanner.nextLong();
                    }
                    System.out.println("Nap thanh cong, tai khoan co: " + newAccount.NapTien(napTien));
                    break;
                case 3:
                    System.out.print("So tien can rut: ");
                    long rutTien = scanner.nextLong();
                    if(rutTien > newAccount.getTienTaiKhoan()){
                        System.out.print("So tien khong hop le:");
                        rutTien = scanner.nextLong();
                    }
                    System.out.println("Rut thanh cong, tai khoan co: " + newAccount.RutTien(rutTien));
                    break;
                case 4:
                    System.out.println("So tien dao han: " + newAccount.DaoHan(newAccount.getTienTaiKhoan()));
                    break;
                case 5:
                    System.out.print("Nhap so tien can chuyen: ");
                    long chuyenTien = scanner.nextLong();
                    if(chuyenTien > newAccount.getTienTaiKhoan()){
                        System.out.print("so du khong du!!");
                    }
                    System.out.println("Chuyen thanh cong, so tien hien tai: " + newAccount.ChuyenTien(chuyenTien));
                    break;
                case 6:
                    System.out.println("Thong tin tai khoan");
                    System.out.println(newAccount.toString());
                    break;
                default:
                    break;
            }
        }
    }
}
