package learnInterface;

public class MainClass {
    public static void main(String[] args) {
        Toy robot = new ToyRobot();
        Toy airplane = new ToyAirplane();

        Toy[] arr = {robot, airplane};

        for (int i = 0 ;i < 2; i++){
            arr[i].walk();
            arr[i].run();
            arr[i].alarm();
            arr[i].light();
        }

    }
}
