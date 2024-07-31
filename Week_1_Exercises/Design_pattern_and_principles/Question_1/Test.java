public class Test {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        if (logger1 == logger2) {
            System.out.println("Logger1 and Logger2 are the same instance. Only one instance of Logger is created");
        } else {
            System.out.println("Logger1 and Logger2 are different instances.");
        }
    }
}
