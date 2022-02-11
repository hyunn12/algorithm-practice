-- Level1. 모든 레코드 조회하기
SELECT * FROM ANIMAL_INS ORDER BY ANIMAL_ID
;
-- * 을 사용해 테이블에 존재하는 모든 컬럼 조회


-- Level1. 역순 정렬하기
SELECT NAME, DATETIME FROM ANIMAL_INS ORDER BY ANIMAL_ID DESC
;
-- ORDER BY ~~ DESC 이용해 역순으로 정렬
-- ORDER BY ~~ ASC 이용 시 순서대로 정렬
-- DEFAULT 값은 ASC 이므로 아무 것도 작성하지 않을 시 기본적으로 ASC 적용


-- Level1. 아픈 동물 찾기
SELECT ANIMAL_ID, NAME FROM ANIMAL_INS WHERE INTAKE_CONDITION = 'Sick'
;
-- WHERE 절을 이용해 특정 조건을 가진 data만 출력


-- Level1. 어린 동물 찾기
SELECT
    ANIMAL_ID, NAME
FROM ANIMAL_INS
WHERE INTAKE_CONDITION != 'Aged'
ORDER BY ANIMAL_ID
;


-- Level1. 동물의 아이디와 이름
SELECT ANIMAL_ID, NAME
FROM ANIMAL_INS
ORDER BY ANIMAL_ID
;
-- SELECT 옆에 특정 컬럼명을 적음으로서 data에서 특정 컬럼값만 추출


-- Level1. 여러 기준으로 정렬하기
SELECT ANIMAL_ID, NAME, DATETIME
FROM ANIMAL_INS
ORDER BY NAME, DATETIME DESC
;
-- ORDER BY 절에 ,를 이용해 여러 컬럼을 정렬할 수 있음


-- Level1. 상위 n개 레코드
SELECT NAME FROM ANIMAL_INS
ORDER BY DATETIME
LIMIT 1
;
-- LIMIT 를 이용해 상위 N개의 레코드만 추출 가능함
-- 게시판 제작 시 페이징도 LIMIT 이용해서 적용