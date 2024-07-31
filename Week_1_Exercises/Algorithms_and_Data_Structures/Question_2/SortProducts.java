import java.util.Arrays;

public class SortProducts {
    public static void sort(Product[] products) {
        Arrays.sort(products, (p1, p2) -> p1.getProductId().compareTo(p2.getProductId()));
    }
}
