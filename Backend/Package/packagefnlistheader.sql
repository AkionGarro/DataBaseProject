--------------------------------------------------------
-- Archivo creado  - jueves-enero-13-2022   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Package PACKAGEFNLIST
--------------------------------------------------------

  CREATE OR REPLACE PACKAGE "PR"."PACKAGEFNLIST" is

function fnListConditionBasic return sys_RefCursor;
function fnListTypeClockBasic return sys_RefCursor;
function fnListBrandBasic return sys_RefCursor;
function fnListBrandFull return sys_refCursor;
function fnListBuyStatusBasic return sys_RefCursor;
function fnListUserTypeBasic return sys_RefCursor;
function fnListPayMethodBasic return sys_RefCursor;
function fnListCountryBasic return sys_RefCursor;
function fnListCountryInfoBasic return sys_RefCursor;
function fnListCityBasic(p_nameC in varchar2) return sys_Refcursor;
function fnListDistrictBasic(p_nameC in varchar2, p_nameCountry in varchar2) return sys_Refcursor; 
Function fnListGenderBasic return sys_refcursor;
function fnListShippingMethodInfoBasic return sys_refcursor;
function fnListShippingMethodBasic return sys_RefCursor;
function fnListIdentification return SYS_REFCURSOR;
function fnListPhoneType return SYS_REFCURSOR;
function fnListPhonesFromUser(username in varchar2) return SYS_REFCURSOR;


end packagefnlist;


