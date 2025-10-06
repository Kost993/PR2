package Main;

public class Клієнт {
    private int id;
    private String name;
    private String email;
    private String phone;
    private String passport;
    private String history;

    public Клієнт() {}

    public Клієнт(int id, String name, String email, String phone, String passport, String history) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.passport = passport;
        this.history = history;
    }

    public void бронюватиНомер() {}
    public void оплатити() {}

    @Override
    public String toString() {
        return "Клієнт{" +
                "id=" + id +
                ", ПІБ='" + name + '\'' +
                ", email='" + email + '\'' +
                ", телефон='" + phone + '\'' +
                ", паспорт='" + passport + '\'' +
                ", історія='" + history + '\'' +
                '}';
    }
}
