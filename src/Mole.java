public class Mole implements Animal{
    private double weight;
    private int age;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Mole(double weight, int age) {
        this.weight = weight;
        this.age = age;
    }

    @Override
    public String accept(Visitor v) {
        return v.visit(this);
    }
}
