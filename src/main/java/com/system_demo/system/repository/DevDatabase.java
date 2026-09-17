package com.system_demo.system.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.stereotype.Repository;
import org.springframework.context.annotation.Profile;

import com.system_demo.system.repository.interfaces.Database;

@Repository
@Profile("dev")
public class DevDatabase implements Database{

    @Override
    public Connection dbConnect() throws SQLException {
        Connection connect = DriverManager.getConnection("jdbc:sqlite:data/practice.db");
        return connect;
    }

    @Override
    public void writeSQL(String sql) throws SQLException {
        Connection db = dbConnect();
        Statement stmt = db.createStatement();
        stmt.execute(sql);
        db.close();
    }
}