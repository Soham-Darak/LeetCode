package SQL;

public class SQL_Question_619 {
    /*
        -- Table: MyNumbers
-- +-------------+------+
-- | Column Name | Type |
-- +-------------+------+
-- | num         | int  |
-- +-------------+------+
--
-- This table may contain duplicate values.
-- There is no primary key for this table.
-- Each row contains an integer number.
--
-- A single number is defined as a number that appears only once in the table.
-- Task:
-- Find the largest single number.
-- If no single number exists, return NULL.
--
-- SQL Solution:
-- 1. Group numbers using GROUP BY
-- 2. Use HAVING COUNT(num) = 1 to filter single numbers
-- 3. Use MAX(num) to get the largest among them
--
-- Final Query:

-- SELECT MAX(num) AS num
-- FROM MyNumbers
-- WHERE num IN (
--     SELECT num
--     FROM MyNumbers
--     GROUP BY num
--     HAVING COUNT(num) = 1
-- );

    */
}
