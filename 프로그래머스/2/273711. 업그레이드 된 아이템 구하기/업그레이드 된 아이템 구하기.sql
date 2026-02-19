select  t.ITEM_ID,
        ii.ITEM_NAME,
        ii.RARITY
from ITEM_TREE t
inner join ITEM_INFO i on t.PARENT_ITEM_ID = i.ITEM_ID
inner join ITEM_INFO ii on t.ITEM_ID = ii.ITEM_ID
where i.RARITY = 'RARE'
order by t.ITEM_ID DESC