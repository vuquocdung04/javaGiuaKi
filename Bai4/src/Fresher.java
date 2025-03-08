public class Fresher extends Employee {

    public Fresher(int a, String b, String c, int d, Employee e, int f) {
            super(a, b, c, d, e, f);
            //TODO Auto-generated constructor stub
        }
    
    String graduation_Date;
    String graduation_Rank;
    String education;
    
    public void ShowMe(){
        System.out.println("Thoi gian tot nghiep: " + graduation_Date);
        System.out.println("Xep loai tot nghiep: " + graduation_Rank);
        System.out.println("Truong tot nghiep: " + education);
    }

    @Override
    public void ShowInfo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ShowInfo'");
    }
}
