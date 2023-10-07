

public class Product {
    String name;
    double cost;
    int volume;

    public Product(String name) {

        this.name=name;
    }
    public Product(double cost) {
        this.cost = cost;

    }

    public Product(int volume) {

        this.volume = volume;
    }

    public Product(String name, double cost, int volume, int count) {
    }

    public Product(String name, double cost, int volume) {
    }

    public double getCost() {
       return cost;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", cost=" + volume +
                '}';
    }





    protected int getVolume() {
        return volume;
    }
}

