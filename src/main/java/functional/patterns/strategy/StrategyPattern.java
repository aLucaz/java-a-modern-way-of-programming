package functional.patterns.strategy;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class StrategyPattern {
    public static void main(String[] args) {
        List<Stock> stocks = new ArrayList<>();
        stocks.add(new Stock("AAPL", 218.04, 10));
        stocks.add(new Stock("AMZ", 452.24, 5));
        stocks.add(new Stock("GOOGL", 132.24, 50));

        StockFilters.bySymbol(stocks, "AAPL").forEach(stock -> log.info(String.valueOf(stock)));
        StockFilters.byPrice(stocks, 452.24).forEach(stock -> log.info(String.valueOf(stock)));

        StockFilters.filter(stocks, stock -> stock.getCompany().equals("AAPL")).forEach(stock -> log.info(String.valueOf(stock)));
        StockFilters.filter(stocks, stock -> stock.getPrice() == 132.24).forEach(stock -> log.info(String.valueOf(stock)));
    }
}

