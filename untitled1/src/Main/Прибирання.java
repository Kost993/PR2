package Main;

public class Прибирання {
    private int id;
    private Номер room;
    private String dateTime;
    private String status;
    private Працівник worker;

    public Прибирання() {}

    public Прибирання(int id, Номер room, String dateTime, String status, Працівник worker) {
        this.id = id;
        this.room = room;
        this.dateTime = dateTime;
        this.status = status;
        this.worker = worker;
    }

    public void змінитиСтатус() {}

    @Override
    public String toString() {
        return "Прибирання{" +
                "id=" + id +
                ", кімната=" + room +
                ", датаЧас='" + dateTime + '\'' +
                ", статус='" + status + '\'' +
                ", працівник=" + worker +
                '}';
    }
}
