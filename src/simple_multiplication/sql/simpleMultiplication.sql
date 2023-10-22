select number, case when number % 2 = 0 then number * 8
                    when number % 2 != 0 then number * 9
    end as res from multiplication;