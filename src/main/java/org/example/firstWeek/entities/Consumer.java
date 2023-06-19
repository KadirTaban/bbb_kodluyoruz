package org.example.firstWeek.entities;

import org.example.firstWeek.entities.enums.ConsumerType;

public class Consumer {
    public String name;
    public ConsumerType authType;

    public Consumer(String name, ConsumerType authType) {
        this.name = name;
        this.authType = authType;
    }
}
