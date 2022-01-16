create or replace PACKAGE BODY      "PACKAGEGETID" AS
function getIdUserName(p_username in varchar2)return number is
idUser number(8);
begin
idUser:=99999999;
select idappuser into idUSer from appuser where(appuser.username=p_username);

return idUser;
end getIdUserName;



function getIdBrand(p_nameBrand in varchar2)return number is
idBrand number(10);
begin
idBrand:=99999999;
select brand.idBrand into idBrand from Brand where(Brand.nameBrand=p_nameBrand);

return idBrand;
end getIdBrand;




function getIdBuyStatus(p_name in varchar2)return number is
idBuyS number(3);
begin
idBuyS:=999;
select idBuyStatus into idBuys from Buystatus where(BUYSTATUS.status=p_name);

return idBuyS;
end getIdBuyStatus;




function getIdCity(p_nameC in varchar2, p_idCountry in number)return number is
idC number(8);
begin
idC:=9999999;
select idCity into idC from City where(City.nameCity=p_nameC and city.idCountry=p_idCountry);
return idC;
end getIDCity;

function getIdCondition(p_nameC in varchar2)return number is
idC number(2);
begin
idC:=99;
select idCondition into idC from condition where(Condition.nameCondition=p_nameC);
return idC;
end getIDCondition;

function getIdCountry(p_nameC in varchar2)return number is
idC number(8);
begin
idC:=9999999;
select idCountry into idC from country where(Country.nameCountry=p_nameC);
return idC;
end getIDCountry;

function getIdDistrict(p_nameC in varchar2, p_idCity in number)return number is
idC number(10);
begin
idC:=9999999;
select idDistrict into idC from District where(district.nameDistrict=p_nameC and district.idCity=p_idCity);
return idC;
end getIDDistrict;

function getIdGender(p_nameC in varchar2)return number is
idC number(8);
begin
idC:=9999999;
select idGender into idC from Gender where(gender.nameGender=p_nameC);
return idC;
end getIDGender;

function getIdIdentification(p_nameC in varchar2)return number is
idC number(3);
begin
idC:=999;
select IdIdentification into idC from Identification where(identification.TypeID=p_nameC);
return idC;
end getIdIdentification;


function getIdModel(p_nameC in varchar2, p_idBrand in number)return number is
idC number(10);
begin
idC:=99999999;
select idModel into idC from modelp where(modelp.namemodel=p_nameC and modelp.idBrand=p_idBrand);
return idC;
end getIDModel;


function getIdPaymentMethod(p_nameC in varchar2)return number is
idC number(3);
begin
idC:=999;
select idPay into idC from paymentmethod where(paymentmethod.type=p_nameC);
return idC;
end getIDPaymentMethod;

function getIdPeople(p_identification in varchar2) return number is 
idC number(8);
begin
idC:=99999999;
select idPeople into idC from People where(people.identificationnumber=p_identification);
return idC;
end getIDPeople;

function getidShippingMethod(p_nameC in varchar2)return number is
idC number(4);
begin
idC:=9999;
select idShipping into idC from shippingmethod where(shippingmethod.namesm=p_nameC);
return idC;
end getIDShippingMethod;

function getidTypeClock(p_nameC in varchar2)return number is
idC number(3);
begin
idC:=999;
select idType into idC from typeclock where(typeclock.nametype=p_nameC);
return idC;
end getIdTypeClock;

function getidUsertype(p_nameC in varchar2)return number is
idC number(2);
begin
idC:=99;
select idusertype into idC from usertype where(usertype.nametype=p_nameC);
return idC;
end getIdUserType;


function getidPhoneType(p_name in varchar2) return number is
idC number(2);
begin 
    select idPhoneType into idC from phoneType where (phonetype.nameType=p_name);
    return idC;
end getidPhonetype;

function getIdCountryWCode(p_codeCountry in varchar2)return number is
idC number(8);
begin 
    select idCountry into idC from country where  country.codeCountry=p_codeCountry;
    return idC;
end getIdCountryWCode;
end packagegetid;
