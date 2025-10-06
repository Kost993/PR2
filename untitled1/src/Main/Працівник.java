package Main;

public class Працівник {
    private int id;
    private String name;
    private String position;
    private String schedule;
    private String phone;
    private double salary;

    public Працівник() {}

    public Працівник(int id, String name, String position, String schedule, String phone, double salary) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.schedule = schedule;
        this.phone = phone;
        this.salary = salary;
    }

    public void виконатиЗавдання() {}

    @Override
    public String toString() {
        return "Працівник{" +
                "id=" + id +
                ", ПІБ='" + name + '\'' +
                ", посада='" + position + '\'' +
                ", графік='" + schedule + '\'' +
                ", телефон='" + phone + '\'' +
                ", зарплата=" + salary +
                '}';
    }
}
