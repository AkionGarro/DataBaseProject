--------------------------------------------------------
-- Archivo creado  - viernes-enero-14-2022   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Package PACKAGEDELETETUPLE
--------------------------------------------------------

  CREATE OR REPLACE PACKAGE "PR"."PACKAGEDELETETUPLE" is

function fnDelCondition (p_name in varchar2) return varchar2;
function fnDelTypeClock(p_name in varchar2) return varchar2;
function fnDelBrand(p_name in varchar2)return varchar2;
function fnDelBuyStatus(p_name in varchar2) return varchar2;
function fnDelUserType(p_name in varchar2) return varchar2;
function fnDelPaymentMethod(p_name in varchar2) return varchar2;
function fnDelCountry(p_name in varchar2)return varchar2;
end  packageDeleteTuple;


