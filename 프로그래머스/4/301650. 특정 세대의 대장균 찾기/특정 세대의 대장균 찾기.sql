select F.ID
from ECOLI_DATA as F
left JOIN ECOLI_DATA as S on F.PARENT_ID = S.ID
left JOIN ECOLI_DATA as T on S.PARENT_ID = T.ID
where T.ID is not NULL and T.PARENT_ID is NULL
order by F.ID ASC;