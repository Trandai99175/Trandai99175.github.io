package thuchanh1;

public class Student {
    private int id;
    private double pont;
    private int age;
    private String email;

    public Student() {
    }

    public Student(int id, double pont, int age, String email) {
        this.id = id;
        this.pont = pont;
        this.age = age;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPont() {
        return pont;
    }

    public void setPont(double pont) {
        if (pont>10 & pont<0){
            System.out.println (" Điểm đang nhập sai:" );}
        this.pont = pont;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        if (age<18){
            System.out.println ("tuổi phải nhập lơn >=18:" );
        }
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", pont=" + pont +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}
