public class Main {
    public static void main(String[] args) {
        //---Class Account--
    Account A1 = new Account("102011111","Faisal",1000);
    Account A2 = new Account("102030","Ali",100);
        System.out.println("A1  your balance is : "+A1.getBalance());
        System.out.println("------------------");
        System.out.println( " transfer: "+A1.transferTo(A2,300)+" New Balance A2 After transfer: "+A2.getBalance());
        System.out.println("------------------");
        System.out.println("------------------");
        System.out.println(A1.printToString());
        System.out.println(A2.printToString());




        //---Class Employee--
        System.out.println("---Class Employee--");
        Employee emp1=new Employee("11223344","Omar",1500);
        System.out.println("Old salary: "+emp1.getSalary());
        System.out.println("AnnualSalary: "+emp1.AnnualSalary());
        System.out.println("New Salary with Annual: "+emp1.raisedSalary(0.10));


    }




}