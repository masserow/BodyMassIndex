public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.74;// Рост в метрах
        double weight = 75;// Вес в килограммах
        int bmi = service.calculate(height, weight);
        System.out.println("Рост" + height + "м");
        System.out.println("Вес" + weight + "кг");
        System.out.println("Индекс массы тела" + bmi );
    }
}