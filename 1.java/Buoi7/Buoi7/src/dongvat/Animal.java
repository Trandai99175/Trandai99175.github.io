package dongvat;

public class Animal {
    private String name;
    private String coler;

    public Animal() {
    }

    public void eat(){
        System.out.println ("animol eat" );
    }

    public Animal(String name, String coler) {
        this.name = name;
        this.coler = coler;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColer() {
        return coler;
    }

    public void setColer(String coler) {
        this.coler = coler;
    }
}
