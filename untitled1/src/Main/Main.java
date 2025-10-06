package Main;

public class Main {
    public static void main(String[] args) {
        Клієнт client = new Клієнт(1, "Іван Іваненко", "ivan@example.com", "0991234567", "AA123456", "2 рази");
        Номер room = new Номер(101, "двомісний", 1200.0, "вільний");
        Бронювання booking = new Бронювання(1, client, "заброньовано");
        Оплата payment = new Оплата(1, 2400.0, "2025-10-06");
        Працівник worker = new Працівник(10, "Марія Коваль", "покоївка", "08:00–16:00", "0976543210", 15000.0);
        Послуга service = new Послуга("Сніданок", 1, "Комплексний сніданок", 250.0);
        Рахунок bill = new Рахунок(5, client, "бронювання + послуги", 2650.0, "2025-10-07");
        Адміністратор admin = new Адміністратор(2, "Олег Петров", "0981112233", "ранкова зміна", "повний");
        Прибирання cleaning = new Прибирання(3, room, "2025-10-08 10:00", "заплановано", worker);
        Звіт report = new Звіт(1, "фінансовий", "01.09.2025–30.09.2025", "Дохід: 150000 грн.");

        System.out.println(client);
        System.out.println(room);
        System.out.println(booking);
        System.out.println(payment);
        System.out.println(worker);
        System.out.println(service);
        System.out.println(bill);
        System.out.println(admin);
        System.out.println(cleaning);
        System.out.println(report);
    }
}
