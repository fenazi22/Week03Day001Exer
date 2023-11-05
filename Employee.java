public class Employee {

    private String id;
    private String name;
    private double salary;

    Employee(){}
    Employee(String id,String name,double salary){this.name=name;this.salary=salary;this.id=id;}

    public  void setId(String id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;

    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
    public double AnnualSalary(){//الراتب السنوي
       return  salary*12;

    }
    public double raisedSalary(double percent){//زيادة
     return   salary+=(salary*percent);
    }

    public  String printInfo(){

    return "Name: "+name+" ID: "+id+" Salary: "+salary+"\nAnnualSalary: "+AnnualSalary();

    }
}
