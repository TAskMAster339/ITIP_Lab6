public class Product{
    private String name;
    private int cost;

    public Product(String name, int cost){
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }
    public int getCost(){
        return cost;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setCost(int cost){
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Product: " + name + " with cost " + cost;
    }
}