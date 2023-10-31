select product_name
from homework.orders o
         inner join homework.customers c
                    on o.customer_id = c.id
where lower(c."name")=lower(:name);
