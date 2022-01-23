create or replace PACKAGE BODY      "PACKAGEFNLIST" AS

function fnListConditionBasic return sys_Refcursor is
cCursor SYS_REFCURSOR;
BEGIN
    OPEN ccursor FOR SELECT NAMECONDITION,DESCRIPTIONC FROM CONDITION;
    return cCursor;
end fnListConditionBasic;

function fnListComboCondition return sys_refCursor is
cCursor sys_refCursor;
begin open cCursor for select namecondition from CONDITION;
    return cCursor;
end fnListComboCondition;

function fnListTypeClockBasic return sys_refcursor is
cCursor SYS_REFCURSOR;
BEGIN
    OPEN ccursor FOR SELECT NAMETYPE,DESCRIPTIONT FROM TypeClock;
    return cCursor;
end fnlistTypeClockBasic;

function fnListBrandBasic return sys_refCursor is
cCursor sys_refCursor;
begin open cCursor for select namebrand from brand;
    return cCursor;
end fnListBrandBasic;

function fnListBrandFull return sys_refCursor is
cCursor sys_refCursor;
begin open cCursor for select namebrand from brand;
    return cCursor;
end fnListBrandFull;


function fnListBuyStatusBasic return sys_refCursor is
cCursor sys_refCursor;
begin open cCursor for select status,descriptionB from BUYSTATUS;
    return cCursor;
end fnListBuyStatusBasic;

function fnListUserTypeBasic return sys_RefCursor is
cCursor sys_refCursor;
begin open cCursor for select nameType,descriptionType from UserType;
    return cCursor;
end fnListUserTypeBasic;

function fnListUserTypeCombo return sys_RefCursor is
cCursor sys_refCursor;
begin open cCursor for select nameType from UserType where nameType!='SuperAdmin';
    return cCursor;
end fnListUserTypeCombo;

function fnListPayMethodBasic return sys_RefCursor is 
cCursor sys_refCursor;
begin open cCursor for select type from paymentMethod;
    return cCursor;
end  fnListPayMethodBasic;

function fnListCountryBasic return sys_RefCursor is
cCursor sys_refCursor;
begin open ccUrsor for select nameCountry from country;
return ccursor;
end fnListCountryBasic;

function fnListCityBasic(p_nameC in varchar2) return sys_RefCursor is
cCursor sys_refCursor;
v_idCountry number(10);
begin
v_idCountry:=packagegetid.getidCountry(p_nameC);
open ccUrsor for select nameCity from city where city.idCountry=v_idCountry;
return ccursor;
end fnListCityBasic;

function fnListDistrictBasic(p_nameC in varchar2, p_nameCountry in varchar2) return sys_RefCursor is
cCursor sys_refCursor;
v_idCity number(8);
v_idCountry number(8);
begin
v_idCountry:=packagegetId.getIdCountry(p_nameCountry);
v_idCity:=packagegetId.getIdCity(p_nameC,v_idCountry);
open ccUrsor for select nameDistrict from district where district.idCity=v_idCity;
return ccursor;
end fnListDistrictBasic;


function fnListCountryInfoBasic return sys_RefCursor is
cCursor sys_refCursor;
begin open ccUrsor for select nameCountry, codeCountry from country;
return ccursor;
end fnListCountryInfoBasic;

function fnListGenderBasic return sys_RefCursor is
cCursor sys_refCursor;
begin open ccUrsor for select nameGender from gender;
return ccursor;
end fnListGenderBasic;

function fnListShippingMethodInfoBasic return sys_refcursor is
cCursor sys_refCursor;
begin open ccUrsor for select namesm, company from shippingmethod;
return ccursor;
end fnListShippingMethodInfoBasic;

function fnListShippingMethodBasic return sys_RefCursor is
cCursor sys_refCursor;
begin open ccUrsor for select namesm from shippingmethod;
return ccursor;
end fnListShippingMethodBasic;

function fnListIdentification return SYS_REFCURSOR is
cCursor sys_refCursor;
begin open ccUrsor for select typeID from identification;
return ccursor;
end fnListIdentification;

function fnListPhoneType return SYS_REFCURSOR is
cCursor sys_refCursor;
begin open ccUrsor for select nameType from phoneType;
return ccursor;
end fnListPhoneType;


function fnListPhonesFromUser(username in varchar2) return SYS_REFCURSOR is
cCursor sys_refCursor;
v_idAppuser number(10);
begin 
v_idAppUser:= packagegetid.getidusername(username);
open ccUrsor for select phonenumber from phone where phone.iduser=v_idappuser;
return ccursor;
end fnListPhonesFromUser;

function fnListModelPBasic(nameBrand in varchar2) return SYs_refcursor is
cCursor sys_refCursor;
v_idBrand number(10);
begin 
v_idBrand:= packagegetid.getidBrand(nameBrand);
open ccUrsor for select namemodel from modelp where modelp.idBrand=v_idBrand;
return ccursor;
end fnListModelPBasic;


function fnListTypeClockInfoBasic return sys_refcursor  is
cCursor sys_refCursor;
begin open ccUrsor for select nameType,descriptionT from typeclock;
return ccursor;
end fnListTypeClockInfoBasic;


function fnListCodeCountry return sys_refcursor is
cCursor sys_refCursor;
begin open ccUrsor for select codeCountry from country;
return ccursor;
end fnListCodeCountry;

function fnListAllClocksFsell return sys_refcursor is
cCursor sys_refcursor;
v_idStatusSale number(3);
begin
v_idStatusSale:= packagegetid.getidbuystatus('For Sale');
open ccursor for select buysale.idbuysale, buysale.datepost, 
                              appuser.username,
                              typeclock.nameType, 
                              brand.nameBrand, 
                              modelp.nameModel,
                              condition.nameCondition,
                              clock.manufacturedate,
                              clock.descriptionclock,
                              clock.price
                              from buysale 
                              inner join clock on  buysale.idbuystatus=v_idStatusSale and buysale.idClock=clock.idClock
                              inner join condition on clock.idcondition=condition.idcondition
                              inner join modelp on clock.idmodel=modelp.idmodel
                              inner join brand  on brand.idbrand=modelp.idbrand
                              inner join typeclock on typeclock.idtype=modelp.idtypeclock
                              inner join appuser on appuser.idappuser=buysale.iduserseller
                              where buysale.idbuystatus=v_idStatusSale ;
                            

return ccursor;

end fnListAllClocksFsell;

function fnListBuyStatusComboBasic return sys_refcursor is
cCursor sys_refCursor;
begin open cCursor for select status from BUYSTATUS;
    return cCursor;
end fnListBuyStatusComboBasic;

function fnListMyClocks(p_username in varchar2) return sys_refcursor is
cCursor sys_refcursor;
idUSer number(10);
begin
idUser:=packagegetid.getidusername(p_username);
open ccursor for select buysale.idbuysale, 
                              typeclock.nameType, 
                              brand.nameBrand, 
                              modelp.nameModel,
                              condition.nameCondition,
                              clock.manufacturedate,
                              clock.descriptionclock,
                              clock.price as p,
                              buyStatus.status
                              from buysale
                              inner join clock on buysale.iduserseller=iduser  and buysale.idClock=clock.idClock 
                              inner join condition on clock.idcondition=condition.idcondition
                              inner join modelp on clock.idmodel=modelp.idmodel
                              inner join brand  on brand.idbrand=modelp.idbrand
                              inner join typeclock on typeclock.idtype=modelp.idtypeclock
                              inner join buystatus on buySale.idbuystatus=buystatus.idbuystatus;
                            

return ccursor;

end fnListMyClocks;

function fnListBoughtClocks(p_username in varchar2) return sys_refcursor is
cCursor sys_refcursor;
idUSer number(10);
begin
idUser:=packagegetid.getidusername(p_username);
open ccursor for select buysale.idbuysale, 
                             buysale.datesale,
                              typeclock.nameType, 
                              brand.nameBrand, 
                              modelp.nameModel,
                              condition.nameCondition,
                              clock.manufacturedate,
                              clock.descriptionclock,
                              clock.price as p,
                              appuser.username,
                              paymentmethod.type,
                              shippingmethod.namesm
                            --  from HISTORY_APPUSERXBUYSALE
                              from  buysale 
                               
                              inner join clock on  buysale.idClock=clock.idClock 
                              
          
                              inner join condition on clock.idcondition=condition.idcondition
                              inner join modelp on clock.idmodel=modelp.idmodel
                              inner join brand  on brand.idbrand=modelp.idbrand
                              inner join typeclock on typeclock.idtype=modelp.idtypeclock
                              inner join paymentmethod on buysale.idpaymentm=paymentmethod.idpay
                              inner join shippingmethod on buysale.idshippingm=shippingmethod.idshipping
                              inner join appuser on buysale.iduserseller=appuser.idappuser
                              where buysale.iduserbuyer =iduser;
                               
return ccursor;

end fnListBoughtClocks;


function fnListShoppingCart(p_username in varchar2) return sys_refcursor is
cCursor sys_refcursor;
v_idUSer number(10);
begin
v_idUser:=packagegetid.getidusername(p_username);
open ccursor for select buysale.idbuysale, buysale.datepost, 
                              appuser.username,
                              typeclock.nameType, 
                              brand.nameBrand, 
                              modelp.nameModel,
                              condition.nameCondition,
                              clock.manufacturedate,
                              clock.descriptionclock,
                              clock.price
                              from shcart_appuserxclock
                              inner join clock on  shcart_appuserxclock.idClock=clock.idClock
                              inner join buysale on buysale.idclock=clock.idclock
                              inner join condition on clock.idcondition=condition.idcondition
                              inner join modelp on clock.idmodel=modelp.idmodel
                              inner join brand  on brand.idbrand=modelp.idbrand
                              inner join typeclock on typeclock.idtype=modelp.idtypeclock
                              inner join appuser on appuser.idappuser=buysale.iduserseller
                              where shcart_appuserxclock.iduser=v_idUser ;
return ccursor; 
end fnListShoppingCart;


function fnListUserWithType return sys_refcursor is
cCursor sys_refCursor;
begin 
open ccUrsor for select appuser.username,usertype.nametype from appuser inner join usertype on appuser.usertype=usertype.idusertype;
return ccursor;
end fnListUserWithType;

function fnListFavorites(p_username in varchar2) return sys_refcursor is
cCursor sys_refcursor;
v_idUSer number(10);
begin
v_idUser:=packagegetid.getidusername(p_username);
open ccursor for select buysale.idbuysale, buysale.datepost, 
                              appuser.username,
                              typeclock.nameType, 
                              brand.nameBrand, 
                              modelp.nameModel,
                              condition.nameCondition,
                              clock.manufacturedate,
                              clock.descriptionclock,
                              clock.price
                              from WLISTUSERXCLOCK
                              inner join clock on  WLISTUSERXCLOCK.idClock=clock.idClock
                              inner join buysale on buysale.idclock=clock.idclock
                              inner join condition on clock.idcondition=condition.idcondition
                              inner join modelp on clock.idmodel=modelp.idmodel
                              inner join brand  on brand.idbrand=modelp.idbrand
                              inner join typeclock on typeclock.idtype=modelp.idtypeclock
                              inner join appuser on appuser.idappuser=buysale.iduserseller
                              where WLISTUSERXCLOCK.iduser=v_idUser ;
return ccursor; 
end fnListFavorites;


end packagefnlist;