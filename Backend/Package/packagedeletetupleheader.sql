create or replace PACKAGE      "PACKAGEDELETETUPLE" is

function fnDelCondition (p_name in varchar2) return varchar2;
function fnDelTypeClock(p_name in varchar2) return varchar2;
function fnDelBrand(p_name in varchar2)return varchar2;
function fnDelBuyStatus(p_name in varchar2) return varchar2;
function fnDelUserType(p_name in varchar2) return varchar2;
function fnDelPaymentMethod(p_name in varchar2) return varchar2;
function fnDelCountry(p_name in varchar2)return varchar2;
function fnDelPhone(p_phonenumber in number) return varchar2;
function fnDelGender(p_name in varchar2) return varchar2;
function fnDelIdentification(p_name in varchar2) return varchar2;
function fnDelCity(p_nameCity in varchar2,p_nameCountry in varchar2)return varchar2;

function fnDelBuySaleClock(p_id_buySale in number) return varchar2;
function fnDelModelP(p_nameModel in varchar2,p_nameBrand in varchar2)return varchar2;
function fnDelShippingMethod(p_nameShipping in varchar2,p_nameCompany in varchar2)return varchar2;
function fnDelShCart(p_idBuySale in number)return varchar2;
function fnDelWlist(p_idBuySale in number)return varchar2;
end  packageDeleteTuple;

