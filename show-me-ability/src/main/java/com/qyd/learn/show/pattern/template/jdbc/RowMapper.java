package com.qyd.learn.show.pattern.template.jdbc;

import java.sql.ResultSet;

/**
 * ORM映射定制化的接口
 * qyd on 2019/3/16.
 */
public interface RowMapper<T> {
    T mapRow(ResultSet rs, int rowNum) throws Exception;
}
