public class PekingDuck extends Duck {
    PekingDuck(String name){
       super(name); 
    }

    @Override
    void clean(Animal animal){
        System.out.println("I'm not allowed to clean");
    }

    void beCrispy(){
        System.out.println("I'm crispy");
    }
}
