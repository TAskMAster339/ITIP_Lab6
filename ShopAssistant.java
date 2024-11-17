import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShopAssistant {
    private List<Product> soldGoods;
    private long totalSales = 0;
    private Map<String, Integer> frequency = new HashMap<>();

    ShopAssistant(int capacity){
        soldGoods = new ArrayList<>(capacity);
    }

    public void sell(String name, int cost){
        soldGoods.add(new Product(name, cost));
        calcTotalSales(cost);
        calcFrequency(name);
    }

    public void sell(Product product){
        soldGoods.add(product);
        calcTotalSales(product.getCost());
        calcFrequency(product.getName());
    }

    public List<Product> getSoldGoods(){
        return soldGoods;
    }

    public long getTotalSales(){
        return totalSales;
    }

    private void calcTotalSales(long cost){
        totalSales += cost;
    }

    private void calcFrequency(String prodName){
        frequency.put(prodName, frequency.getOrDefault(prodName, 0) + 1);
    }

    public void printInfo(){
        int count = 1;
        System.out.println("Sold goods");
        for (var i : soldGoods){
            System.out.println(count + ": " + i.getName() + " " + i.getCost() + "$");
            count += 1;
        }
    }
    public Product getMostPopularProduct(){
        String maxName = "";
        int maxFreq = -1;
        for (var key : frequency.keySet()){
            if (frequency.get(key) > maxFreq){
                maxFreq = frequency.get(key);
                maxName = key;
            }
        }
        if (maxFreq == -1){
            return null;
        }
        return new Product(maxName, maxFreq);
    }
}
