public class Bank implements IService {
    double withdrawal;
    double deposit;
    double credit;

    public Bank(double withdrawal, double deposit, double credit) {
        this.withdrawal = withdrawal;
        this.deposit = deposit;
        this.credit = credit;
    }


    @Override
    public double getWithdrawal() {
        System.out.println("Transaction completed. Your withdrawal is " + withdrawal);
        return withdrawal;
    }


    @Override
    public double getDeposit() {
        System.out.println("You successfully created deposit. Your current balance is: " + deposit);
        return deposit;
    }

    public double getCredit() {
        System.out.println("Your offer has been accepted. The overall sum of credit is: " + credit);
        return credit;
    }

    @Override
    public void Process() {
        System.out.print("Spent: ");
        System.out.println( withdrawal  +  deposit +  credit);
    }

}
