public class Payment {
    private String customerId;
    private String paymentId;
    private String paymentDate;
    private double amount;

    public Payment() {
        this.paymentId = generateUniqueId();
        this.paymentDate = generateCurrentDate();
    }

    public Payment(String customerId) {
        this.customerId = customerId;
        this.paymentId = generateUniqueId();
        this.paymentDate = generateCurrentDate();
    }

    public Payment(String customerId, double amount) {
        this.customerId = customerId;
        this.amount = amount;
        this.paymentId = generateUniqueId();
        this.paymentDate = generateCurrentDate();
    }

    public Payment(String customerId, double amount, String paymentId) {
        this.customerId = customerId;
        this.amount = amount;
        this.paymentId = paymentId;
        this.paymentDate = generateCurrentDate();
    }

    private String generateUniqueId() {
        return "XYZ12345"; 
    }

    private String generateCurrentDate() {
        return "2025-03-10"; 
    }

    public void makePayment(double amount) {
        System.out.println("Processing payment of " + amount + " for customer ID: " + this.customerId);
    }

    public void showPaymentDetails() {
        System.out.println("Payment ID: " + this.paymentId);
        System.out.println("Payment Date: " + this.paymentDate);
        System.out.println("Amount: " + this.amount);
        System.out.println("Customer ID: " + this.customerId);
    }
}
