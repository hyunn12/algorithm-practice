-- Level3. 없어진 기록 찾기
SELECT OUTS.ANIMAL_ID, OUTS.NAME
FROM ANIMAL_OUTS OUTS

LEFT JOIN ANIMAL_INS INS
    ON INS.ANIMAL_ID = OUTS.ANIMAL_ID

WHERE INS.ANIMAL_ID is NULL

ORDER BY OUTS.ANIMAL_ID
;
-- 입양을 갔지만 보호소에 들어온 기록이 없다면 OUTS에는 있고 INS가 없는 동물을 찾으면 될 것
-- LEFT JOIN 이용해서 OUTS에만


-- Level3. 있었는데요 없었습니다



-- Level3. 오랜 기간 보호한 동물(1)



-- Level4. 보호소에서 중성화한 동물



