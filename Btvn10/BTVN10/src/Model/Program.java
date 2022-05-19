package Model;
import Sevice.ProgramSevice;

import java.util.ArrayList;

public class Program extends ArrayList<Program> {
    private  String username;
    private String email;
    private int password;
    public Program(String email, String password) {
    }
    public Program(String username, String email, int password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }
    public Program(ProgramSevice programSevice) {
    }
    public Program() {

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPassword() {
        return this.password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Program{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password=" + password +
                '}';
    }
}
