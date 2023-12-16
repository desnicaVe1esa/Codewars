select n, m, case when n <= 0 then 0
                  when m <= 0 then 0
                  else m * n end as res
from paperwork