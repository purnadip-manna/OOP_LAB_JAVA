package lab.accbal;

public class Main {
    public static void main(String[] args) {
        SavingsAccount a1 = new SavingsAccount(1500f);
        System.out.println(a1);

        a1.deposit(500f);
        System.out.println(a1);

        try {
            a1.withdraw(1200.50f);
        } catch (NegativeAccountBalanceException e) {
            System.out.println(e);
        } catch (LowAccountBalanceException e2){
            System.out.println(e2);
        } finally {
            System.out.println(a1);
        }

        try {
            a1.withdraw(1200.50f);
        } catch (NegativeAccountBalanceException e) {
            System.out.println(e);
        } catch (LowAccountBalanceException e2){
            System.out.println(e2);
        } finally {
            System.out.println(a1);
        }
    }
}
