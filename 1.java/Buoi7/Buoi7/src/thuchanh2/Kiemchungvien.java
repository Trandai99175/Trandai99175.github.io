package thuchanh2;

public class Kiemchungvien extends Laptrinhvien {
    private int error;

    public Kiemchungvien(int error) {
        this.error = error;
    }

    public Kiemchungvien(int id, String name, int age, String phone, String email, int salaryBasic, int error) {
        super (id, name, age, phone, email, salaryBasic);
        this.error = error;
    }

    public int getError() {
        return error;
    }

    @Override
    public String toString() {
        return "Kiemchungvien{" +
                "error=" + error +
                '}';
    }

    public void setError(int error) {
        this.error = error;
    }
}
