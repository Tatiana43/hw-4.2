public class BmiService {

public double calculate(int weight, double height) {

    double doubleHeight = height * height;
    double index = weight / doubleHeight;

    return index;
    }
}
