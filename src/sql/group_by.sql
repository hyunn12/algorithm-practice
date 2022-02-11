-- Level2. 고양이와 개는 몇 마리 있을까
SELECT ANIMAL_TYPE, COUNT(ANIMAL_ID) FROM ANIMAL_INS
GROUP BY ANIMAL_TYPE
ORDER BY ANIMAL_TYPE
;
-- type별로 grouping한 것을 PK인 ID값으로 count 후 정렬


-- Level2. 동명 동물 수 찾기
SELECT NAME, COUNT(ANIMAL_ID) AS 'COUNT'
FROM ANIMAL_INS

WHERE NAME IS NOT NULL

GROUP BY NAME
HAVING COUNT(NAME) > 1

ORDER BY NAME
;
-- WHERE 절을 이용해 이름이 NULL 값이 아닌 데이터만 추출
-- GROUP BY HAVING을 통해 이름별로 그룹핑하고 해당 그룹에 조건 부여


-- Level2. 입양 시각 구하기(1)
SELECT
    DATE_FORMAT(DATETIME,"%H") AS 'HOUR'
     , COUNT(DATE_FORMAT(DATETIME,"%H"))
FROM ANIMAL_OUTS

WHERE DATE_FORMAT(DATETIME,"%H")  BETWEEN 09 AND 19

GROUP BY HOUR

ORDER BY HOUR
;
-- WHERE절에는 ALIAS가 먹지않는다
-- 입양시각을 구하기 위해 DATETIME을 DATE_FORMAT 함수를 이용해 시간만 남도록 변경
-- 특정 시간대의 데이터를 구하기 위해 WHERE BETWEEN A AND B 함수를 사용


-- Level4. 입양 시각 구하기(2)