import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>(10);
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        System.out.println(stack.pop());
//        System.out.println(stack.peek());
//        stack.push(4);
//        System.out.println(stack.pop());

        ShopAssistant sa = new ShopAssistant(10);
        sa.sell("apple", 50);
        sa.sell("pineapple", 100);
        sa.sell("apple", 25);
        sa.sell("banana", 777);
        sa.sell("glasses", 123);

        sa.printInfo();

        System.out.println(sa.getTotalSales());
        System.out.println(sa.getMostPopularProduct());
    }
}
