import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class BillManager {

    public void generateBillReportCurrentMonth(List<Bill> bills) {
        LocalDate currentDate = LocalDate.now();
        List<Bill> currentMonthBills = bills.stream()
                .filter(bill -> bill.getDate().getMonth() == currentDate.getMonth())
                .toList();

        System.out.println("Generating Bill Report from current month...");
        for (Bill bill : currentMonthBills) {
            System.out.println(bill);
        }
    }
}
