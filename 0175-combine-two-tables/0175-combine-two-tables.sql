# Write your MySQL query statement below
select firstName, lastName, Address.city as city, Address.state as state from Person left join Address on Person.personId = Address.personId; 