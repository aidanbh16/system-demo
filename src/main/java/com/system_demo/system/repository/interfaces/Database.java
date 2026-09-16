package com.system_demo.system.repository.interfaces;

import java.sql.Connection;
import java.sql.SQLException;

public interface Database {
    Connection dbConnect() throws SQLException;
}