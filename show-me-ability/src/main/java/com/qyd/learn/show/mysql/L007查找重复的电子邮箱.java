package com.qyd.learn.show.mysql;

/**
 * @Auther: qiuyd
 * @Date: 2019/12/18 17:59
编写一个 SQL 查询，查找 Person 表中所有重复的电子邮箱。

示例：

+----+---------+
| Id | Email   |
+----+---------+
| 1  | a@b.com |
| 2  | c@d.com |
| 3  | a@b.com |
+----+---------+
根据以上输入，你的查询应返回以下结果：

+---------+
| Email   |
+---------+
| a@b.com |
+---------+

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/duplicate-emails


select distinct a.Email as Email from  Person as a,Person as b where a.Id!=b.Id and a.Email=b.Email

select Email from Person group by Email having count(Email) > 1

 */
public class L007查找重复的电子邮箱 {
}
