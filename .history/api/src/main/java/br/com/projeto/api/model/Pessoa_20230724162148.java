package br.com.projeto.api.model;

public class Pessoa {
    private String  name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    private int codigo;
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    private int age;
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
