public class CashPayment extends Payment {
    private String adminId;
    private String branchId;

    public CashPayment(String adminId, String branchId, String customerId) {
        super(customerId);
        this.adminId = adminId;
        this.branchId = branchId;
    }

    @Override
    public void makePayment(double amount) {
        System.out.println("Payment of " + amount + " made in cash at branch " + branchId + " by admin " + adminId);
    }
}
