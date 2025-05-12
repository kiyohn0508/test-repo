public class ChildClass extends ParentClass {
    int openYear = 2020;
    public ChildClass(){
        System.out.println("ChildClass construction");
    }
    public void childFun(){
        System.out.println("childFun");
    }

    @Override
    public void makeSandwich(){
        System.out.println(" -- more delicious makeSandwich -- ");
    }

    public void getOpenYear(){
        System.out.println("ChildClass's open year :" + this.openYear);
        System.out.println("ParentClass's open year :" + super.openYear);
    }
    public void method(){
        System.out.println("-- method -- ");
    }
}