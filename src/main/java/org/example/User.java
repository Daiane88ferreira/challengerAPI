package org.example;

public class User {

    private String name;
    private String job;

    // Construtor sem argumentos (necessário para algumas bibliotecas de serialização/deserialização)
    public User() {
    }

    // Construtor com argumentos
    public User(String name, String job) {
        this.name = name;
        this.job = job;
    }

    // Getters e Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}
