public class AnimalTransportation implements Visitor {

    @Override
    public String visit(Cheetah c) {
        return "It is transported by land";
    }

    @Override
    public String visit(Dolphin d) {
        return "It is transported by sea.";
    }

    @Override
    public String visit(Raven r) {
        return "It is transported by air.";
    }

    @Override
    public String visit(Mole m) {
        return "It is transported under the ground.";
    }
}
