# Write your MySQL query statement below
select coalesce(round(count(distinct a.player_id) / total, 2), 0) as fraction 
    from (
    select player_id, min(event_date) as first_date
    from Activity 
    group by player_id)as a 
join Activity as b 
on a.player_id = b.player_id and b.event_date = date_add(first_date, interval 1 day)
cross join (
    select count(distinct player_id) as total
    from Activity
) as c