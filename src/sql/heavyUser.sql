-- Level3. 헤비 유저가 소유한 장소

SELECT ID, NAME, HOST_ID
FROM PLACES

WHERE HOST_ID IN (
    SELECT HOST_ID
    FROM PLACES
    GROUP BY HOST_ID
    HAVING COUNT(*) > 1
)

ORDER BY ID
;

-- 다른 사람의 풀이
SELECT ID, NAME, HOST_ID
FROM PLACES PL1
WHERE EXISTS (
              SELECT 1
              FROM PLACES PL2
              WHERE PL1.HOST_ID = PL2.HOST_ID
              GROUP BY HOST_ID
              HAVING COUNT(*) > 1
          )
ORDER BY ID;
-- 해당 값의 존재 여부만을 확인하는 EXIST를 사용해 성능을 높임
