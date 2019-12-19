package com.qyd.learn.show.mysql;

/**
 * @Auther: qiuyd
 * @Date: 2019/12/19 19:33
 * @Description:
 * 编写一个 SQL 查询，来删除 Person 表中所有重复的电子邮箱，重复的邮箱里只保留 Id 最小 的那个。
 *
 * +----+------------------+
 * | Id | Email            |
 * +----+------------------+
 * | 1  | john@example.com |
 * | 2  | bob@example.com  |
 * | 3  | john@example.com |
 * +----+------------------+
 * Id 是这个表的主键。
 * 例如，在运行你的查询语句之后，上面的 Person 表应返回以下几行:
 *
 * +----+------------------+
 * | Id | Email            |
 * +----+------------------+
 * | 1  | john@example.com |
 * | 2  | bob@example.com  |
 * +----+------------------+
 * 在真实的面试中遇到过这道题？
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/delete-duplicate-emails
DELETE from Person
Where Id not in (
Select Id
From(
Select MIN(Id) as id
From Person
Group by Email
) t
)
 */
public class L0011删除重复的电子邮箱 {
}
