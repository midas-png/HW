package src;
//поля: serialNumber, model, weight
//методы: вывод, receiveCall(String name), getNumber
//конструктор: для всех параметров, для number и model
//Классы: BabushkaPhone, SmartPhone
//метод sendMessage для SmartPhone
//переопределить метод receiveCall для бабушкафона
//придумать и добавить по 3поля для BabushkaPhone, SmartPhone
//также по 1 методу
//создать объекты всех классов и повзаимодействовать
public class Phone {
    private String serialNumber;
    private String model;
    private int weight;

    public Phone(String serialNumber, String model, int weight){
        this.serialNumber = serialNumber;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String model, int weight){
        this.model = model;
        this.weight = weight;
    }

    public String receiveCall(String name){
        return name + " звонит";
    }

    public String getNumber(){
        return (serialNumber != null) ? this.serialNumber : "None SIM-Card";
    }

    static class BabushkaPhone{
        private int yearMade;
        private String phoneNumber;
        private String color;

        public BabushkaPhone(int yearMade, String phoneNumber, String color){
            this.yearMade = yearMade;
            this.phoneNumber = phoneNumber;
            this.color = color;
        }

        public static String receiveCall(String name, boolean gender){
            return isMale(gender) + name + " звонит";
        }

        public static String isMale(boolean gender){
            return (gender == true) ? "Внучок " : "Внучка ";
        }
    }

    static class SmartPhone{
        private int yearMade;
        private String phoneNumber;
        private static String userName;

        public SmartPhone(int yearMade, String phoneNumber, String userName){
            this.yearMade = yearMade;
            this.phoneNumber = phoneNumber;
            this.userName = userName;
        }

        public static String sendMessage(String name, String text){
            return "Message sent to " + name + "\n" + "Text: " + text + "\nBy " + getName();
        }

        public static String getName(){
            return userName;
        }
    }
}
