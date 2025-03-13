public class BankTransferPayment extends Payment {
    private String bankAccountNumber;
    private String bankName;

    public BankTransferPayment(String customerId, String bankAccountNumber, String bankName) {
        super(customerId);
        this.bankAccountNumber = bankAccountNumber;
        this.bankName = bankName;
    }

    @Override
    public void makePayment(double amount) {
        System.out.println("Processing bank transfer of " + amount + " to account number " + bankAccountNumber + " at bank " + bankName);
    }
}
