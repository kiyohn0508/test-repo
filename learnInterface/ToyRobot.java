package learnInterface;

public class ToyRobot implements Toy {
    @Override
    public void walk(){
        System.out.println("The robot can walk");
    }

    @Override
    public void run(){
        System.out.println("The robot can Run");
    }

    @Override
    public void alarm(){
        System.out.println("The robot has no alarm function.");
    }

    @Override
    public void light(){
        System.out.println("The robot has light function.");
    }
}