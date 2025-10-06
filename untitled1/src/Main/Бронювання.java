package Main;

public class Бронювання {
    private int id;
    private Клієнт client;
    private String status;

    public Бронювання() {}

    public Бронювання(int id, Клієнт client, String status) {
        this.id = id;
        this.client = client;
        this.status = status;
    }

    public void скасувати() {}
    public void підтвердити() {}

    @Override
    public String toString() {
        return "Бронювання{" +
                "id=" + id +
                ", клієнт=" + client +
                ", статус='" + status + '\'' +
                '}';
    }
}
