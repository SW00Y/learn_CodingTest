-- 코드를 입력하세요
SELECT A.CATEGORY, SUM(B.SALES)
FROM BOOK A, BOOK_SALES B
WHERE A.BOOK_ID = B.BOOK_ID
AND TO_CHAR(B.SALES_DATE,'YYYYMM') = 202201
GROUP BY A.CATEGORY
ORDER BY A.CATEGORY