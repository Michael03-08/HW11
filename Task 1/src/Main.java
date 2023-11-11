public class Main {
    public static void main(String[] args) {

        Phone nokia = new Phone("Nokia", "555", 136.5);
        Phone.madeCountry = "China";
        System.out.println("Телефон " + nokia.model + " номер " + nokia.number + " весом "
                + nokia.weight + "\nСтрана произподитель " + Phone.madeCountry );

        Phone xiaomi = new Phone("Xiaomi", "487", 178.4);
        System.out.println("Телефон " + xiaomi.model + " номер " + xiaomi.number + " весом "
                + xiaomi.weight + "\nСтрана произподитель " + Phone.madeCountry);

        nokia.receiveCall("Александр", "14553");
    }
}
