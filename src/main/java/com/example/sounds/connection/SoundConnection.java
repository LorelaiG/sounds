package com.example.sounds.connection;

import java.sql.*;

public class SoundConnection {

    public static void main(String[] args) {

        String url = "jdbc://mysql://localhost:3306/mydb?autoReconnect=true&useSSL=false";
        String user = "root";
        String password = "";
        try {
            Connection myConn = (Connection) DriverManager.getConnection(url, user, password);
            Statement myStnt = ((java.sql.Connection) myConn).createStatement();
            String sql = "select * from mydb.sound";
            ResultSet rs = myStnt.executeQuery(sql);

            while (rs.next()) System.out.println(rs.getString("name"));

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
