--------------------------------------------------------
-- Archivo creado  - jueves-enero-13-2022   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Package Body PACKAGEFNLIST
--------------------------------------------------------

  CREATE OR REPLACE PACKAGE BODY "PR"."PACKAGEFNLIST" AS

function fnListConditionBasic return sys_Refcursor is
cCursor SYS_REFCURSOR;
BEGIN
    OPEN ccursor FOR SELECT NAMECONDITION,DESCRIPTIONC FROM CONDITION;
    return cCursor;
end fnListConditionBasic;

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
end fnListPhonesFromUser;

end packagefnlist;


