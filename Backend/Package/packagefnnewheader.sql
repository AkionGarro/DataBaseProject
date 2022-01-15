--------------------------------------------------------
-- Archivo creado  - viernes-enero-14-2022   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Package PACKAGEFNNEW
--------------------------------------------------------

  CREATE OR REPLACE PACKAGE "PR"."PACKAGEFNNEW" is

function  fnNewappuser(p_username in VARCHAR2, 
                             p_idNumber in number,
                             p_userType in NUMBER, 
                             p_district in NUMBER,
		 	     p_password in VARCHAR2,
			     p_Email in VARCHAR2)return varchar2;

function  fnNewBrand(p_nameB in varchar2)return varchar2;
function   fnNewCountry(p_nameC in varchar2, p_codeCountry in varchar2)return varchar2;
function  fnNewBuyerRating(p_idUser in varchar2, p_rating in number)return varchar2;
function  fnNewBuySale(p_idUserS in number, p_idClock in NUMBER,
                             p_idBuyS in NUMBER)return varchar2;

function  fnNewBuyStatus(p_nameB in varchar2, p_descriptionB in varchar2)return varchar2;

function  fnNewCity(p_nameC in varchar2, p_idCountry in varchar2)return varchar2;
function  fnNewClockBuysale(  
                            p_idModel in varchar2,
		 	                p_idCondition in varchar2,
		                    p_descriptionClock in VARCHAR2,
			                p_manufactureDate in DATE,
                            p_vintage in VARCHAR2,
                            p_price in number,
                            p_idUserS in varchar2,
                            p_idBuyS in VARCHAR2,
                            p_idBrand in varchar2)return varchar2;

function  fnNewCondition(p_nameC in varchar2, p_descriptionC in varchar2)return varchar2;

function  fnNewDistrict(p_nameD in varchar2, p_nameCity in varchar2, p_nameCountry in varchar2)return varchar2;
function  fnNewHistory_AppuserxBuysale(p_idUser in varchar2, 
                                              p_idSale in NUMBER)return varchar2;

function FNNEWIDENTIFICATION(p_identification in VARCHAR2) RETURN VARCHAR2;

function  fnNewModelP( p_nameModel in VARCHAR2,p_idBrand in varchar2,p_nameType in varchar2)return varchar2;

function  fnNewMSG_userxuser(p_idWriter in varchar2,
                                        p_idRecipient in varchar2,
                                        p_subject in VARCHAR2,
                                        p_descriptionM IN VARCHAR2)return varchar2;
function  fnNewPaymentMethod(p_namep in varchar2)return varchar2;

function  fnNewPeopleappuser(p_identification in VARCHAR2, 
                             p_idType in varchar2,
                             p_idGender in varchar2, 
                             p_idCountry in varchar2,
                             p_birthdate in DATE,
                             p_name in VARCHAR2,
                             p_surname in VARCHAR2,
                             p_secondsurname VARCHAR2,p_username in VARCHAR2, 
                            
                              
                             p_district in varchar2,
		 	     p_password in VARCHAR2,
			     p_Email in VARCHAR2,p_idCity in varchar2, p_aCountry in varchar2)return varchar2;
function  fnNewReview(p_descriptionR in VARCHAR2, p_rating in NUMBER)return varchar2;
function  fnNewSellerRating(p_idUser in varchar2, p_rating in number)return varchar2;
function  fnNewShCart_appuserxclock(p_idappuser in varchar2,
				      p_Clock in NUMBER)return varchar2;
function  fnNewShippingMethod(p_nameSM in VARCHAR2, p_company VARCHAR2)return varchar2;
function  fnNewTypeClock(p_nameT in varchar2, p_descriptionT in varchar2)return varchar2;

function  fnNewuserType(p_nameT in varchar2, p_descriptionT in varchar2)return varchar2;
function  fnNewWlistUserxClock( p_idUser in varchar2, 
                        p_idClock in NUMBER)return varchar2;
function  fnNewGender(p_nameG in varchar2)return varchar2;



end packagefnnew;
