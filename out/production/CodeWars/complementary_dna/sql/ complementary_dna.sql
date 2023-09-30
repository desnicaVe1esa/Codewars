SELECT dna,
       UPPER(
           REPLACE(
               REPLACE(
                   REPLACE(
                       REPLACE(dna, 'A', 't'),
                       'T', 'a'),
                   'G', 'c'),
               'C', 'g')) AS res
FROM dnastrand;