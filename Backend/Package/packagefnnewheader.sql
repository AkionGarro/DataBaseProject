create or replace PACKAGE      "PACKAGEFNNEW" is
--This package has the functions required for inserting tuples in the tables, they receive values which can not be null

--receives username,id number, type of user, district, password and email to create a user
function  fnNewappuser(p_username in VARCHAR2, 
                             p_idNumber in number,
                             p_userType in NUMBER, 
                             p_district in NUMBER,
		 	     p_password in VARCHAR2,
			     p_Email in VARCHAR2)return varchar2;
--- receives name to create brand
function  fnNewBrand(p_nameB in varchar2)return varchar2;

--- receives name to create country
function   fnNewCountry(p_nameC in varchar2, p_codeCountry in varchar2)return varchar2;

--- receives id of user and rating 
function  fnNewBuyerRating(p_idUser in varchar2, p_rating in number)return varchar2;

--- receives id of the userseller, id of the clock, and id of the buystatus  to create newbuysale
function  fnNewBuySale(p_idUserS in number, p_idClock in NUMBER,
                             p_idBuyS in NUMBER)return varchar2;

--- receives name and description to create buystatus
function  fnNewBuyStatus(p_nameB in varchar2, p_descriptionB in varchar2)return varchar2;

---receives name of the city and id of the country to create a city
function  fnNewCity(p_nameC in varchar2, p_idCountry in varchar2)return varchar2;
---receives id of the model, id of condition, description of clock, manufacture date, vintage, price, id of user seller, id of buystatus, id of brand
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
--receives name and description to create new condition
function  fnNewCondition(p_nameC in varchar2, p_descriptionC in varchar2)return varchar2;

--receives name of district, name of city and name of country to create a new district
function  fnNewDistrict(p_nameD in varchar2, p_nameCity in varchar2, p_nameCountry in varchar2)return varchar2;
--receives id of user and id of buysale to add an item to history of bought clocks
function  fnNewHistory_AppuserxBuysale(p_idUser in varchar2, 
                                              p_idSale in NUMBER)return varchar2;

--receives name of identification to create identification
function FNNEWIDENTIFICATION(p_identification in VARCHAR2) RETURN VARCHAR2;

--receives name of the model, id of the brand, and type of clock to create a model
function  fnNewModelP( p_nameModel in VARCHAR2,p_idBrand in varchar2,p_nameType in varchar2)return varchar2;

--receives id of writer, it of recipient, id of subject, and description to create a message
function  fnNewMSG_userxuser(p_idWriter in varchar2,
                                        p_idRecipient in varchar2,
                                        p_subject in VARCHAR2,
                                        p_descriptionM IN VARCHAR2)return varchar2;
                                        
--receives name to create a payment method
function  fnNewPaymentMethod(p_namep in varchar2)return varchar2;

--- receives identification, type of id, gender, country, birthdate, name, surname,
--secondsurname,password,email,district,city, country, phonenumber,phonecode, type of phone to create a new user
function  fnNewPeopleappuser(p_identification in VARCHAR2, 
                             p_idType in varchar2,
                             p_idGender in varchar2, 
                             p_idCountry in varchar2,
                             p_birthdate in DATE,
                             p_name in VARCHAR2,
                             p_surname in VARCHAR2,
                             p_secondsurname VARCHAR2,
                             p_username in VARCHAR2,                              
                             p_password in VARCHAR2,
                             p_Email in VARCHAR2,
                             p_district in varchar2,
                             p_idCity in varchar2,
                             p_aCountry in varchar2,
                             p_phoneNumber in number,
                             p_phoneCode in varchar2,
                             p_phoneType in varchar2)return varchar2;
                             
--receives description and rating of review
function  fnNewReview(p_descriptionR in VARCHAR2, p_rating in NUMBER)return varchar2;

-- receives id of the user and rating to add seller rating 
function  fnNewSellerRating(p_idUser in varchar2, p_rating in number)return varchar2;

-- receives id of the user and id of the clock to add to shoppingcart
function  fnNewShCart_appuserxclock(p_idappuser in varchar2,
				      p_BuySale in NUMBER)return varchar2;
-- receives id of the shipping method and company  to create a shipping method
function  fnNewShippingMethod(p_nameSM in VARCHAR2, p_company VARCHAR2)return varchar2;

--receives name of the type and description of the type to create a new type of clock
function  fnNewTypeClock(p_nameT in varchar2, p_descriptionT in varchar2)return varchar2;
-- receives name of tye and description to create a new usertype
function  fnNewuserType(p_nameT in varchar2, p_descriptionT in varchar2)return varchar2;

--receives id of the user and idclock to add item to wishlist
function  fnNewWlistUserxClock( p_idUser in varchar2, 
                        p_idClock in NUMBER)return varchar2;
--receives name of gender to create a gender
function  fnNewGender(p_nameG in varchar2)return varchar2;

--receives phone number, username of owner, type of phone and name of country to add a phone
function fnNewPhone(p_number in number,p_username in varchar2,p_nametype in varchar2,p_nameCountry in varchar2)return varchar2;

--receives name of phonetype to create a phonetype
function fnNewPhoneType(p_nameType in varchar2)return varchar2;

---receives username id of buysale  payment method, shipping method to buy a clock
function fnNewBuy(p_username in varchar2, p_idbuysale in number, p_paymentmethod in varchar2,p_shippingmethod in varchar2) return varchar2;

end packagefnnew;