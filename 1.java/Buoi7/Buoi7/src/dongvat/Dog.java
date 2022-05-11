package dongvat;

public class Dog extends Animal{
    private int legs;

    public Dog() {
    }

    public Dog(String name, String coler, int legs) {
        super (name, coler);
        this.legs = legs;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    @Override
    public void eat() {
        super.eat ( );
    }

    @Override
    public String toString() {
//        return "Dog{" +
//                "legs=" + legs +
//                '}';

        return "name:"+super.getName ()+"  coler:"+ super.getColer ();
    }
}
