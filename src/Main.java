import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> list = new ArrayList<Animal>();
        list.add(new Cheetah(70, 5));
        list.add(new Dolphin(120, 20));
        list.add(new Raven(2, 12));
        list.add(new Mole(0.5, 3));
        AnimalTransportation animalTransportation = new AnimalTransportation();
        for(Animal a : list) {
            System.out.println(a.accept(animalTransportation));
        }
    }
}