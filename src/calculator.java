public class calculator {
    public static void main(String args[]) {
        double price = 490;
        double tax = 0.03;
        int quantity = 2;
        double total = 0;

        String message = "I want to buy " + quantity + " shirts!";
        System.out.println(message);

        total = price * quantity + tax * price * quantity;
        System.out.println("Total cost with tax is: " + total);
    }
}
