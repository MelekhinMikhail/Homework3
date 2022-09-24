public class Task6 {
    public static void main(String[] args) {
        int bananas = 5 * 80;
        int milk = 2 * 105;
        int iceCream = 2 * 100;
        int eggs = 4 * 70;
        int grams = bananas + milk + iceCream + eggs;
        float kg = grams / 1000f;
        System.out.println("Вес такого завтрака равен " + grams + " грамм или " + kg + " килограммов");
    }
}
