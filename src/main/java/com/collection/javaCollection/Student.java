package com.collection.javaCollection;

import java.util.Objects;

public class Student {
    String name;
    int rollNumber ;

    Student(String name, int rollNumber){
        this.name = name;
        this.rollNumber = rollNumber;
    }

    @Override
    public String toString() {
        return "{" +
                "rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNumber == student.rollNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(rollNumber);
    }
}
