public class Intern extends Employee {

    public Intern(int a, String b, String c, int d, Employee e, int f) {
            super(a, b, c, d, e, f);
            //TODO Auto-generated constructor stub
        }
    
    String majors;
    int Semester;
    String university_Name;

    public void ShowMe(){
        System.out.println("Chuyen nghanh dang hoc: " + majors);
        System.out.println("Hoc ki dang hoc: " + Semester);
        System.out.println("Ten truong dang hoc: " + university_Name);
    }

    @Override
    public void ShowInfo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ShowInfo'");
    }
}
