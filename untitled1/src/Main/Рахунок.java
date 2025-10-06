package Main;

public class Рахунок {
    private int id;
    private Клієнт client;
    private String items;
    private double total;
    private String date;

    public Рахунок() {}

    public Рахунок(int id, Клієнт client, String items, double total, String date) {
        this.id = id;
        this.client = client;
        this.items = items;
        this.total = total;
        this.date = date;
    }

    public void додатиПослугу() {}
    public void сформуватиРахунок() {}

    @Override
    public String toString() {
        return "Рахунок{" +
                "id=" + id +
                ", клієнт=" + client +
                ", позиції='" + items + '\'' +
                ", сума=" + total +
                ", дата='" + date + '\'' +
                '}';
    }
}
