import java.util.Scanner;

public class Index {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input sum you want take: ");
        double withdrawal = in.nextDouble();
        System.out.println("Input amount of money you want to give:");
        double deposit = in.nextDouble();
        System.out.println("Input the sum of credit:");
        double credit = in.nextDouble();
        Proxy bank = new Proxy(withdrawal,deposit,credit);
        System.out.println(bank.getCredit());
        System.out.println(bank.getDeposit());
        System.out.println(bank.getWithdrawal());
        bank.Process();
    }
}
