--  중복 제거하기

-- 코드를 입력하세요
SELECT COUNT(*)
FROM
    (
        SELECT NAME
        FROM ANIMAL_INS
        WHERE NAME IS NOT NULL
        GROUP BY NAME
    )SQ1
