package com.bortni.dao.mysql;

import com.bortni.dao.JdbcAbstractDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class MySqlPortDao extends JdbcAbstractDao {
    protected MySqlPortDao(Connection connection) {
        super(connection);
    }

    @Override
    public String getSelectAllQuery() {
        return null;
    }

    @Override
    public String getUpdateQuery() {
        return null;
    }

    @Override
    public String getDeleteQuery() {
        return null;
    }

    @Override
    public String getSelectOneQuery() {
        return null;
    }

    @Override
    public void setStatementForUpdate(PreparedStatement preparedStatement, Object object) {

    }

    @Override
    public void setStatementForDelete(PreparedStatement preparedStatement, Object object) {

    }

    @Override
    public List getObjects(ResultSet resultSet) {
        return null;
    }

    @Override
    public Object create() {
        return null;
    }
}
