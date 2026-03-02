select  f.CATEGORY,
        f.PRICE,
        f.PRODUCT_NAME
from FOOD_PRODUCT f
join (
    select CATEGORY, MAX(PRICE) as MAXPRICE
    from FOOD_PRODUCT
    group by CATEGORY
) m
on f.CATEGORY = m.CATEGORY 
and f.price = m.MAXPRICE
where f.CATEGORY in ('과자', '국', '김치', '식용유')
order by f.price DESC;