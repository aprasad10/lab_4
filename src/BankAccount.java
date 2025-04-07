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
     * Initializes the bank balance and statement as 0 or null
     */
    public BankAccount() {
        this.accountBalance = 0;
        this.statement = new StringBuilder();
    }
    /** Description : Sets the bank balance with the given amount
     * @param  i : the initial bank balance before any transactions are made.
     *
     */
    public BankAccount(int i) {
        this.accountBalance = i;
        this.statement = new StringBuilder();
    }
    
    /**
     * Method to deposit a specified amount into bank account, recording it in the transaction statement
     * @param amount : amount to be deposited into the account.
     */
    public void deposit(int amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive.");
            return;
        }
        this.accountBalance += amount;
        statement.append("Deposited: " + amount + " on " + Calendar.getInstance().getTime() + "\n");
    }
    /**
     * Method to withdraw a specified amount into bank account, recording it in the transaction statement
     * @param amount : amount to be withdrawn from the balance.
     */
    public void withdraw(int amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
            return;
        }
        if (amount > this.accountBalance) {
            System.out.println("Insufficient funds.");
            return;
        }
        this.accountBalance -= amount;
        statement.append("Withdrawn: " + amount + " on " + Calendar.getInstance().getTime() + "\n");
    }


    /** Description : Method to get the balance from the bank account.
     * @return : current bank balance.
     */

    public int getBalance(){
        return this.accountBalance;
    }

    /**
     * Description : Method that returns all the transaction history of the associated account.
     */

    public String getStatement(){
        return  ("Transaction History: \n" +
                this.statement +
                "************************************* \n \n"+
                "The total balance on this account is: " + this.accountBalance);
    }


}