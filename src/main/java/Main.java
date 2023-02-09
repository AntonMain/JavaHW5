public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();

        int inspected = 150;
        long actual = service.calculate(5000, true);
        System.out.println(inspected + "=== ? ===" + actual);
    }
}
