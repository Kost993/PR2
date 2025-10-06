package Main;

public class Послуга {
    private String name;
    private int id;
    private String description;
    private double price;

    public Послуга() {}

    public Послуга(String name, int id, String description, double price) {
        this.name = name;
        this.id = id;
        this.description = description;
        this.price = price;
    }

    public void надатиПослугу() {}

    @Override
    public String toString() {
        return "Послуга{" +
                "назва='" + name + '\'' +
                ", id=" + id +
                ", опис='" + description + '\'' +
                ", вартість=" + price +
                '}';
    }
}
