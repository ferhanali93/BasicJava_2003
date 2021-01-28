public class Employee {
    int id;
    String name;
    int salary;

    public Employee(int id, String name, int salary){
        this.id = id;
    this.name=name;
    this.salary=salary;
}

    public static void main(String args[]) {
        Employee emp1 = new Employee(1, "Huma", 5000);

        Employee emp2 = new Employee(2, "Ferhan", 9000);

        Employee emp3 = new Employee(3, "Monir", 10000);

        Employee emp4 = new Employee(4, "Sadika", 000);
        emp1.makeMoney();
        emp2.makeMoney();
    }
    public void makeMoney(){
        System.out.println(" is here to earn $ " );


    }

}
