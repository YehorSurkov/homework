package lesson14.coockable;

public class Food implements Cookable {
    
    public void prepare(Cookable c){
        c.cook();
    }
    
    @Override
    public void cook() {
        System.out.println("Cook!");
    }
}
