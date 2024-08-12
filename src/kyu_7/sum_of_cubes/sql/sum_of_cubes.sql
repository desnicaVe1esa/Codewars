CREATE OR REPLACE FUNCTION sum_cub(n bigint) RETURNS bigint AS $$
DECLARE
summ bigint := 0;
BEGIN
for num in 1..n loop
    summ := summ + (POW(num,3));
end loop;
return summ;
END $$ LANGUAGE plpgsql;

SELECT n, sum_cub(n) AS res FROM cubes
ORDER BY res