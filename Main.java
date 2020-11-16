public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        double index = service.calculate(120, 1.8);
        System.out.println(index);
    }
}