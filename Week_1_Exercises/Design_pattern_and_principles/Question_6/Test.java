public class Test {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("image1.jpg");
        Image image2 = new ProxyImage("image2.jpg");

        System.out.println("Displaying image1 first time:");
        image1.display();

        System.out.println("\nDisplaying image1 second time:");
        image1.display();

        System.out.println("\nDisplaying image2 first time:");
        image2.display();

        System.out.println("\nDisplaying image2 second time:");
        image2.display();
    }
}
