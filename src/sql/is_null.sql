-- Level1. 이름이 없는 동물의 아이디
SELECT ANIMAL_ID
FROM ANIMAL_INS

WHERE NAME IS NULL
;
-- 이름이 없는 경우는 해당 값이 null 이므로 null 을 찾는 is null 함수 사용해서 출력


-- Level1. 이름이 있는 동물의 아이디
SELECT ANIMAL_ID
FROM ANIMAL_INS

WHERE NAME IS NOT NULL
;
-- 그 반대의 경우에는 is not null을 이용해 null값을 제외

-- Level2. NULL 처리하기
SELECT
    ANIMAL_TYPE
     , CASE WHEN NAME IS NULL THEN 'No name' ELSE NAME END
--   = IF(NAME IS NULL, 'No name', NAME)  -- CASE문은 IF문으로 대체할 수 있음 IF(조건, 참일때, 거짓일때)
     , SEX_UPON_INTAKE
FROM ANIMAL_INS
ORDER BY ANIMAL_ID
;
-- 이름이 없는 경우는 No name 으로 출력하기 위해서 case when then else end 사용해서 조건 설정