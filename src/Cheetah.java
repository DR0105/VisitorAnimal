public class Cheetah implements Animal {
    private int weight;
    private int age;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Cheetah(int weight, int age) {
        this.weight = weight;
        this.age = age;
    }

    @Override
    public String accept(Visitor v) {
        return v.visit(this);
    }
}
