package org.example.entity;

public class Texnologiya {
    private String name;

    public Texnologiya() {
    }

    public Texnologiya(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Texnologiya{" +
                "name='" + name + '\'' +
                '}';
    }
}
