# Write your MySQL query statement below
select category, accounts_count from
(select 'Low Salary' as category, Count(*) as accounts_count from Accounts where income < 20000
union all
select 'Average Salary', Count(*) as accounts_count from Accounts where income >= 20000 and income <= 50000
union all
select 'High Salary', Count(*) as accounts_count from Accounts where income > 50000) as t;