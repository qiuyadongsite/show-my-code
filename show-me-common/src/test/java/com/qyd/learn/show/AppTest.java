package com.qyd.learn.show;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Random;
import java.util.UUID;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() throws Exception
    {

        Class driver=Class.forName("com.mysql.jdbc.Driver");

        Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");

        Statement statement = connection.createStatement();

        String[] names=new String[]{"张三","赵四","王五","李留"};
        String[] sexs=new String[]{"男","女"};

        String insetSql="insert into test(name,key) values('张三','男')";


        for (int i=0;i<(1000000-621711);i++){
            String name=names[(new Random()).nextInt(names.length)];

            String sex=sexs[(new Random()).nextInt(sexs.length)];

            String uuid= UUID.randomUUID().toString();

            insetSql="insert into test(name,sex,age,uuid) values('"+name+"','"+sex+"',"+(new Random()).nextInt(100)+",'"+uuid+"')";

            statement.execute(insetSql);
        }

        statement.close();

        connection.close();

    }
}
