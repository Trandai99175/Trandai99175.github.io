import Thuchanh.model.Student;
import Thuchanh.sevice.StudentSevice;

public class Main1 {
    public static void main(String[] args) {
        StudentSevice studentSevice =new StudentSevice ();
        Student student = studentSevice.createStudent ();
        System.out.println (" thông tin học viên:" );
        System.out.println (student );

    }
}
