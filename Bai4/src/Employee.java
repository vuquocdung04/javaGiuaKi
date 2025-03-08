public abstract class Employee {
    protected int iD;
    protected String fullName;
    protected String birthDay;
    protected int phone;
    protected Employee employee;
    protected int employee_count;

    public Employee(int a, String b, String c, int d, Employee e,int f){
        this.iD = a;
        this.fullName = b;
        this.birthDay = c;
        this.phone = d;
        this.employee = e;
        this.employee_count = f;
    }


    public void ShowInfo(){
        System.out.println("ID: " + iD);
        System.out.println("Full Name: " + fullName);
        System.out.println("BirthDay: " + birthDay);
        System.out.println("Phone: " + phone);
        System.out.println("Employee: " + employee);
    }
}
