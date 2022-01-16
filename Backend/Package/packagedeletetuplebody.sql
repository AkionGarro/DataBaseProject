create or replace PACKAGE BODY      "PACKAGEDELETETUPLE" is

function fnDelCondition(p_name in varchar2) return varchar2 is
val varchar2(50);
v_idCondition number(2);
begin
    v_idCondition:=packagegetid.getIdCondition(p_name);
    delete from condition where condition.idcondition=v_idcondition; 
    val:='Successfully Deleted';
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
    val:='Successfully Deleted';
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
    val:='Successfully Deleted';
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
    val:='Successfully Deleted';
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
    val:='Successfully Deleted';
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
    val:='Successfully Deleted';
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

function fnDelPhone(p_phonenumber in number) return varchar2 is
val varchar2(50);
begin
    delete from phone where phone.phonenumber=p_phonenumber; 
    val:='Successfully Deleted';
    commit;
    return val;
exception
    WHEN no_data_found THEN
     val:='Not found'; 
     return val;
    when others then
     val:='Wrong data';
     return val;
end fnDelPhone;

function fnDelGender(p_name in varchar2) return varchar2 is
val varchar2(50);
begin
    delete from gender where gender.nameGender=p_name; 
    val:='Successfully Deleted';
    commit;
    return val;
exception
    WHEN no_data_found THEN
     val:='Not found'; 
     return val;
    when others then
     val:='Wrong data';
     return val;
end fnDelGender;
function fnDelIdentification(p_name in varchar2) return varchar2 is
val varchar2(50);
begin
    delete from identification where Identification.TypeID=p_name; 
    val:='Successfully Deleted';
    commit;
    return val;
exception
    WHEN no_data_found THEN
     val:='Not found'; 
     return val;
    when others then
     val:='Wrong data';
     return val;
end fnDelIdentification;
function fnDelCity(p_nameCity in varchar2,p_nameCountry in varchar2)return varchar2 is
val varchar2(50);
v_idCountry number(8);
v_idCity number(8);
begin
    v_idCountry:=packagegetid.getIdCountry(p_nameCountry);
    v_idCity:=packagegetid.getIdCity(p_nameCity,p_nameCountry);
    delete from city where city.idCity=v_idCity; 
    val:='Successfully Deleted ';
    commit;
    return val;
exception
    WHEN no_data_found THEN
     val:='Not found'; 
     return val;
    when others then
     val:='Wrong data';
     return val;
end fnDelCity;


function fnDelBuySaleClock(p_id_buySale in number) return varchar2 is
val varchar2(50);
v_idClock number(10);
begin
    select idClock into v_idClock from buysale where BuySale.idBuySale=p_id_buysale;
    
    delete from BUYSALE where BUYSALE.IdBuysale=p_id_buySale;
    delete from PHOTOCLOCK where PHOTOCLOCK.idClock=v_idClock;
    delete from SHCART_APPUSERXCLOCK where SHCART_APPUSERXCLOCK.idCLock=v_idClock;
    delete from WLISTUSERXCLOCK where wlistuserxclock.idclock=v_idClock;
    delete from CLOCK WHERE CLOCK.idClock=v_idClock;
    val:='Successfully Deleted';
    commit;
    return val;
exception
    WHEN no_data_found THEN
     val:='Not found';
     rollback;
     return val;
    when others then
     val:='Item has already been bought, cannot delete post';
     return val;
end fnDelBuySaleClock;
function fnDelModelP(p_nameModel in varchar2,p_nameBrand in varchar2)return varchar2 is
val varchar2(50);
v_idBrand number(10);
begin
    v_idBrand:=packagegetid.getidBrand(p_nameBrand);
    delete from MODELP where (MODELP.idBrand=v_idBrand and MODELP.nameModel=p_nameModel); 
    val:='Successfully Deleted';
    commit;
    return val;
exception
    WHEN no_data_found THEN
     val:='Not found'; 
     return val;
    when others then
     val:='Wrong data';
     return val;
end fnDelModelP;


function fnDelShippingMethod(p_nameShipping in varchar2,p_nameCompany in varchar2)return varchar2 is
val varchar2(50);
begin
    delete from SHIPPINGMETHOD where SHIPPINGMETHOD.namesm=p_nameShipping and SHIPPINGMETHOD.Company=p_nameCompany; 
    val:='Successfully Deleted';
    commit;
    return val;
exception
    WHEN no_data_found THEN
     val:='Not found'; 
     return val;
    when others then
     val:='Wrong data';
     return val;
end fnDelShippingMethod;
function fnDelShCart(p_idBuySale in number)return varchar2 is
val varchar2(50);
v_idClock number(10);
begin
    v_idClock:=packagegetid.getidClock(p_idBuySale);
    delete from SHCART_APPUSERXCLOCK where SHCART_APPUSERXCLOCK.idClock=v_idClock; 
    val:='Successfully Deleted';
    commit;
    return val;
exception
    WHEN no_data_found THEN
     val:='Not found'; 
     return val;
    when others then
     val:='Wrong data';
     return val;
end fnDelShCart;
function fnDelWlist(p_idBuySale in number)return varchar2 is
val varchar2(50);
v_idClock number(10);
begin
    v_idClock:=packagegetid.getidClock(p_idBuySale);
    delete from WLISTUSERXCLOCK where WLISTUSERXCLOCK.idClock=v_idClock; 
    val:='Successfully Deleted';
    commit;
    return val;
exception
    WHEN no_data_found THEN
     val:='Not found'; 
     return val;
    when others then
     val:='Wrong data';
     return val;
end fnDelWlist;
end  packageDeleteTuple;

