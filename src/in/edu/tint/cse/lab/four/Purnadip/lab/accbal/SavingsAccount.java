package lab.accbal;

public class SavingsAccount {
    private int acNo;
    float acBalance;
    public static int id = 1;
    SavingsAccount(float initAcBal){
        this.acNo = id++;
        this.acBalance = initAcBal;
    }

    void withdraw(float amount) throws NegativeAccountBalanceException, LowAccountBalanceException{
        this.acBalance -= amount;
        if (this.acBalance < 0) {
            throw new NegativeAccountBalanceException();
        } else if (this.acBalance < 1000) {
            throw new LowAccountBalanceException();
        }
    }

    void deposit(float amount){
        acBalance += amount;
    }

    @Override
    public String toString() {
        return "[ A/C: " + acNo + " ; A/C Balance: " + acBalance + " ]";
    }
}
