package gr.uaeb.cf.ch11;

public class Account {
    private int id ;
    private String iban ;
    private  String firstName ;
    private String lastName ;
    private String ssn ;
    private double balance ;


    public Account(){

    }

    public Account(int id, String iban, String firstName, String lastName, String ssn, double balance) {
        this.id = id;
        this.iban = iban;
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Public API


    /**
     *
     * Deposits a certain amount of money
     *
     * @param amount -->the amount of money
     *
     * @throws Exception -->if the amount is negative
     */
    public void  deposit (double amount)throws Exception{
        try {
            if (amount < 0){
                throw new Exception("Negative amount exception");
            }

            balance += amount ;
        }catch (Exception e){
            e.printStackTrace();
        }
    }


    /**
     *withdraw an amount of moneay from an account . Validates if the SSN is correct
     * @param ssn
     *          thr social security number given by the user
     * @param amount
     *          the amount to be withdrawn
     * @throws Exception
     *          if the amount is grater than the balance, if the given ssn is different to the one that the instance has
     */
    public void withdraw (double amount , String ssn) throws Exception{
        try {
            if (!isSsnValid(ssn)){
                throw  new Exception("Ssn not valid Exception");
            }
            if (amount > balance){
                throw  new Exception("Insufficient balance exception");
            }
            balance -= amount;
        }catch (Exception e){
            e.printStackTrace();
            throw e;
        }
    }


    /**
     *
     * Returns the balance of the account .
     *
     * @return
     *      the acounts balance
     *
     */
    public double getAccountBalance(){
        return getBalance();
    }

    public String accountToString(){
        return "(" + id + "," + iban + "," + firstName + " ," + lastName + ", " + ssn + "," + balance + ")";
    }

    boolean isSsnValid(String ssn){
        return  this.ssn.equals(ssn);
    }
}
