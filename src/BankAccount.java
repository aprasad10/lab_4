import java.util.Calendar;
/**
 * Lab 4
 * BankAccount class conductors and methods to deposit, withdraw, see the balance and transactions
 * @author Ashley Prasad (initialize account balance conductor, deposit method, withdraw method)
 * @author Shriyash Ghimire (set account balance conductor, get balance method, get statement method)
 * @since [edit later]
 */
public class BankAccount {
    private int accountNumber;
    private int accountBalance;
    private StringBuilder statement;

    /**
     * Method to initialize account balance and statement
     */
    public BankAccount() {
        this.accountBalance = 0;
        this.statement = new StringBuilder();
    }

    // Overloaded Constructor Here

    /**
     * Method to deposit a specified amount into bank account, recording it in the transaction statement
     * @param accountBalance
     */
    public void deposit(int accountBalance) {
        if (accountBalance > 0) {
            this.accountBalance += accountBalance;
        }
        else {
            this.accountBalance -= accountBalance;
        }
        this.statement.append("Deposited: " + accountBalance + " on " + Calendar.getInstance().getTime() + "\n");
    }
    /**
     * Method to withdraw a specified amount into bank account, recording it in the transaction statement
     * @param accountBalance
     */
    public void withdraw(int accountBalance) {
        if (accountBalance > 0) {
            this.accountBalance -= accountBalance;
        }
        else {
            this.accountBalance += accountBalance;
        }
        this.statement.append("Withdrawn: " + accountBalance + " on " + Calendar.getInstance().getTime() + "\n");
    }

    // getBalance, getStatement Methods here

}