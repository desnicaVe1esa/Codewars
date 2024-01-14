select month, case when month between 1 and 3 then 1
    when month between 4 and 6 then 2
    when month between 7 and 9 then 3
    when month between 10 and 12 then 4
end as res from quarterof