public class BmiService {
    public int calculate(double height, double weight) {
        double y = height * height;
        double index= weight / y;
        return (int) index;
    }
}
