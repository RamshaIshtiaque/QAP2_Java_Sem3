public class App {
    public static void main(String[] args) throws Exception {
        Money money = new Money(2.50);
        int compareToValue = money.compareTo(new Money(0.1));
        System.out.println("Compare To func: " + compareToValue);
    }
}
