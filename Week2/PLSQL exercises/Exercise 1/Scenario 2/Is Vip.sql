 alter table customers add isVip varchar(5);

 begin
  for rec in (select * from customers where balance >10000) loop
    update customers set isVip='true' where customerid=rec.customerid;
  end loop;
  commit;
 end;
 /
