 create or replace procedure UpdateEmployeeBonus(dept in varchar2,bonus_percent in number) is
begin
 update employees set salary=salary + (salary *bonus_percent/100) where department=dept;
commit;
end;
/
