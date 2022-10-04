public class Accounts {
    public void deposit(double amount)
    {
        double balance = amount;
    }
    private double ch;
    private double sv;
    private double ot;

    Accounts(){ //This sets the values in the account when it is instantiated
        this.ch = 1000.00;
        this.sv = 2500.00;
        this.ot = 450.00;

    }
    public double getCh(){
        return ch;
    }
    public double getSv(){
        return sv;
    }

    public double getOt(){
        return ot;
    }


}