package src;


public class Appl {
    public static void main(String[] args) {
/*        Задача 1
        Phone p = new Phone("231231324", "2", 2);
        Phone.SmartPhone s = new Phone.SmartPhone(2020, "1214212", "Aaron");
        Phone.BabushkaPhone b = new Phone.BabushkaPhone(1987, "1231241","red");
        System.out.println(p.getNumber());
        System.out.println(p.receiveCall("Alan"));
        System.out.println(s.getName());
        System.out.println(s.sendMessage("Igor", "Sup"));
        System.out.println(b.receiveCall("Vadim",true));
 ____________________Задача 2______________________
        double[][] matrix = {{2, 3, 4}, {3, 2, 7}};
        Matrix m = new Matrix(matrix);
        m.multiply(2);
        m.print();
        System.out.println("__________________________");
        m.multiplyMatrix(matrix);
        m.print();
        System.out.println("__________________________");
        m.mulitplyMatrixSecond(matrix);
____________________Задача 3_______________________

____________________Задача 4_______________________

*/
        String[] matrix = {"a", "b"};
        HubList<String> youList = new HubList<String>(matrix);
        youList.add("d");
        youList.removeAt(0);
        System.out.println(youList.find("b"));
        youList.sort();

    }
}
