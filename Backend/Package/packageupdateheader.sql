create or replace PACKAGE      "PACKAGEUPDATE" is

function fnUpdtCondition (p_name in varchar2, p_newName in varchar2) return varchar2;
function fnUpdtTypeClock(p_name in varchar2, p_newName in varchar2) return varchar2;
function fnUpdtBrand(p_name in varchar2, p_newName in varchar2)return varchar2;
function fnUpdtBuyStatus(p_name in varchar2, p_newName in varchar2) return varchar2;
function fnUpdtUserType(p_name in varchar2, p_newName in varchar2) return varchar2;
function fnUpdtPaymentMethod(p_name in varchar2, p_newName in varchar2) return varchar2;
function fnUpdtCountry(p_name in varchar2, p_newName in varchar2)return varchar2;
function fnUpdtPhone(p_phonenumber in number,p_newphone in number) return varchar2;
function fnUpdtGender(p_name in varchar2, p_newName in varchar2) return varchar2;
function fnUpdtIdentification(p_name in varchar2, p_newName in varchar2) return varchar2;
function fnUpdtCity(p_nameCity in varchar2,p_nameCountry in varchar2, p_newName in varchar2)return varchar2;
function fnUpdtDistrict(p_nameDistrict in varchar2, p_nameCity in varchar2, p_nameCountry in varchar2, p_newName in varchar2)return varchar2;

function fnUpdtModelP(p_nameModel in varchar2,p_nameBrand in varchar2, p_newName in varchar2)return varchar2;
function fnUpdtShippingMethod(p_nameShipping in varchar2,p_nameCompany in varchar2, p_newName in varchar2)return varchar2;

function fnUpdtPhoneType(p_namePhoneType in varchar2, p_newName in varchar2) return varchar2;
end  packageUPDATE;