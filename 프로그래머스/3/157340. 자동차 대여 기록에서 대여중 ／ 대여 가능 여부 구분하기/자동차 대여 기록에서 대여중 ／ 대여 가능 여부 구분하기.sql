select  car_id,
        if(sum(if(
        '2022-10-16' between date(start_date) and date(end_date), 1, 0)) > 0, '대여중', '대여 가능') as 'AVAILABILITY'
            
from CAR_RENTAL_COMPANY_RENTAL_HISTORY
group by car_id
order by car_id desc