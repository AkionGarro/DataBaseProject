--------------------------------------------------------
-- Archivo creado  - viernes-enero-14-2022   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Package Body PACKAGEDELETETUPLE
--------------------------------------------------------

  CREATE OR REPLACE PACKAGE BODY "PR"."PACKAGEDELETETUPLE" is

function fnDelCondition(p_name in varchar2) return varchar2 is
val varchar2(50);
v_idCondition number(2);
begin
    v_idCondition:=packagegetid.getIdCondition(p_name);
    delete from condition where condition.idcondition=v_idcondition; 
    val:='Deleted Successfully';
    commit;
    return val;
exception
    WHEN no_data_found THEN
     val:='Not found'; 
     return val;
    when others then
     val:='Wrong data';
     return val;
end fnDelCondition;

function fnDelTypeClock(p_name in varchar2) return varchar2 is
val varchar2(50);
v_idC number(2);
begin
    v_idC:=packagegetid.getIdTypeClock(p_name);
    delete from typeClock where typeClock.idType=v_idC; 
    val:='Deleted Successfully';
    commit;
    return val;
exception
    WHEN no_data_found THEN
     val:='Not found'; 
     return val;
    when others then
     val:='Wrong data';
     return val;
end fnDelTypeClock;
function fnDelBrand(p_name in varchar2) return varchar2 is
val varchar2(50);
v_idC number(10);
begin
    v_idC:=packagegetid.getIdBrand(p_name);
    delete from Brand where brand.idBrand=v_idC; 
    val:='Deleted Successfully';
    commit;
    return val;
exception
    WHEN no_data_found THEN
     val:='Not found'; 
     return val;
    when others then
     val:='Cannot be deleted, it has models';
     return val;
end fnDelBrand;

function fnDelBuyStatus(p_name in varchar2) return varchar2 is
val varchar2(50);
v_idC number(3);
begin
    v_idC:=packagegetid.getIdBuyStatus(p_name);
    delete from BuyStatus where BuyStatus.idBuyStatus=v_idC; 
    val:='Deleted Successfully';
    commit;
    return val;
exception
    WHEN no_data_found THEN
     val:='Not found'; 
     return val;
    when others then
     val:='Wrong data';
     return val;
end fnDelBuyStatus;

function fnDelUserType(p_name in varchar2) return varchar2 is
val varchar2(50);
v_idC number(3);
begin
    IF p_name='Admin' THEN
    val:='This user type cannot be deleted';
    return val;
    END IF;
    v_idC:=packagegetid.getidusertype(p_name);
    delete from UserType where Usertype.idUserType=v_idC; 
    val:='Deleted Successfully';
    commit;
    return val;
exception
    WHEN no_data_found THEN
     val:='Not found'; 
     return val;
    when others then
     val:='Wrong data';
     return val;
end fnDelUserType;

function fnDelPaymentMethod(p_name in varchar2) return varchar2
is
val varchar2(50);
v_idC number(3);
begin
    v_idC:=packagegetid.getidPaymentMethod(p_name);
    delete from PaymentMethod where PaymentMethod.idPay=v_idC; 
    val:='Deleted Successfully';
    commit;
    return val;
exception
    WHEN no_data_found THEN
     val:='Not found'; 
     return val;
    when others then
     val:='Wrong data';
     return val;
end fnDelPaymentMethod;

function fnDelCountry(p_name in varchar2) return varchar2
is
val varchar2(50);
v_idC number(3);
begin
    v_idC:=packagegetid.getidCountry(p_name);
    delete from Country where Country.idCountry=v_idC; 
    val:='Deleted Successfully';
    commit;
    return val;
exception
    WHEN no_data_found THEN
     val:='Not found'; 
     return val;
    when others then
     val:='Cannot be deleted';
     return val;
end fnDelCountry;

end  packageDeleteTuple;


