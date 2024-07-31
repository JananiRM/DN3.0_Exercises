import java.util.Arrays;

public class BinarySearch {
    public static Product search(Product[] products, String targetId) {
        int low = 0;
        int high = products.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int cmp = products[mid].getProductId().compareTo(targetId);
            if (cmp < 0) {
                low = mid + 1;
            } else if (cmp > 0) {
                high = mid - 1;
            } else {
                return products[mid];
            }
        }
        return null;
    }
}
