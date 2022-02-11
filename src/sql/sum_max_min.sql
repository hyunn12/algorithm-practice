-- Level1. 최댓값 구하기
SELECT DATETIME AS '시간'
FROM ANIMAL_INS

ORDER BY DATETIME DESC
LIMIT 1
;
-- 1. ORDER BY로 정렬 후 LIMIT를 사용해 최댓값 데이터 추출
SELECT MAX(DATETIME) AS '시간'
FROM ANIMAL_INS
;
-- 2. MAX 함수 이용해 최댓값 추출
-- AS ~~ 를 이용해 특정 컬럼이나 테이블에 ALIAS 설정할 수 있음


-- Level2. 최솟값 구하기
SELECT MIN(DATETIME) AS '시간'
FROM ANIMAL_INS
;
-- MIN 함수 이용해 최솟값 추출


-- Level2. 동물 수 구하기
SELECT COUNT(ANIMAL_ID) AS COUNT
FROM ANIMAL_INS;
-- COUNT 함수 이용해 특정 컬럼의 개수 구하기


-- Level2. 중복 제거하기
SELECT COUNT(DISTINCT NAME)
FROM ANIMAL_INS;
-- DISTINCT 함수를 이용해 특정 컬럼에서의 중복값을 제거