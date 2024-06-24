-- # write your SQL statement here: you are given a table 'ntheven' with column 'n', return a table with column 'n' and your result in a column named 'res'.
select n, 2 * (n - 1) as res from ntheven