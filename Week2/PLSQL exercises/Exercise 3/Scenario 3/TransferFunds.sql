 create or replace procedure TransferFunds(src_id in number,dest_id in number,trans_amt in 
 number) is bal number;
 begin
  select balance into bal from accounts where accountid=src_id;
 if(bal<trans_amt ) then
      raise_application_error(-20001,'Insufficient amount to perform transaction');
  end if;
  update accounts set balance=balance-trans_amt where  accountid=src_id;
  update accounts set balance=balance+trans_amt where accountid=dest_id;
  commit;
  end;
  /
