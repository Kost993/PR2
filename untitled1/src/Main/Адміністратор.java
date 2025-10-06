package Main;

public class Адміністратор {
    private int id;
    private String name;
    private String phone;
    private String shifts;
    private String accessLevel;

    public Адміністратор() {}

    public Адміністратор(int id, String name, String phone, String shifts, String accessLevel) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.shifts = shifts;
        this.accessLevel = accessLevel;
    }

    public void керуватиБронюваннями() {}

    @Override
    public String toString() {
        return "Адміністратор{" +
                "id=" + id +
                ", ПІБ='" + name + '\'' +
                ", телефон='" + phone + '\'' +
                ", зміни='" + shifts + '\'' +
                ", рівень доступу='" + accessLevel + '\'' +
                '}';
    }
}
