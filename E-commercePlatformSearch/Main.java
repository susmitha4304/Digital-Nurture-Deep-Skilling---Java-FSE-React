public class Main {

    static class Product {
        int productId;
        String productName;
        String category;

        public Product(int productId, String productName, String category) {
            this.productId = productId;
            this.productName = productName;
            this.category = category;
        }

        @Override
        public String toString() {
            return "Product ID: " + productId +
                   ", Name: " + productName +
                   ", Category: " + category;
        }
    }

    public static Product linearSearch(Product[] products, int targetId) {
        for (Product product : products) {
            if (product.productId == targetId) {
                return product;
            }
        }
        return null;
    }

    public static Product binarySearch(Product[] products, int targetId) {
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (products[mid].productId == targetId) {
                return products[mid];
            }

            if (products[mid].productId < targetId) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return null;
    }

    public static void main(String[] args) {

        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Mobile", "Electronics"),
            new Product(103, "Shoes", "Fashion"),
            new Product(104, "Watch", "Accessories"),
            new Product(105, "Book", "Education")
        };

        int searchId = 104;

        Product linearResult = linearSearch(products, searchId);
        System.out.println("Linear Search Result:");
        if (linearResult != null)
            System.out.println(linearResult);
        else
            System.out.println("Product not found");

        Product binaryResult = binarySearch(products, searchId);
        System.out.println("\nBinary Search Result:");
        if (binaryResult != null)
            System.out.println(binaryResult);
        else
            System.out.println("Product not found");

        System.out.println("\nTime Complexity Analysis:");
        System.out.println("Linear Search  -> Best: O(1), Average: O(n), Worst: O(n)");
        System.out.println("Binary Search  -> Best: O(1), Average: O(log n), Worst: O(log n)");

        System.out.println("\nConclusion:");
        System.out.println("Binary Search is more efficient for large, sorted product datasets.");
    }
}
