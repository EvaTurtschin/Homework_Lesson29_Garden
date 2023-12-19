package garden;

public class Tree extends Plant{
    public Tree (String name, int height, int age){
        super(name,height, age);
    }
    public void doSpring(){
        height +=25;
        System.out.println(name+" is growing in Spring. Now it's height is "+ height);
    }
    public void doSummer(){
        height +=25;
        System.out.println(name+" is growing in Summer. Now it's height is "+height);
    }
    public void doAutumn(){
        System.out.println(name+" is not growing in Autumn. Now it's height is " + height);
    }
}
