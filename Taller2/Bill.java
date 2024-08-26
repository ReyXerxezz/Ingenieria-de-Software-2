import java.time.LocalDate;

    public class Bill {
        private int id;
        private double total;
        private LocalDate date;

        public Bill(int id, double total) {
            this.id = id;
            this.total = total;
            this.date = LocalDate.now();
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

        @Override
        public String toString() {
            return "Bill{" +
                    "id=" + id +
                    ", total=" + total +
                    ", date=" + date +
                    '}';
        }
    }
}
