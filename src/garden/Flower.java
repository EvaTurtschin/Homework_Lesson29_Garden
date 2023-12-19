package garden;

public class Flower extends Plant{
    public Flower (String name, int height, int age) {
        super(name, height, age);
    }
    public void doSpring(){
        height +=20;
        System.out.println(name+" is growing in Spring. Now it's height is "+ height);
    }
    public void doSummer(){
        System.out.println(name+" is not growing in Summer. It's blooming. Now it's height is " + height);
    }
    public void doAutumn(){
        height = 0;
        System.out.println(name+" is being cutting in Autumn. Now it's height is "+ height);
    }
}

