package Thuchanh.model;

public class Student {

    public int id;
    public String name;
    public Double theoryPoint;
    public Double practicePoint;

    public Student() {
    }

    public Student(int id, String name, Double theoryPoint, Double practicePoint) {
        this.id = id;
        this.name = name;
        this.theoryPoint = theoryPoint;
        this.practicePoint = practicePoint;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", theoryPoint=" + theoryPoint +
                ", practicePoint=" + practicePoint +
                '}';
    }
}

