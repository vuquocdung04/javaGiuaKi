public class Experience extends Employee {

    public Experience(int a, String b, String c, int d, Employee e, int f) {
            super(a, b, c, d, e, f);
            //TODO Auto-generated constructor stub
        }
    
    int expInYear;
    String proSkill;


    public void ShowMe(){
        System.out.println("So nam kinh nghiem: " + expInYear);
        System.out.println("Ky nang chuyen mon: " + proSkill);
    }

    @Override
    public void ShowInfo() {
        super.ShowInfo();
    }

}
