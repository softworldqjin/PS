select f.FLAVOR as 'FLAVOR'
from FIRST_HALF f
inner join ICECREAM_INFO i on f.FLAVOR = i.FLAVOR
where TOTAL_ORDER > 3000 and INGREDIENT_TYPE = 'fruit_based'
order by TOTAL_ORDER DESC;