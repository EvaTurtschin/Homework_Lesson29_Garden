package garden;

public abstract class Plant {
    String name;
    int height;
    int age;
    public Plant (String name, int height, int age) {
        this.name = name;
        this.height = height;
        this.age = age;
    }
    public void growPlantDuringPastYears(int pastYears){
        for (int year=1; year<=pastYears; year++){
            System.out.println(name+"'s growing in "+year+" year:");
            doSpring();
            doSummer();
            doAutumn();
            doWinter();
        }
    }
    public abstract void doSpring( );
    public abstract void doSummer();
    public abstract void doAutumn();
    public void doWinter(){
        System.out.println(name+" is not growing in Winter. Now it's height is "+ height);    }
    public void measureHeight(int pastYears) {
        System.out.println("Past "+pastYears+" years "+name+"'s height to the end of season is "+height);
    }

}
