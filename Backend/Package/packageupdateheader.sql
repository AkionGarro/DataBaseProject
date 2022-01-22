create or replace PACKAGE      "PACKAGEUPDATE" is

--these functions receive the name of the field  to be updated and its new value

--receives name of condition and new value
function fnUpdtCondition (p_name in varchar2, p_newName in varchar2) return varchar2;

--receives name of typeclock and new value
function fnUpdtTypeClock(p_name in varchar2, p_newName in varchar2) return varchar2;

--receives name of typeclock and new description
function fnUpdtTypeClockDescription(p_name in varchar2, p_newName in varchar2) return varchar2;

--receives name of brand and new value
function fnUpdtBrand(p_name in varchar2, p_newName in varchar2)return varchar2;

--receives name of buystatus and new value
function fnUpdtBuyStatus(p_name in varchar2, p_newName in varchar2) return varchar2;

--receives name of usertype and new value
function fnUpdtUserType(p_name in varchar2, p_newName in varchar2) return varchar2;

--receives name of payment method and new value
function fnUpdtPaymentMethod(p_name in varchar2, p_newName in varchar2) return varchar2;

--receives name of country and new value
function fnUpdtCountry(p_name in varchar2, p_newName in varchar2)return varchar2;

--receives name of phone and new value
function fnUpdtPhone(p_phonenumber in number,p_newphone in number) return varchar2;

--receives name of gender and new value
function fnUpdtGender(p_name in varchar2, p_newName in varchar2) return varchar2;

--receives name of identificationtype and new value
function fnUpdtIdentification(p_name in varchar2, p_newName in varchar2) return varchar2;

--receives name of city, name of country and new name for city
function fnUpdtCity(p_nameCity in varchar2,p_nameCountry in varchar2, p_newName in varchar2)return varchar2;

--receives name district, name of city and name of country  and new value
function fnUpdtDistrict(p_nameDistrict in varchar2, p_nameCity in varchar2, p_nameCountry in varchar2, p_newName in varchar2)return varchar2;
--receives name of model, brand and and new value
function fnUpdtModelP(p_nameModel in varchar2,p_nameBrand in varchar2, p_newName in varchar2)return varchar2;

--receives name of shipping method, company and  new value
function fnUpdtShippingMethod(p_nameShipping in varchar2,p_nameCompany in varchar2, p_newName in varchar2)return varchar2;
--receives name of phonetype and name of  new value
function fnUpdtPhoneType(p_namePhoneType in varchar2, p_newName in varchar2) return varchar2;
--receives id of buysale and name of new status
function fnUpdteBuysaleBuyS(p_idBuysale in number, p_status in varchar2)return varchar2;

--receives id of buysale and new price.
function fnUpdteBuysalePrice(p_idBuysale in number, p_price in number)return varchar2;

end  packageUPDATE;