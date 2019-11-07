public class Proxy implements IService {
    Bank bank;
    double withdrawal;
    double deposit;
    double credit;

    public Proxy(double withdrawal, double deposit, double credit) {
        this.withdrawal = withdrawal;
        this.deposit = deposit;
        this.credit = credit;
    }


    @Override
    public double getWithdrawal() {
        System.out.print("Transaction completed. Your withdrawal is " );
        return withdrawal;
    }


    @Override
    public double getDeposit() {
        System.out.print("You successfully created deposit. Your current balance is: " );
        return deposit;
    }

    public double getCredit() {
        System.out.print("Your offer has been accepted. The overall sum of credit is: ");
        return credit;
    }

    @Override
    public void Process() {
        System.out.print("Banking history request has been received. ");
        if (bank==null){
            bank = new Bank(withdrawal, deposit,credit);
        }
        bank.Process();
    }
}
