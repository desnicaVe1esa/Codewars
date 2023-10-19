select bool, case when bool = true then 'Yes'
                  when bool = false then 'No'
    end as res from booltoword