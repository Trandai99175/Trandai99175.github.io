public class Method {
    public Method() {
    }

    public static void main(String[] args) {
        Method m = new Method();
        m.sayWithName("Thông số BMI");
        m.sayWithName("Cân nặng 85kg");
        m.sayWithName("Chiều cao 1.75m");
        float data = m.bmi(85f, 1.75f);
        m.sayWithName("Chỉ số BMI:");
        System.out.println(data);
    }


    public void sayWithName(String name) {
        System.out.println( name);
    }

    public float bmi(float a, float b) {
        return a/b/ b;
    }
}
