public class Main {
    public static void main(String[] args) {
        BonusMilesService ser = new BonusMilesService();
        int price = 7_876;
        int miles = ser.calculate(price);
        System.out.println(miles);
    }
}