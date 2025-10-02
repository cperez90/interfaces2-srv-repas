package org.example;

import java.sql.*;

public class DBStudentRepository implements Repository{
    private Connection con;

    public DBStudentRepository() throws SQLException {
        String url = "jdbc:mariadb://100.74.167.64:3316/bolsa";
        String user = "root";
        String password = "root";
        con = DriverManager.getConnection(url,user,password);
    }

    @Override
    public Student getStudent(String id) {
        try {
            PreparedStatement ps = con.prepareStatement("SELECT * from Student where id = ?");
            ps.setString(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new Student(rs.getString("id"), rs.getString("name"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    @Override
    public void removeStudent(String id) {
        try {
            PreparedStatement ps = con.prepareStatement("DELETE FROM Student WHERE id = ?");
            ps.setString(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void addStudent(Student student) {
        try {
            PreparedStatement ps = con.prepareStatement("INSERT INTO Student (id,name) VALUES (?,?)");
            ps.setString(1,student.getId());
            ps.setString(2, student.getName());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void contractStudent(String id) {

    }
}
