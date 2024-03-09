import java.util.Arrays;
import java.util.List;

class Stock {
    private String ticker;
    private double price;

    public Stock(String ticker, double price) {
        this.ticker = ticker;
        this.price = price;
    }

    public String getTicker() {
        return ticker;
    }

    public double getPrice() {
        return price;
    }
}

public class StockPricePractice {
    public static void main(String[] args) {
        // Create a list of stocks
        List<Stock> stocks = Arrays.asList(
                new Stock("AAPL", 150.25),
                new Stock("GOOGL", 2500.75),
                new Stock("MSFT", 300.50),
                new Stock("AMZN", 3500.00));

        // Use Streams to access stock prices and print ticker and price
        stocks.stream()
                .forEach(stock -> System.out.println(stock.getTicker() + ": $" + stock.getPrice()));
    }
}