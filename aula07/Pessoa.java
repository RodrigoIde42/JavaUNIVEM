package aula07;

import javax.swing.JOptionPane;

public class Pessoa {
    
    private String name;
    private int age;
    private String phone;

    public Pessoa(String n, int i, String t){
        this.name = n;
        this.age = i;
        this.phone = t;
    }

    public void newPhone(String t){
        this.phone = t;
    }

    public void newPhone() {
        this.phone = JOptionPane.showInputDialog("New phone");
    }

    public String numberPhone() {
        return this.phone;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

}
