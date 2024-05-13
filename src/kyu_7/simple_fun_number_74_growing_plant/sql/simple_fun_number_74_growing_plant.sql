SELECT id,
       CASE WHEN desired_height <= up_speed THEN 1
            ELSE CEIL((desired_height - up_speed)::decimal / (up_speed - down_speed))::int + 1 END AS num_days
FROM growing_plant;