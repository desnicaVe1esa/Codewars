select year,
    (year % 4 = 0) AND (year % 100 <> 0) OR (year % 400 = 0) as is_leap
from years
order by year;