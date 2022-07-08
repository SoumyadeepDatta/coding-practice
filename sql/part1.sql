-- assignment 46
select Pymtmode, count(*) PYMTCOUNT
from (select * from orders where
extract(year from Pymtdate)<2015) group by Pymtmode
having count(*)>1;

