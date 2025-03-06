import java.util.Arrays;
import java.util.Comparator;

public class ListCD {
    CD[] arrCD;
    int countCD;

    public ListCD(int a){
        arrCD = new CD[a];
        countCD = 0;
    }

    public boolean AddCD(CD cd){
        if(countCD >= arrCD.length) {
            System.out.println("danh sach da day");
            return false;
        }

        for(int i = 0; i < countCD; i++){
            if(arrCD[i].GetMaCD() == cd.GetMaCD()){
                System.out.println("Ma Cd da ton tai");
                return false;
            }
        }

        arrCD[countCD++] = cd;
        System.out.println("Them Cd thanh cong");
        return true;
    }

    public int CountCD(){
        return this.arrCD.length;
    }

    public float CostCDs(){
        float sumCost = 0;
        for (CD cd : arrCD) {
            sumCost += cd.GetCost();
        }
        return sumCost;
    }

    public void SortCD(){
        Arrays.sort(arrCD,0,arrCD.length, Comparator.comparingDouble(CD::GetCost).reversed());
    }

    public void SortCDName(){
        Arrays.sort(arrCD,0,arrCD.length, Comparator.comparing(CD::GetTenCD));
    }

    public void xuatDanhSach(){
        if(arrCD.length == 0) return;
        else{
            for (CD cd : arrCD) {
                System.out.println(cd);
            }
        }
    }
}
