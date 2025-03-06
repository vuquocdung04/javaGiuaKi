public class CD {
    int maCD;
    String tenCD;
    String single;
    int musicCount;
    float cost;

    public int GetMaCD(){
        return maCD;
    }
    public void SetMaCD(int param){
        this.maCD = param;
    }

    public String GetTenCD(){
        return tenCD;
    }
    public void SetTenCD(String param){
        this.tenCD = param;
    }

    public String GetSingle(){
        return single;
    }
    public void SetMaCD(String param){
        this.single = param;
    }

    public int GetMusicCount(){
        return musicCount;
    }
    public void SetMusicCount(int param){
        this.musicCount = param;
    }

    public float GetCost(){
        return cost;
    }
    public void SetCost(float param){
        this.cost = param;
    }
    
    public CD(){

    }

    public CD(int CD, String name, String single, int count, float giaThanh){
        this.maCD = CD;
        this.tenCD = name;
        this.single = single;
        this.musicCount = count;
        this.cost = giaThanh;
    }

    @Override
    public String toString(){
        return maCD + tenCD + single + musicCount + cost;
    }
}
