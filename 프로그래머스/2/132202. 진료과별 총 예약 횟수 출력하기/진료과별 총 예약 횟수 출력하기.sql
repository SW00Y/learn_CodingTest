-- 코드를 입력하세요
SELECT MCDP_CD AS 진료과코드,COUNT(*) AS 예약건수 FROM APPOINTMENT
WHERE TO_CHAR(APNT_YMD,'YYYYMM')='202205'
GROUP BY MCDP_CD
ORDER BY 2, 1