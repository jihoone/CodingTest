--  보호소에서 중성화한 동물

-- 코드를 입력하세요
SELECT I.ANIMAL_ID, I.ANIMAL_TYPE, I.NAME
FROM ANIMAL_INS I JOIN ANIMAL_OUTS O
WHERE I.ANIMAL_ID = O.ANIMAL_ID AND I.SEX_UPON_INTAKE != O.SEX_UPON_OUTCOME
ORDER BY ANIMAL_ID
