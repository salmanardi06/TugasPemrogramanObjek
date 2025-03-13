public class XenditPayment {
    private String paymentMethod;

    public XenditPayment(String method) {
        this.paymentMethod = method;
    }

    public void makePayment(double amount) {
        if ("transfer".equals(this.paymentMethod)) {
            this.executeBankTransfer();
        } else if ("VA".equals(this.paymentMethod)) {
            this.processVirtualAccountPayment();
        }
    }

    private void executeBankTransfer() {
        System.out.println("Initiating bank transfer for the payment.");
    }

    private void processVirtualAccountPayment() {
        System.out.println("Initiating Virtual Account payment.");
    }
}
