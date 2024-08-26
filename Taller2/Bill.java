import java.time.LocalDate;

public class Bill {
    private int id;
    private double total;
    private LocalDate date;
    private Client client;

    public Bill(int id, double total, Client client) {
        this.id = id;
        this.total = total;
        this.date = LocalDate.now();
        this.client = client;
    }

    public int getId() {
        return id;
    }

    public double getTotal() {
        return total;
    }

    public LocalDate getDate() {
        return date;
    }

    public Client getClient() {
        return client;
    }

    public String billInfo() {
        return "Bill:" +
                "\nid = " + id +
                "\ntotal = " + total +
                "\ndate = " + date +
                "\nclient = " + client.getName() +
                " (" + client.getEmail() + ")" +
                '\n';
    }
}