package Collections.listInterFACE.ComparableandComparators;

public class Animal_comparable implements Comparable<Animal_comparable>{

    int age;
    String name;
    int weight;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public Animal_comparable(int age, String name, int weight) {
        this.age = age;
        this.name = name;
        this.weight=weight;
    }


    @Override
    public String toString() {
        return "Animal_comparable{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}'+"" +
                "\n";
    }

    @Override
    public int compareTo(Animal_comparable that) {
        if(this.age==that.age){
            return this.name.compareTo(that.name);
        }
        return this.age-that.age;
    }
}
