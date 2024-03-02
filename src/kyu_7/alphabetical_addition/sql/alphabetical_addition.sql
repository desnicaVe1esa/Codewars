select case
           when sum(ascii(letter) - 96)%26 = 0 then 'z'
           when sum(ascii(letter) - 96) > 26 then chr(cast(sum(ascii(letter) - 96)%26 as int) + 96)
           when sum(ascii(letter) - 96) <= 26 then chr(cast(sum(ascii(letter) - 96) as int) + 96)
           else 'z'
           end as letter
from letters;