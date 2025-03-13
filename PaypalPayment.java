public class PaypalPayment extends Payment {
    private String paypalToken;
    private String paypalAccountId;

    // Konstruktor yang menerima 3 parameter
    public PaypalPayment(String token, String accountId, String customerId) {
        super(customerId);  // Memanggil konstruktor kelas Payment
        this.paypalToken = token;
        this.paypalAccountId = accountId;
    }

    @Override
    public void makePayment(double amount) {
        System.out.println("Using PayPal API with token " + paypalToken + " to process payment of " + amount + " to account: " + paypalAccountId);
    }
}
