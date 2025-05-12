package learnInterface;

public class ToyAirplane implements Toy {
    @Override
    public void walk(){
        System.out.println("The airpalce can't walk");
    }

    @Override
    public void run(){
        System.out.println("The airpalce can't Run");
    }

    @Override
    public void alarm(){
        System.out.println("The airpalce has alarm function.");
    }

    @Override
    public void light(){
        System.out.println("The airpalce has light function.");
    }
} 