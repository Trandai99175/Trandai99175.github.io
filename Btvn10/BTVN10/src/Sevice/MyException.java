package Sevice;

import java.util.Objects;

public final class MyException extends Throwable {
    private final String email_khong_dung_dinh_dang;

    public MyException(String email_khong_dung_dinh_dang) {
        this.email_khong_dung_dinh_dang = email_khong_dung_dinh_dang;
    }

    public String email_khong_dung_dinh_dang() {
        return email_khong_dung_dinh_dang;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass ( ) != this.getClass ( )) return false;
        var that = (MyException) obj;
        return Objects.equals (this.email_khong_dung_dinh_dang, that.email_khong_dung_dinh_dang);
    }

    @Override
    public int hashCode() {
        return Objects.hash (email_khong_dung_dinh_dang);
    }

    @Override
    public String toString() {
        return "MyException[" +
                "email_khong_dung_dinh_dang=" + email_khong_dung_dinh_dang + ']';
    }

}
