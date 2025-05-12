
public class MainClass{
    public static void main(String[] args){
        new ChildClass() {
            @Override
            public void method(){
                System.out.println("methold");
            };
        }.method();
    }
}