public class ObjectEx {
    int x;
    int y;

    public ObjectEx(String s, int[] i) {
        System.out.println("UserDefined constructor");

        System.out.println(s);
        System.out.println(i[0]);
    }

    public ObjectEx(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void getInfo(){
        System.out.println("x --> "+this.x);
        System.out.println("y --> "+this.y);
    }
}
