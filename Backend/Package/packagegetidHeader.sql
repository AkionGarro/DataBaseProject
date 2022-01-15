--------------------------------------------------------
-- Archivo creado  - viernes-enero-14-2022   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Package PACKAGEGETID
--------------------------------------------------------

  CREATE OR REPLACE PACKAGE "PR"."PACKAGEGETID" AS
function getIdUserName(p_username in varchar2)return number;

function getIdBrand(p_nameBrand in varchar2)return number;




function getIdBuyStatus(p_name in varchar2)return number;


function getIdCity(p_nameC in varchar2, p_idCountry in number)return number;
function getIdCondition(p_nameC in varchar2)return number;

function getIdCountry(p_nameC in varchar2)return number;

function getIdDistrict(p_nameC in varchar2, p_idCity in number)return number;

function getIdGender(p_nameC in varchar2)return number;

function getIdIdentification(p_nameC in varchar2)return number;

function getIdModel(p_nameC in varchar2, p_idBrand in number)return number;

function getIdPaymentMethod(p_nameC in varchar2)return number;

function getIdPeople(p_identification in varchar2) return number;

function getidShippingMethod(p_nameC in varchar2)return number;

function getidTypeClock(p_nameC in varchar2)return number;

function getidUsertype(p_nameC in varchar2)return number;

end packagegetid;
