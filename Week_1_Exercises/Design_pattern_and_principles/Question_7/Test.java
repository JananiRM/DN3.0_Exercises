public class Test {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        Observer mobileApp = new MobileApp("Mobile App");
        Observer webApp = new WebApp("Web App");

        stockMarket.registerObserver(mobileApp);
        stockMarket.registerObserver(webApp);

        stockMarket.setStockPrice(150.75);
        stockMarket.setStockPrice(155.00);

        stockMarket.deregisterObserver(webApp);

        stockMarket.setStockPrice(160.50);
    }
}
