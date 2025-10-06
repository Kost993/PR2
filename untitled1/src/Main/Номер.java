package Main;

public class Номер {
    private int id;
    private String type;
    private double pricePerDay;
    private String status;

    public Номер() {}

    public Номер(int id, String type, double pricePerDay, String status) {
        this.id = id;
        this.type = type;
        this.pricePerDay = pricePerDay;
        this.status = status;
    }

    public void змінитиСтатус() {}

    @Override
    public String toString() {
        return "Номер{" +
                "id=" + id +
                ", тип='" + type + '\'' +
                ", цінаЗаДень=" + pricePerDay +
                ", статус='" + status + '\'' +
                '}';
    }
}
