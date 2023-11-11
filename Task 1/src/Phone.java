public class Phone {
    static String madeCountry;
    String name;
    String model;
    String number;
    double weight;
    public Phone(){

    }

    public Phone(String model, String number, double weight) {
        this.model = model;
        this.number = number;
        this.weight = weight;
    }
    public void receiveCall(String name, String number){
        this.name = name;
        System.out.println("Вам звонит абонет по имени " + name + " номер " + number);
    }
}
