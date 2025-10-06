package Main;

public class Звіт {
    private int id;
    private String type;
    private String period;
    private String content;

    public Звіт() {}

    public Звіт(int id, String type, String period, String content) {
        this.id = id;
        this.type = type;
        this.period = period;
        this.content = content;
    }

    public void згенерувати() {}

    @Override
    public String toString() {
        return "Звіт{" +
                "id=" + id +
                ", тип='" + type + '\'' +
                ", період='" + period + '\'' +
                ", зміст='" + content + '\'' +
                '}';
    }
}
