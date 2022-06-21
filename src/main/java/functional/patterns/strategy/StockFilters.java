package functional.patterns.strategy;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class StockFilters {

    private StockFilters() {
    }

    public static List<Stock> bySymbol(List<Stock> list, String symbol) {
        List<Stock> filteredData = new ArrayList<>();
        for (Stock stock : list) {
            if (stock.getCompany().equals(symbol)) {
                filteredData.add(stock);
            }
        }
        return filteredData;
    }

    public static List<Stock> byPrice(List<Stock> list, double price) {
        List<Stock> filteredData = new ArrayList<>();
        for (Stock stock : list) {
            if (stock.getPrice() == price) {
                filteredData.add(stock);
            }
        }
        return filteredData;
    }

    public static List<Stock> filter(List<Stock> list, Predicate<Stock> predicate){
        List<Stock> filteredData = new ArrayList<>();
        for (Stock stock : list) {
            if (predicate.test(stock)) {
                filteredData.add(stock);
            }
        }
        return filteredData;
    }

}
