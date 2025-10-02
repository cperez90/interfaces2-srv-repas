package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() throws Exception {
        /*Repositorio repo = new StudentRepositoryProof();

        repo.addStudent(new Student("1","Juan"));
        Student s = repo.getStudent("1");
        System.out.println("Alumno: " + s.getName());
        repo.contractStudent("1");*/
        Repository repo = new DBStudentRepository();

        Student s1 = new Student("2","Cristian");
        repo.addStudent(s1);

        Student r1 = repo.getStudent("2");
        System.out.println("Alumno: " + r1);
    }
}
