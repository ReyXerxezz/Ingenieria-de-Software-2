import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Bill> bills = new ArrayList<>();
        Client client = null;
        EmailService emailService = new EmailService();
        BillManager billManager = new BillManager();
        boolean continuar = true;

        while (continuar) {
            System.out.println("Select an option:");
            System.out.println("1. Create a client");
            System.out.println("2. Create a bill");
            System.out.println("3. Send bill");
            System.out.println("4. Generate current month report");
            System.out.println("5. Exit");
            System.out.print("Option: ");

            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Type the client ID: ");
                    int clientId = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Type the client name: ");
                    String nameClient = scanner.nextLine();

                    System.out.print("Type the client email: ");
                    String emailClient = scanner.nextLine();

                    client = new Client(clientId, nameClient, emailClient);
                    System.out.println("Your client was successfully made.\n");
                    break;

                case 2:

                    if (client == null) {
                        System.out.println("You need a client first.\n");
                    } else {
                        System.out.print("Type the total of your bill: ");
                        double total = scanner.nextDouble();
                        Bill bill = new Bill(bills.size() + 1, total);
                        bills.add(bill);
                        System.out.println("Your bill was successfully made.\n");
                    }
                    break;

                case 3:

                    if (bills.isEmpty()) {
                        System.out.println("There are no bills.\n");
                    } else if (client == null) {
                        System.out.println("You need a client first.\n");
                    } else {
                        for (Bill bill : bills) {
                            emailService.sendEmailBill(bill, client);
                            emailService.sendBillDian(bill);
                        }
                            System.out.println("All the bills were successfully send.\n");
                    }
                    break;

                case 4:

                    if (bills.isEmpty()) {
                        System.out.println("There are no bill to generate a report.\n");
                    } else {
                        billManager.generateBillReportCurrentMonth(bills);
                    }
                    break;

                case 5:

                    continuar = false;
                    System.out.println("Exiting the program...");
                    break;

                default:
                    System.out.println("Invalid option.\n");
                    break;
            }
        }

        scanner.close();
    }
}
