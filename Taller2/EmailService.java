public class EmailService {
    public void sendEmailBill(Bill bill, Client client) {
        System.out.println("Email send to client " + client.getName() + " with all the bill details: " + bill);
    }

    public void sendBillDian(Bill bill) {
        System.out.println("Bill send " + bill.getId() + " to DIAN.");
    }
}
