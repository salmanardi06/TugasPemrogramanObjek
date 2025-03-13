public class Application {
    public static void main(String[] args) {
        PaypalPayment paypalPayment = new PaypalPayment("abc123", "paypalToken123", "user01");
        Payment generalPayment = new PaypalPayment("abc123", "paypalToken123", "user02");
        Payment cashPayment = new Payment("user03");

        paypalPayment.makePayment(15000);
        generalPayment.makePayment(15000);
        cashPayment.makePayment(15000);
    }
}
