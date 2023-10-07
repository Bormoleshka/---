public class HotDrink extends Product {
    private final int temperature;

public HotDrink(String name, double cost, int volume, int temperature) {
    super (name, (int) cost, volume);
    this.temperature = temperature;
    this.volume = volume;
    this.name = name;
}

public String toString(){
    return "HotDrink{" +
            "name='" + super.getName() + "'" +
            ", cost=" + super.getCost() +
            ", volume=" + super.getVolume() +
            ", temperature=" + temperature +
            '}';
}
}
