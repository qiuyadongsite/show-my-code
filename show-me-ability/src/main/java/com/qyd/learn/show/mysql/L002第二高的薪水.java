package com.qyd.learn.show.mysql;

/**
 * @Auther: qiuyd
 * @Date: 2019/12/17 20:46
 *
编写一个 SQL 查询，获取 Employee 表中第二高的薪水（Salary） 。

+----+--------+
| Id | Salary |
+----+--------+
| 1  | 100    |
| 2  | 200    |
| 3  | 300    |
+----+--------+
例如上述 Employee 表，SQL查询应该返回 200 作为第二高的薪水。如果不存在第二高的薪水，那么查询应返回 null。

+---------------------+
| SecondHighestSalary |
+---------------------+
| 200                 |
+---------------------+

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/second-highest-salary
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。


select  IFNULL((select distinct(Salary)  from Employee  order by Salary desc  limit 1,1),null) as SecondHighestSalary
 */
public class L002第二高的薪水 {


}
