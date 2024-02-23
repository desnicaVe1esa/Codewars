select number, case number % 2 when 0 then 'Even'
                               else 'Odd' end as is_even from numbers