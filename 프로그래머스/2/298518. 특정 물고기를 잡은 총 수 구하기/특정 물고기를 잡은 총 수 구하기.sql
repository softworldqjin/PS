select count(*) as 'FISH_COUNT'
from FISH_NAME_INFO fni
inner join FISH_INFO fi on fni.FISH_TYPE = fi.FISH_TYPE
where fni.FISH_NAME in ('BASS', 'SNAPPER');