package cn.griouges.learn.design.pattern.template;

/**
 * @author Liar
 */
public class Foods implements Comparable {
    private String name;
    private int weight;
    
    @Override
    public String toString() {
        return "Foods{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
    
    public Foods(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }
    
    @Override
    public int compareTo(Object o) {
        return Integer.compare(weight, ((Foods) o).getWeight());
    }
    
    public int getWeight() {
        return weight;
    }
    
}