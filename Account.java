public class Account {
    private String id;
    private String name;
    private double balance = 0.0;

    Account() {
    }

    Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    Account(String id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public double setBalance(int amount) {
        this.balance = balance;
        return 0;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public double credit(double amount) {
        if (amount > balance || amount <= 0.0) {
            System.out.println("sorry you connect  credit !");
        } else {
            return balance-=amount;

        }
        return balance;
    }
    public double debit(double amount) {
        if (amount > 10000 || amount <= 0.0) {
            System.out.println("sorry you connect  debit !");
        } else {
            return balance+=amount;

        }
        return balance;
    }


    public double transferTo(Account A2,int amount) {
        if (amount > balance || amount <= 0.0) {
            System.out.println("sorry you connect  transferTo !");
        } else {
            this.balance-=amount;
            A2.balance+=amount;
            return A2.setBalance(amount)+amount;

        }
        return  this.balance ;
    }

public String printToString(){
        return "\n your name is: "+name+" ID: "+id +" balance: "+balance;
}
}
