public class TamGiac extends DaGiac {

    public TamGiac(int[] kichThuocCanh){
        super(3, kichThuocCanh);
        if(!kiemTraHopLe()) return;        
    }


    @Override
    public int ChuVi() {
        int chuVi = 0;
        for (int i : kichThuoc) {
            chuVi += i;
        }
        return chuVi;
        
    }

    
    public double DienTich(){
        double p = ChuVi() / 2.0;
        return Math.sqrt(p * (p - kichThuoc[0]) * (p - kichThuoc[1]) * (p - kichThuoc[2]));
    }

    private boolean kiemTraHopLe(){
        int a = kichThuoc[0];
        int b = kichThuoc[1];
        int c = kichThuoc[2];
        return a + b > c && a +c > b && b + c > a;
    }

}
