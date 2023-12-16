select str,
       length(str)
           - length(
               replace(replace(replace(replace(replace(
                                                       lower(str), 'a', ''), 'e', ''), 'i', ''), 'o', ''), 'u', '')
           ) as res
from getcount