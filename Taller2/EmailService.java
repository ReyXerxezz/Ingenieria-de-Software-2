public class EmailService {
    public void sendEmail(String email, Bill bill) {
        System.out.println("Sending bill to " + email);
        System.out.println(bill.billInfo());
    }

    public void sendBillDian(Bill bill) {
        System.out.println("Bill send " + bill.getId() + " to DIAN.");
    }
}
