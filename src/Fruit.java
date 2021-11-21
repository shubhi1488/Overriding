/*Create a base class Fruit which has name, taste, size as its attributes. A method called eat()
is created which describes the name of the fruit and its taste. Inherit the same class in 2 other classes
Apple and orange nd override the eat() method to represent each fruit taste.
 */
public class Fruit {
    String name;
    String taste;
    String size;

    public Fruit(String n, String t, String s) {
        this.name = n;
        this.taste = t;
        this.size = s;
    }
    void eat(){
        System.out.println(name+" : "+taste);
    }

    public static void main(String[] args) {
        Fruit a = new Apple("Apple", "sweet", "Smaller");
        Fruit o=new Orange("Orange","sour","medium");
        a.eat();
        o.eat();
    }
}
class Apple extends Fruit{
    public Apple(String n, String t, String s) {
        super(n, t, s);
    }
}
class Orange extends Fruit{
    public Orange(String n, String t, String s) {
        super(n, t, s);
    }
}


