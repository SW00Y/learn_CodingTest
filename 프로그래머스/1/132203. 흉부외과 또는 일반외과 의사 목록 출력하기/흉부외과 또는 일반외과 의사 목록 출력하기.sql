-- 코드를 입력하세요
SELECT DR_NAME, DR_ID, MCDP_CD, TO_CHAR(HIRE_YMD,'YYYY-MM-DD')from doctor
WHERE MCDP_CD = 'CS' OR MCDP_CD ='GS'
ORDER BY 4 DESC, 1 ASC