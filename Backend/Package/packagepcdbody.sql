--------------------------------------------------------
-- Archivo creado  - viernes-enero-14-2022   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Package Body PACKAGEPCD
--------------------------------------------------------

  CREATE OR REPLACE PACKAGE BODY "PR"."PACKAGEPCD" AS
procedure new_APPUSER(p_username in VARCHAR2, 
                             p_idNumber in number,
                             p_userType in NUMBER, 
                             p_district in NUMBER,
		 	     p_password in VARCHAR2,
			     p_Email in VARCHAR2)

     is
BEGIN
INSERT INTO APPUSER(idappuser,username,idPeople,userType,district,passworda,email)
values(s_appuser.nextval,p_username,p_idNumber,p_userType,p_district,p_password,p_Email);
END new_APPUSER; 

procedure new_COUNTRY(p_nameCountry in VARCHAR2, p_codeCountry in VARCHAR2)
IS
BEGIN
INSERT INTO COUNTRY(idCountry,nameCountry,codeCountry)
values(s_Country.nextval,p_nameCountry, p_codeCountry);

end new_COUNTRY;

PROCEDURE new_HISTORY_APPUSERXBUYSALE(p_idUser in NUMBER, 
                                              p_idSale in NUMBER)
IS
BEGIN
INSERT INTO HISTORY_APPUSERXBUYSALE(idUser,idbuySale)
values(p_idUSer,p_idSale);

end new_HISTORY_APPUSERXBUYSALE;

PROCEDURE new_MSG_USERXUSER(p_idWriter in NUMBER,
                                        p_idRecipient in NUMBER,
                                        p_subject in VARCHAR2,
                                        p_descriptionM IN VARCHAR2, p_sendDate in DATE)
is
BEGIN
INSERT INTO MSG_USERXUSER(idWriter,idRecipient,subject,descriptionM,sendDate)
values(p_idWriter,p_idRecipient,p_subject,p_descriptionM,p_sendDate);

end new_MSG_USERXUSER;

procedure new_People(p_identification in VARCHAR2, 
                             p_idType in NUMBER,
                             p_idGender in NUMBER, 
                             p_idCountry in NUMBER,
		 	     p_birthdate in DATE,
		             p_name in VARCHAR2,
			     p_surname in VARCHAR2,
			     p_secondsurname VARCHAR2)
is
BEGIN
INSERT INTO PEOPLE(idPeople,identificationNumber,identificationType,gender,citenzenship,birthdate,namePeople,surname,secondsurname)
values(s_people.nextval,p_identification,p_idType,p_idGender,p_idCountry,p_birthdate,p_name,p_surname,p_secondsurname);
END new_People;

procedure new_shcart_appuserxclock(p_idappuser in NUMBER,
				      p_Clock in NUMBER)
IS
BEGIN
INSERT INTO shcart_appuserxclock(idUser,idClock)
values(p_idappuser,p_Clock);

end new_shcart_appuserxclock;

procedure new_SHIPPINGMETHOD(p_nameSM in VARCHAR2, p_company VARCHAR2)
IS
BEGIN
INSERT INTO SHIPPINGMETHOD(idShipping, nameSM, company)
values(s_SHIPPINGMETHOD.nextval, p_nameSM, p_company);

end new_SHIPPINGMETHOD;
procedure new_Brand(p_nameBrand in VARCHAR2)
IS
BEGIN
INSERT INTO BRAND(idBrand,nameBrand)
values(s_BRAND.nextval,p_nameBrand);

end new_BRAND;
PROCEDURE new_BUYSTATUS(p_status in VARCHAR2, p_descriptionB in varchar2)
is
BEGIN
insert into BUYSTATUS(idBuyStatus,status, descriptionB)
values(s_BUYSTATUS.nextval,p_status,p_descriptionB);

end new_BUYSTATUS;
procedure new_BUYERRATING(p_idappuser in NUMBER,
                        p_rating in number)

is
BEGIN
INSERT INTO BUYERRATING (idBuyRating,idappuser,rating)
values(s_buyerrating.NEXTVAL,p_idappuser,p_rating);

END new_BUYERRATING;
procedure new_buySale(p_idUserS in VARCHAR2, 
                             p_idC in NUMBER,
                             p_idBuyS in NUMBER, 
                             p_date in DATE)
is
BEGIN
INSERT INTO BUYSALE(idBuySale,idUserSeller,idClock,idBuyStatus,datePost)
values(s_BUYSALE.nextval,p_idUserS,p_idC,p_idBuyS,p_date);

END new_buySale;

procedure new_CITY(p_nameCity in VARCHAR2,
				      p_Countryid in NUMBER)
IS
BEGIN
INSERT INTO CITY(idCity,idCountry, nameCity)
values(s_CITY.nextval,p_Countryid,p_nameCity);

end new_CITY;

procedure new_CLOCK( 
                            p_idModel in NUMBER,
		 	                p_idCondition in NUMBER,
		                    p_descriptionClock in VARCHAR2,
			                p_manufactureDate in DATE,
                            p_vintage in VARCHAR2,

                            p_price in VARCHAR2)

is
BEGIN
INSERT INTO CLOCK(idClock,idModel,idCondition,descriptionClock,manufactureDate,vintage,price)
values(s_Clock.nextval,p_idModel,p_idCondition,p_descriptionClock,p_manufactureDate,p_vintage,p_price);

END new_CLOCK;

procedure new_CONDITION(p_nameCondition in VARCHAR2,
                                          p_descriptionC in VARCHAR2)
is
BEGIN
INSERT INTO CONDITION(idCondition,nameCondition,descriptionC)
values(s_CONDITION.nextval,p_nameCondition,p_descriptionC);

end new_CONDITION;

procedure new_DISTRICT(p_nameDistrict in VARCHAR2, 
                        p_idCity in NUMBER)
                        
is
BEGIN
INSERT INTO DISTRICT(idDistrict,nameDistrict,idCity)
values(s_District.nextVal,p_nameDistrict,p_idCity);

END new_DISTRICT;

procedure new_GENDER(p_nameGender in VARCHAR2)
IS
BEGIN
INSERT INTO GENDER(idGender,nameGender)
values(s_Gender.nextval,p_nameGender);

end new_GENDER;

procedure new_IDENTIFICATION(p_identification in VARCHAR2)
IS
BEGIN
INSERT INTO IDENTIFICATION(idIdentification,typeId)
values(s_IDENTIFICATION.nextval,p_identification);

end new_IDENTIFICATION;

procedure new_MODELP(

                        p_idBrand in NUMBER,
                        p_nameModel in VARCHAR2, p_idType in number)

is
BEGIN
INSERT INTO MODELP(idModel,idBrand,nameModel,idTypeClock)
values(s_modelp.NEXTVAL,p_idBrand,p_nameModel,p_idType);

END new_MODELP;

procedure new_PAYMENTMETHOD(
                        p_type in VARCHAR2)
is
BEGIN
INSERT INTO PAYMENTMETHOD (idPay,type)
values(s_paymentmethod.nextval,p_type);

END new_PAYMENTMETHOD;

PROCEDURE new_PHOTOCLOCK(p_idClock in NUMBER, 
                                           p_photo in BLOB,
                                           p_descriptionP in varchar2)
IS 
BEGIN
INSERT INTO PHOTOCLOCK(idPhoto,idClock,photo)
values(s_PHOTOCLOCK.nextval,p_idClock,p_descriptionP);
end new_photoClock;

PROCEDURE new_Review(p_descriptionR in VARCHAR2, p_rating in NUMBER)
IS
BEGIN 
INSERT INTO REVIEW(idReview,descriptionR,rating)
values(s_REVIEW.nextval, p_descriptionR, p_rating);

end new_Review;

procedure new_SELLERRATING( p_username in NUMBER,
                        p_rating in number)

is
BEGIN
INSERT INTO SELLERRATING(idSellRating,idAppuser,rating)
values(s_sellerrating.NEXTVAL,p_username,p_rating);

END new_SELLERRATING;

procedure  new_typeClock(p_nameType in VARCHAR2,
                                           p_description in VARCHAR2 )
is
BEGIN
INSERT INTO TYPECLOCK(idType,nameType,descriptionT)
values(s_TYPECLOCK.nextval,p_nameType, p_description); 

end new_TypeClock;

procedure new_USERTYPE(
                        p_nameType in varchar2, 
                        p_descriptionType in VARCHAR2)

is
BEGIN
INSERT INTO USERTYPE(idUserType,nameType,descriptionType)
values(s_UserType.nextval,p_nameType,p_descriptionType);

END new_USERTYPE;

procedure new_WLISTUSERXCLOCK(
                        p_idUser in number, 
                        p_idClock in NUMBER)

is
BEGIN
INSERT INTO WLISTUSERXCLOCK(idUser,idClock)
values(p_idUser,p_idClock);

END new_WLISTUSERXCLOCK;


END PACKAGEPCD;
