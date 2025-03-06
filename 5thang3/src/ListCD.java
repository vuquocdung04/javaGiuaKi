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
}
