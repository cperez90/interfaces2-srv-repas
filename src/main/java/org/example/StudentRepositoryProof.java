package org.example;

public class StudentRepositoryProof implements Repository{
    @Override
    public Student getStudent(String id) {
        return new Student(id,"Alumno Prueba");
    }

    @Override
    public void removeStudent(String id) {
        System.out.println("El alumano con el id: " + id + " ha sido eliminado.");
    }

    @Override
    public void addStudent(Student student) {
        System.out.println("Alumno añadido: " + student.getName());
    }

    @Override
    public void contractStudent(String id) {
        System.out.println("Alumno con el id: " + id + " ha sido lo que sea que haga esto.");
    }
}
