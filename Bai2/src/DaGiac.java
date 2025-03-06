import java.util.Arrays;

public  class DaGiac {
    protected int soCanh;
    protected int[] kichThuoc;

    public DaGiac(int soCanh, int[] kichThuoc){
        if(soCanh < 3){
            System.out.println("Loi roi");
        }
        if(kichThuoc.length != soCanh){
            System.out.println("Loi roi");
        }

        this.soCanh = soCanh;
        this.kichThuoc = kichThuoc.clone();
    }

    public int ChuVi(){
        int chuVi = 0;
        for (int i : kichThuoc) {
            chuVi += i;
        }
        return chuVi;
    }
    public void GiaTriCanh(){
        System.out.println("So canh cua da giac: " + Arrays.toString(kichThuoc));
    }


}
