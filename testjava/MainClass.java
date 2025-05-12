
public class MainClass{
    public static void main(String[] args){
        String str = "JAVA";
        System.out.println("str :"+str);
        str = str+ "_8";
        System.out.println("str :"+str);

        StringBuffer stb = new StringBuffer("JAVA");
        System.out.println("str :"+stb);
        stb.append(" world");
        System.out.println("str :"+stb);
        System.out.println("str.length :"+stb.length());
        stb.insert(1, "!!!");
        System.out.println("str :"+stb);

        stb.delete(1, 3);
        System.out.println("str :"+stb);
    }
}