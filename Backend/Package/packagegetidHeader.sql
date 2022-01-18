create or replace PACKAGE      "PACKAGEGETID" AS
/*These functions receive their unique key and return their primary key
    @param p_username in varchar2 name of the user
    @return id of the user
    */

function getIdUserName(p_username in varchar2)return number;

--receives name of brand  returns id of brand
function getIdBrand(p_nameBrand in varchar2)return number;



--receives name of buystatus returns id of buystatus
function getIdBuyStatus(p_name in varchar2)return number;

--receives name of city, id of country, returns idcity
function getIdCity(p_nameC in varchar2, p_idCountry in number)return number;

--receives name of condition returns id of condition
--
function getIdCondition(p_nameC in varchar2)return number;

--receives name of country returns id of country

function getIdCountry(p_nameC in varchar2)return number;
--receives name of district, id of city returns id of district
function getIdDistrict(p_nameC in varchar2, p_idCity in number)return number;
--receives name of gender returns id gender
function getIdGender(p_nameC in varchar2)return number;
--receives name of name of identification returns id of identification type
function getIdIdentification(p_nameC in varchar2)return number;
--receives name of model, id of brand returns id of model
function getIdModel(p_nameC in varchar2, p_idBrand in number)return number;
--receives name of paymentmethod returns id of paymentmethod
function getIdPaymentMethod(p_nameC in varchar2)return number;
--receives identificationnumber of people returns id of people
function getIdPeople(p_identification in varchar2) return number;
--receives name of shippingmethod returns id of shipping method
function getidShippingMethod(p_nameC in varchar2)return number;
--receives name of clocktype returns id of the clocktype
function getidTypeClock(p_nameC in varchar2)return number;
--receives name of usertype returns id of usertype

function getidUsertype(p_nameC in varchar2)return number;

--receives name of phonetype returns id of phonetype
function getidPhoneType(p_name in varchar2) return number;
--receives code of country returns id of country
function getIdCountryWCode(p_codeCountry in varchar2)return number;
--receives id of buysale returns if of clock
function getIdClock(p_idBuysale in number)return number;

end packagegetid;