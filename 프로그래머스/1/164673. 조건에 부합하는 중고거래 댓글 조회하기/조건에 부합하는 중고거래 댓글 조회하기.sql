select  b.TITLE,
        b.BOARD_ID,
        r.REPLY_ID,
        r.WRITER_ID,
        r.CONTENTS,
        DATE_FORMAT(r.CREATED_DATE, '%Y-%m-%d')
from USED_GOODS_BOARD b
inner join USED_GOODS_REPLY r on b.BOARD_ID = r.BOARD_ID
where DATE_FORMAT(b.CREATED_DATE, '%Y-%m') = '2022-10' 
order by r.CREATED_DATE ASC, b.title ASC;