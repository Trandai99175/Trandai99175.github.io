package buiderdemo;

public class Persion {
    public String name;
    public int age;
    public String email;
    public String phone;
    public boolean isMarried;

    public Persion() {
    }

    public Persion(String name, int age, String email, String phone, boolean isMarried) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.phone = phone;
        this.isMarried = isMarried;
    }

    public static Persion buider(){
        return new Persion (  );
    }
    public Persion withName(String name){
        this.name = name;
        return this;
    }
    public Persion withAge(int age){
        this.age = age;
        return this;
    }
    public Persion withEmail(String email){
        this.email = email;
        return this;
    }
    public Persion withPhone(String phone){
        this.phone = phone;
        return this;
    }
    public Persion isMarried(boolean isMarried){
        this.isMarried = isMarried;
        return this;
    }


    public Persion build(){
        return new Persion ( name, age,email,phone,isMarried );

    }

    @Override
    public String toString() {
        return "Persion{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", isMarried=" + isMarried +
                '}';
    }
}
