create or replace PACKAGE      "PACKAGEFNLIST" is
--These functions return cursor with the information from a tuple, will be used in tables or comboboxes in java

-- returns cursor with namecondition and descriptionc from condition
function fnListConditionBasic return sys_RefCursor;

-- returns cursor with namecondition from condition
function fnListComboCondition return sys_RefCursor;

-- returns cursor with NAMETYPE,DESCRIPTIONT from typeclock
function fnListTypeClockBasic return sys_RefCursor;

-- returns cursor with namebrand from brand
function fnListBrandBasic return sys_RefCursor;

-- returns cursor with nameBrand from brand
function fnListBrandFull return sys_refCursor;

-- returns cursor with  status,descriptionB from buystatus
function fnListBuyStatusBasic return sys_RefCursor;

-- returns cursor with  nametype,descriptionype from usertype
function fnListUserTypeBasic return sys_RefCursor;

-- returns cursor with type from paymentmethod
function fnListPayMethodBasic return sys_RefCursor;

-- returns cursor with namecountry from country
function fnListCountryBasic return sys_RefCursor;

-- returns cursor with namecountry,codecountry from country
function fnListCountryInfoBasic return sys_RefCursor;

-- returns cursor with namecity from city
function fnListCityBasic(p_nameC in varchar2) return sys_Refcursor;

-- returns cursor with namedistrict from district
function fnListDistrictBasic(p_nameC in varchar2, p_nameCountry in varchar2) return sys_Refcursor; 
-- returns cursor with namegender from gender
Function fnListGenderBasic return sys_refcursor;

-- returns cursor with  namesm, company from shippingmethod
function fnListShippingMethodInfoBasic return sys_refcursor;

-- returns cursor with namesm from shippingmethod
function fnListShippingMethodBasic return sys_RefCursor;

-- returns cursor with typeid from identification
function fnListIdentification return SYS_REFCURSOR;

-- returns cursor with nametype from phonetype
function fnListPhoneType return SYS_REFCURSOR;

-- returns cursor with phonenumber from phone according to a user
function fnListPhonesFromUser(username in varchar2) return SYS_REFCURSOR;

-- returns cursor with namemodel from modelp according to brand
function fnListModelPBasic(nameBrand in varchar2) return SYs_refcursor;

-- returns cursor with nametype,descrptiont from typeclock
function fnListTypeClockInfoBasic return sys_refcursor;

-- returns cursor with codecountry from country
function fnListCodeCountry return sys_refcursor;

/* returns cursor with buysale.idbuysale, buysale.datepost, 
appuser.username,typeclock.nameType, brand.nameBrand, 
modelp.nameModel,condition.nameCondition, clock.manufacturedate,
clock.descriptionclock,clock.price for all the clocks for sale*/
function fnListAllClocksFsell return sys_refcursor;

-- returns cursor with status from buystatus
function fnListBuyStatusComboBasic return sys_refcursor;

-- returns cursor with buysale.idbuysale, 
                            --  typeclock.nameType, 
                            --  brand.nameBrand, 
                           --   modelp.nameModel,
                            --  condition.nameCondition,
                             -- clock.manufacturedate,
                            --  clock.descriptionclock,
                            --  clock.price as p,
                            --  buyStatus.status  from the clocks of posted by a user
function fnListMyClocks(p_username in varchar2) return sys_refcursor;

/* returns cursor with buysale.idbuysale, 
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
                              shippingmethod.namesm  from a clock a user has bought*/
function fnListBoughtClocks(p_username in varchar2) return sys_refcursor;
function fnListShoppingCart(p_username in varchar2) return sys_refcursor;
end packagefnlist;