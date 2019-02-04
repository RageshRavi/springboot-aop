package com.rag.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by Ragesh on 2/3/2019.
 */

public class Person {

    public String name;
    private String ssn;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", ssn='" + ssn + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
