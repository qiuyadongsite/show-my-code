package com.qyd.learn.show.pattern.template.jdbc;

import com.qyd.learn.show.pattern.template.jdbc.dao.MemberDao;
import java.util.List;

/**
 * qyd.
 */
public class MemberDaoTest {

    public static void main(String[] args) {
        MemberDao memberDao = new MemberDao(null);
        List<?> result = memberDao.selectAll();
        System.out.println(result);
    }
}
