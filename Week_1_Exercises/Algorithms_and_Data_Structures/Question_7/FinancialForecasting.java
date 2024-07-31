public class FinancialForecasting {

    public double calculateFutureValue(double initialValue, double growthRate, int years) {
        if (years == 0) {
            return initialValue;
        } else {
            return (1 + growthRate) * calculateFutureValue(initialValue, growthRate, years - 1);
        }
    }
	public static void main(String[] args) {
        	FinancialForecasting forecasting = new FinancialForecasting();
        	double initialValue = 1000.0;
        	double growthRate = 0.05; 
        	int years = 5; 

        	double futureValue = forecasting.calculateFutureValue(initialValue, growthRate, years);
        	System.out.println("Future value after " + years + " years: $" + futureValue);
    }
}
