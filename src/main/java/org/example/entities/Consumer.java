package org.example.entities;

public class Consumer {
    public String name;
    public ConsumerType authType;

    public Consumer(String name, ConsumerType authType) {
        this.name = name;
        this.authType = authType;
    }
}
