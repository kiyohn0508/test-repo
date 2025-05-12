public class ParentClass{
    int openYear = 1995;
    public ParentClass(){
        System.out.println("ParentClass construction");
    }
    private void parFun(){
        System.out.println("parFun()");
    }

    public void makeSandwich(){
        System.out.println(" -- makeSandwich -- ");
    }
}