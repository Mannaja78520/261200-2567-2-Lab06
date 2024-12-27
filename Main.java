public class Main {
    public static void main(String[] args){
        Cow wagyu = new Cow();
        Duck donald = new Duck("โดนัลด์");
        Duck daisy = new Duck("เดซี่");
        Pig burin = new Pig();
        Owl hedwig = new Owl();
        wagyu.sound();
        donald.sound();
        burin.sound();
        hedwig.sound();
        donald.clean(wagyu);
        daisy.clean(donald);
        PekingDuck jiaTongHeng = new PekingDuck("JTH");
        jiaTongHeng.clean(daisy);
        jiaTongHeng.fly();
        jiaTongHeng.beCrispy();

        donald.clean(new Cow());
        // donald.clean(new Cow());
        // donald.clean(new Cow());
        // donald.clean(new Cow());
    }
}