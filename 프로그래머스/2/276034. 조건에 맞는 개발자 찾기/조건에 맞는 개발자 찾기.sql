select  DISTINCT
        d.ID,
        d.EMAIL,
        d.FIRST_NAME,
        d.LAST_NAME
from DEVELOPERS d
inner join SKILLCODES s on d.SKILL_CODE & s.CODE
where s.NAME in ('Python', 'C#')
order by d.ID ASC;
