package com.qyd.learn.show.mysql;

/**
 * @Auther: qiuyd
 * @Date: 2019/12/19 19:42
给定一个 Weather 表，编写一个 SQL 查询，来查找与之前（昨天的）日期相比温度更高的所有日期的 Id。

+---------+------------------+------------------+
| Id(INT) | RecordDate(DATE) | Temperature(INT) |
+---------+------------------+------------------+
|       1 |       2015-01-01 |               10 |
|       2 |       2015-01-02 |               25 |
|       3 |       2015-01-03 |               20 |
|       4 |       2015-01-04 |               30 |
+---------+------------------+------------------+
例如，根据上述给定的 Weather 表格，返回如下 Id:

+----+
| Id |
+----+
|  2 |
|  4 |
+----+

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/rising-temperature

select w2.Id as Id from Weather w1,Weather w2 where
DATEDIFF (w1.RecordDate, w2.RecordDate) = -1 and w2.Temperature>w1.Temperature

select distinct w2.id from Weather w1 inner join Weather w2 on DATEDIFF (w1.RecordDate, w2.RecordDate) = -1
where w2.Temperature > w1.Temperature
 */
public class L0012上升的温度 {
}
