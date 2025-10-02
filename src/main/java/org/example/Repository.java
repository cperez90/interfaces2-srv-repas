package org.example;

public interface Repository {
    Student getStudent(String id);
    void removeStudent(String id);
    void addStudent(Student student);
    void contractStudent(String id);
}
