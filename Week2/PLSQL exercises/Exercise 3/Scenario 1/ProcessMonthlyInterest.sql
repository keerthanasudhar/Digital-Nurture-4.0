create or replace procedure ProcessMonthlyInterest is 
begin
 update accounts set balance=balance +(balance*(1/100)) where accounttype='savings';
end;
/
exec ProcessMonthlyInterest;
