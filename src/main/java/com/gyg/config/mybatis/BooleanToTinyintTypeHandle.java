package com.gyg.config.mybatis;

import lombok.NoArgsConstructor;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;
import org.apache.ibatis.type.TypeHandler;
import org.springframework.context.annotation.Configuration;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @Classname BooleanToTinyintTypeHandle
 * @Date 2021/7/5 1:14
 * @Author by gyg
 * @Description TODO
 */
@MappedJdbcTypes({JdbcType.TINYINT})
@MappedTypes({Boolean.class})
@NoArgsConstructor
public class BooleanToTinyintTypeHandle implements TypeHandler<Boolean> {
    /**
     * 参数映射，从JAVA到JDBC
     *
     * @param ps
     * @param i
     * @param parameter
     * @param jdbcType
     * @throws SQLException
     */
    @Override
    public void setParameter(PreparedStatement ps, int i, Boolean parameter, JdbcType jdbcType) throws SQLException {
        if (parameter) {
            ps.setInt(i, 1);
        } else {
            ps.setInt(i, 0);
        }
    }

    /**
     * result,从JDBC到MYSQL
     * true : 1,false : 0
     *
     * @param rs
     * @param columnName
     * @return
     * @throws SQLException
     */
    @Override
    public Boolean getResult(ResultSet rs, String columnName) throws SQLException {
        return rs.getInt(columnName) == 0;
    }

    @Override
    public Boolean getResult(ResultSet rs, int columnIndex) throws SQLException {
        return rs.getInt(columnIndex) == 0;
    }

    @Override
    public Boolean getResult(CallableStatement cs, int columnIndex) throws SQLException {
        return cs.getInt(columnIndex) == 0;
    }
}
