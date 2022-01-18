create or replace PACKAGE      "PACKAGEPCD" is
procedure new_APPUSER(p_username in VARCHAR2, 
                             p_idNumber in number,
                             p_userType in NUMBER, 
                             p_district in NUMBER,
		 	     p_password in VARCHAR2,
			     p_Email in VARCHAR2);
procedure new_COUNTRY(p_nameCountry in VARCHAR2,p_codeCountry in varchar2);
PROCEDURE new_HISTORY_APPUSERXBUYSALE(p_idUser in NUMBER, 
                                              p_idSale in NUMBER);
PROCEDURE new_MSG_USERXUSER(p_idWriter in number,
                                        p_idRecipient in number,
                                        p_subject in VARCHAR2,
                                        p_descriptionM IN VARCHAR2, p_sendDate in DATE); 
procedure new_People(p_identification in VARCHAR2, 
                             p_idType in NUMBER,
                             p_idGender in NUMBER, 
                             p_idCountry in NUMBER,
		 	     p_birthdate in DATE,
		             p_name in VARCHAR2,
			     p_surname in VARCHAR2,
			     p_secondsurname VARCHAR2);
procedure new_shcart_appuserxclock(p_idappuser in NUMBER,
				      p_Clock in NUMBER);
procedure new_SHIPPINGMETHOD(p_nameSM in VARCHAR2, p_company VARCHAR2);
procedure new_Brand(p_nameBrand in VARCHAR2);
PROCEDURE new_BUYSTATUS(p_status in VARCHAR2, p_descriptionB in varchar2);
procedure new_BUYERRATING(p_idappuser in NUMBER,
                        p_rating in number);
procedure new_buySale(p_idUserS in VARCHAR2, 
                             p_idC in NUMBER,
                             p_idBuyS in NUMBER, 
                             p_date in DATE);
procedure new_CITY(p_nameCity in VARCHAR2,
				      p_Countryid in number);
procedure new_CLOCK(

                            p_idModel in NUMBER,
		 	                p_idCondition in NUMBER,
		                    p_descriptionClock in VARCHAR2,
			                p_manufactureDate in DATE,
                            p_vintage in VARCHAR2,

                            p_price in VARCHAR2);
procedure new_Condition(p_nameCondition in VARCHAR2,
                                          p_descriptionC in VARCHAR2);
procedure  new_DISTRICT(p_nameDistrict in VARCHAR2, 
                        p_idCity in NUMBER);
procedure new_GENDER(p_nameGender in VARCHAR2);
procedure new_IDENTIFICATION(p_identification in VARCHAR2);
procedure new_MODELP(

                        p_idBrand in NUMBER,
                        p_nameModel in VARCHAR2,p_idType in number);
procedure new_PAYMENTMETHOD(
                        p_type in VARCHAR2);
PROCEDURE new_PHOTOCLOCK(p_idClock in NUMBER, 
                                           p_photo in BLOB,
                                           p_descriptionP in varchar2);
PROCEDURE new_Review(p_descriptionR in VARCHAR2, p_rating in NUMBER);
procedure new_SELLERRATING( 
                        p_username in number,
                        p_rating in number);
procedure  new_typeClock(p_nameType in VARCHAR2,
                                           p_description in VARCHAR2 );
procedure new_USERTYPE( p_nameType in varchar2, 
                        p_descriptionType in VARCHAR2);

procedure new_WLISTUSERXCLOCK(
                        p_idUser in NUMBER, 
                        p_idClock in NUMBER);

END PACKAGEPCD;
