-- 진료과별 총 예약 횟수 출력하기

-- 코드를 입력하세요
SELECT MCDP_CD AS 진료과코트, COUNT(MCDP_CD) AS 5월예약건수
FROM APPOINTMENT
WHERE APNT_YMD LIKE '2022-05%'
GROUP BY MCDP_CD
ORDER BY COUNT(MCDP_CD), MCDP_CD
