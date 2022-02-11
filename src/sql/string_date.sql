-- Level2. 루시와 엘라 찾기
SELECT ANIMAL_ID, NAME, SEX_UPON_INTAKE
FROM ANIMAL_INS
WHERE NAME IN ('Lucy', 'Ella', 'Pickle', 'Rogan', 'Sabrina', 'Mitty')
ORDER BY ANIMAL_ID
;
-- 여러가지 조건을 찾을 때 IN 연산자를 사용해서 한번에 찾을 수 있음


-- Level2. 이름에 el이 들어가는 동물 찾기
SELECT ANIMAL_ID, NAME
FROM ANIMAL_INS
WHERE ANIMAL_TYPE = 'Dog'
  AND NAME LIKE '%el%'
ORDER BY NAME
;
-- 데이터에 특정 값이 포함되게 하려면 LIKE를 사용
-- % 는 글자수 상관xx
--   EL의 앞뒤로 문자가 포함되게 하려면 '%EL%' 뒤에만 하려면 'EL%'
-- 글자수 제한하려면 _ 사용
-- 'EL__' 일 경우 'Ella'만 해당이 됨

-- SQL문에도 RegExp 정규표현식 사용 가능함
-- 조건이 많아지면 정규표현식을 통해 표현하는 것이 훨씬 간단하게 표현 가능함
-- 처음^ 끝$
-- '^....$' - .하나당 한 글자를 의미하므로 4글자인 단어 아무거나 해당 가능
-- 출처: https://codingdog.tistory.com/entry/mysql-regexp-%EB%B3%B5%EC%9E%A1%ED%95%9C-%ED%8C%A8%ED%84%B4-%EB%A7%A4%EC%B9%AD%EC%9D%84-%ED%95%B4-%EB%B4%85%EC%8B%9C%EB%8B%A4?category=1055060


-- Level2. 중성화 여부 파악하기
SELECT
    ANIMAL_ID
     , NAME
     , (CASE
            WHEN SEX_UPON_INTAKE LIKE 'Intact%' THEN 'X'
            ELSE 'O'
    END) AS '중성화'
--   , (IF(SEX_UPON_INTAKE LIKE 'Intact%', 'X', 'O')) AS '중성화' -- IF문 대체 가능

FROM ANIMAL_INS
;
-- 중성화 하지않은 동물은 앞에 Intact가 붙으므로 그럴 경우 X 인 것을 표현하기위해 CASE문 사용 -> IF도 사용 가능


-- Level2. 오랜 기간 보호한 동물(2)
SELECT
    OUTS.ANIMAL_ID
     , OUTS.NAME
FROM ANIMAL_OUTS AS OUTS

INNER JOIN ANIMAL_INS AS INS
    ON OUTS.ANIMAL_ID = INS.ANIMAL_ID

ORDER BY DATEDIFF(OUTS.DATETIME, INS.DATETIME) DESC
-- ORDER BY OUTS.DATETIME - INS.DATETIME DESC

LIMIT 2
-- 보호소에 있던 기간을 비교하기 위해서는 입양 간 시점과 들어온 시점을 빼서 비교하면 됨
-- 두 값을 직접 빼서 비교하는 방법과 DATEDIFF 이용해 비교할 수 있음
-- 입양간 동물임이 전제이므로 기본테이블을 OUTS로 두고 입양가지 않은 동물은 출력되지 않도록 INS테이블을 INNER JOIN으로 연결


-- Level2. DATETIME에서 DATE로 형 변환
SELECT ANIMAL_ID, NAME, DATE_FORMAT(DATETIME, '%Y-%m-%d')
FROM ANIMAL_INS
ORDER BY ANIMAL_ID
;
-- DATETIME을 다른 형식으로 변환시키기 위해 DATE_FORMAT 사용
-- 뒤에 포맷 형식 지정해줌으로서 다른 형식으로 변환 가능함
-- 참고: https://www.w3schools.com/sql/func_mysql_date_format.asp

