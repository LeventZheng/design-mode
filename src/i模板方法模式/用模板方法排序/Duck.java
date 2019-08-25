package i模板方法模式.用模板方法排序;

public class Duck implements Comparable {
    String name;
    int weight;

    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String toString() {
        return name + " weight " + weight
    }
    @Override
    public int compareTo(Object object) {

        Duck otherDuck = (Duck)object;

        if (this.weight < otherDuck.weight) {
            return -1;
        } else if(this.weight == otherDuck.weight) {
            return 0;
        } else {
            return 1;
        }
    }
}
