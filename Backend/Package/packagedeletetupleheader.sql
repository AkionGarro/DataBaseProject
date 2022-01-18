create or replace PACKAGE      "PACKAGEDELETETUPLE" is
-- This package contains functions to delete a tuple, they return a varchar2 with the state of the transaction

--fnDelCondition receives param p_name is the name of the condition to delete
function fnDelCondition (p_name in varchar2) return varchar2;

--fnDelTypeClock receives param p_name is the name of the type to delete
function fnDelTypeClock(p_name in varchar2) return varchar2;

--fnDelBrand receives param p_name is the name of the brand to delete
function fnDelBrand(p_name in varchar2)return varchar2;

--fnDelBuySatus receives param p_name is the name of the buystatus to delete
function fnDelBuyStatus(p_name in varchar2) return varchar2;

--fnDelUserType receives param p_name is the name of the usertype to delete
function fnDelUserType(p_name in varchar2) return varchar2;

--fnDelPaymentMethod receives param p_name is the name of the payment method to delete
function fnDelPaymentMethod(p_name in varchar2) return varchar2;

--fnDelCountry receives param p_name is the name of the country to delete
function fnDelCountry(p_name in varchar2)return varchar2;

--fnDelPhone receives param p_phonenumber is the phonenumber to delete
function fnDelPhone(p_phonenumber in number) return varchar2;

--fnDelGender receives param p_name is the name of the gender to delete
function fnDelGender(p_name in varchar2) return varchar2;

--fnDelIdentificationreceives param p_name is the name of the identificationtype to delete
function fnDelIdentification(p_name in varchar2) return varchar2;

--fnDelCity receives param p_nameCity  is the name of the city to delete param  is the name of the country that city belongs to
function fnDelCity(p_nameCity in varchar2,p_nameCountry in varchar2)return varchar2;

--fnDelDistrict receives param p_nameDistrict  is the name of the district to delete param p_nameCity  is the name of the city that district belongs to param  is the name of the country that city belongs to
function fnDelDistrict(p_nameDistrict in varchar2, p_nameCity in varchar2, p_nameCountry in varchar2)return varchar2;

--fnDelBuySaleClock receives param p_id_buySale is the name of the buysale post to delete
function fnDelBuySaleClock(p_id_buySale in number) return varchar2;

--fnDelModelP receives param p_namemodelp is the name of the model to delete
function fnDelModelP(p_nameModel in varchar2,p_nameBrand in varchar2)return varchar2;

--fnDelShippingMethod receives param p_nameShipping is the name of the shipping method to delete
function fnDelShippingMethod(p_nameShipping in varchar2,p_nameCompany in varchar2)return varchar2;

--fnDelShCart receives param p_idBuysale is the name of the buysale in shoppingcart to delete
function fnDelShCart(p_idBuySale in number)return varchar2;

--fnDelWlist receives param p_idBuysale is the name of the buysale in wishlist to delete
function fnDelWlist(p_idBuySale in number)return varchar2;

--fnDelPhoneType receives param p_namePhonetype is the name of the phonetype to delete
function fnDelPhoneType(p_namePhoneType in varchar2) return varchar2;

end  packageDeleteTuple;