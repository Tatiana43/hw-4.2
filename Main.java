public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        int weight = 120;
        double height = 1.8;
        double doubleHeight = height * height;
        double index = weight / doubleHeight;
        double indx = service.calculate(index);
        System.out.println(indx);
    }
}