package Main;

public class Оплата {
    private int id;
    private double amount;
    private String date;

    public Оплата() {}

    public Оплата(int id, double amount, String date) {
        this.id = id;
        this.amount = amount;
        this.date = date;
    }

    public void зробитиОплату() {}

    @Override
    public String toString() {
        return "Оплата{" +
                "id=" + id +
                ", сума=" + amount +
                ", дата='" + date + '\'' +
                '}';
    }
}
