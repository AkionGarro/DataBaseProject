create or replace PACKAGE BODY      "PACKAGEFNNEW" AS

-- Every function returns varchar2 telling if the operation was successfull or not, using exceptions for null values and duplicates
function  fnNewappuser(p_username in VARCHAR2, 
                             p_idNumber in number,
                             p_userType in NUMBER, 
                             p_district in NUMBER,
		 	     p_password in VARCHAR2,
			     p_Email in VARCHAR2)return varchar2 as
val varchar2(50);

begin

    packagepcd.new_appuser(p_username, 
                             p_idNumber,
                             p_userType , 
                             p_district,
		 	     p_password ,
			     p_Email);
    val:='Successfully Created';
    return val;
end fnNewappuser;

function  fnNewBrand(p_nameB in varchar2)return varchar2 as
val varchar2(50);
v_nameType number(3);
v_idBrand number(10);
begin
    packagepcd.new_Brand(p_nameB);
    commit;
    val:='Successfully Created';
    return val;
exception
    WHEN no_data_found THEN
     val:='Wrong or missing information'; 
     rollback;
     return val;
    when dup_val_on_index then
     val:='Already exists';
     rollback;
     return val;
    when others then
     val:='Wrong data';
     rollback;
     return val;

end fnNewBrand;




function  fnNewCountry(p_nameC in varchar2, p_codeCountry in varchar2)return varchar2 as
val varchar2(50);

begin
    packagepcd.new_Country(p_nameC,p_codeCountry);
    commit;
    val:='Successfully Created';
    return val;
exception
    WHEN no_data_found THEN
     val:='Wrong or missing information'; 
     return val;
    when dup_val_on_index then
     val:='Already exists';   
     return val;
    when others then
     val:='Wrong data DB';
     return val;

end fnNewCountry;


function  fnNewBuyerRating(p_idUser in varchar2, p_rating in number)return varchar2 as
val varchar2(50);
v_idUser number(8);
begin
    select appuser.idappuser into v_idUser from appuser where(appuser.username=p_idUser);
    packagepcd.new_buyerrating(v_idUSer,p_rating);
    commit;
    val:='Successfully Created';
    return val;
exception
    WHEN no_data_found THEN
     val:='Wrong or missing information'; 
     return val;
    when dup_val_on_index then
     val:='Already exists';   
     return val;
    when others then
     val:='Wrong data';
     return val;

end fnNewBuyerRating;

function  fnNewBuySale(p_idUserS in number, p_idClock in NUMBER,
                             p_idBuyS in NUMBER)return varchar2 as
val varchar2(50);

begin

    packagepcd.new_BuySale(p_idUserS,p_idClock, p_idBuyS, SYSDATE );
    val:='Successfully Created';
    return val;

end fnNewBuySale;

 function  fnNewBuyStatus(p_nameB in varchar2, p_descriptionB in varchar2)return varchar2 as
val varchar2(50);

begin
    packagepcd.new_BuyStatus(p_nameB,p_descriptionB);
    commit;
    val:='Successfully Created';
    return val;
exception
    WHEN no_data_found THEN
     val:='Wrong or missing information'; 
     return val;
    when dup_val_on_index then
     val:='Already exists';   
     return val;
    when others then
     val:='Wrong data';
     return val;
end fnNewBuyStatus;

function  fnNewCity(p_nameC in varchar2, p_idCountry in varchar2)return varchar2 as
val varchar2(50);
idCountry number(8);
begin
    idCountry:=packagegetid.getidCountry(p_idCountry);
    packagepcd.new_City(p_nameC,idCountry);
    val:='Successfully Created';
    return val;
exception
    WHEN no_data_found THEN
     val:='Wrong or missing information'; 
     return val;
    when dup_val_on_index then
     val:='Already exists';   
     return val;
    when others then
     val:='Wrong data';
     return val;
end fnNewCity;


function  fnNewClockBuysale(   p_idModel in varchar2,
		 	                p_idCondition in varchar2,
		                    p_descriptionClock in VARCHAR2,
			                p_manufactureDate in DATE,
                            p_vintage in VARCHAR2,
                            p_price in number,
                            p_idUserS in varchar2,
                            p_idBuyS in varchar2,
                            p_idBrand in varchar2)return varchar2
as
val varchar2(50);

v_idModel number(10);
v_idBrand number(10);
v_idCondition number(2);
v_idUserS number(8);
v_idBuyS number(8);

begin
    v_idBrand:=packagegetid.getidBrand(p_idBrand);
    v_idModel:=packagegetid.getidModel(p_idModel,v_idBrand);
    v_idCondition:=packagegetid.getidCondition(p_idCondition);
    v_idUserS:=packagegetid.getIdusername(p_idUsers);
    v_idBuyS:=packagegetid.getIdBuyStatus(p_idbuyS);
    


INSERT INTO CLOCK(idClock,idModel,idCondition,descriptionClock,manufactureDate,vintage,price)
values(s_Clock.nextval,v_idModel,v_idCondition,p_descriptionClock,p_manufactureDate,'1',p_price);

INSERT INTO BUYSALE(idBuySale,idUserSeller,idClock,idBuyStatus,datePost)
values(s_BUYSALE.nextval,v_idUserS,s_clock.currval,
                       v_idBuyS,SYSDATE);
  
       val:='Your clock has been registered';               
    commit;
    return val;
exception
    WHEN no_data_found THEN
     rollback;
     val:='Wrong or missing information'; 
     return val;
    when dup_val_on_index then
     rollback;   
     val:='Already exists';   
     return val;
    when others then
     rollback;   
     val:='Wrong data';
     return val;
end fnNewClockBuysale;

function  fnNewCondition(p_nameC in varchar2, p_descriptionC in varchar2)return varchar2 as
val varchar2(50);

begin

    packagepcd.new_Condition(p_nameC,p_descriptionC);
    commit;
    val:='Successfully Created';
    return val;
exception
    WHEN no_data_found THEN
     val:='Wrong or missing information'; 
     return val;
    when dup_val_on_index then
     val:='Already exists';   
     return val;
    when others then
     val:='Wrong data';
     return val;

end fnNewCondition;
 function  fnNewDistrict(p_nameD in varchar2, p_nameCity in varchar2, p_nameCountry in varchar2)return varchar2 as
val varchar2(50);
v_idCity number(8);
v_idCountry number(8);
begin

    v_idCountry:=packagegetid.getidCountry(p_nameCountry);
    v_idCity:=packagegetId.getIdCity(p_namecity,v_idCountry);
    dbms_output.put_line('this happened');
    packagepcd.new_district(p_nameD,v_idCity);
    commit;
    val:='Successfully Created';
    return val;
exception
    WHEN no_data_found THEN
     val:='Wrong or missing information'; 
     return val;
    when dup_val_on_index then
     val:='Already exists';   
     return val;
    when others then
     val:='Wrong data DB';
     return val;
end fnNewDistrict;

function  fnNewHistory_AppuserxBuysale(p_idUser in varchar2, 
                                              p_idSale in NUMBER)return varchar2 as
val varchar2(50);
v_idUser number(8);
begin
    v_idUser:= packagegetid.getidusername(p_idUser);
    packagepcd.new_History_AppuserxBuysale(v_iduser,p_idSale);
    commit;
    val:='Successfully Created';
    return val;
exception
    WHEN no_data_found THEN
     val:='Wrong or missing information'; 
     return val;
    when dup_val_on_index then
     val:='Already exists';   
     return val;
    when others then
     val:='Wrong data';
     return val;
end fnNewHistory_AppuserxBuysale;

function FNNEWIDENTIFICATION(p_identification in VARCHAR2) RETURN VARCHAR2
as
val varchar2(50);

begin

    packagepcd.new_identification(p_identification);
    commit;
    val:='Successfully Created';
    return val;
exception
    WHEN no_data_found THEN
     val:='Wrong or missing information'; 
     return val;
    when dup_val_on_index then
     val:='Already exists';   
     return val;
    when others then
     val:='Wrong data';
     return val;
end fnNEWIDENTIFICATION;

function  fnNewModelP( p_nameModel in VARCHAR2,p_idBrand in varchar2
                        ,p_nameType in varchar2)return varchar2 as
val varchar2(50);
idB number(10);
v_idType number(3);
begin
    idB:=packagegetid.getidBrand(p_idBrand);
    v_idType:=packagegetid.getIdTypeClock(p_nameType);
    packagepcd.new_modelP(idB,p_nameModel,v_idType);
    commit;
    val:='Successfully Created';
    return val;
exception
    WHEN no_data_found THEN
     val:='Wrong or missing information'; 
     return val;
    when dup_val_on_index then
     val:='Already exists';   
     return val;
    when others then
     val:='Wrong data';
     return val;
end fnNewModelP;
function  fnNewMSG_userxuser(p_idWriter in varchar2,
                                        p_idRecipient in varchar2,
                                        p_subject in VARCHAR2,
                                        p_descriptionM IN VARCHAR2)return varchar2 as
val varchar2(50);
v_idWriter numbeR(8);
v_idRecipient number(8);
begin
    v_idWriter:= packagegetid.getidusername(p_idWriter);
    v_idRecipient:= packagegetid.getidusername(p_idRecipient);

    packagepcd.new_MSG_USERXUSER(v_idWriter,
                                        v_idRecipient ,
                                        p_subject ,
                                        p_descriptionM , SYSDATE);
    commit;
    val:='Successfully Created';
    return val;
exception
    WHEN no_data_found THEN
     val:='Wrong or missing information'; 
     return val;
    when dup_val_on_index then
     val:='Already exists';   
     return val;
    when others then
     val:='Wrong data';
     return val;
end fnNewMSG_userxuser;
function  fnNewPeopleappuser(p_identification in VARCHAR2, 
                             p_idType in varchar2,
                             p_idGender in varchar2, 
                             p_idCountry in varchar2,
                             p_birthdate in DATE,
                             p_name in VARCHAR2,
                             p_surname in VARCHAR2,
                             p_secondsurname VARCHAR2,p_username in VARCHAR2, 
                             p_password in VARCHAR2,
                             p_Email in VARCHAR2,
                             p_district in varchar2,
                             p_idCity in varchar2,
                             p_aCountry in varchar2,
                             p_phoneNumber in number,
                             p_phoneCode in varchar2,
                             p_phoneType in varchar2)return varchar2 as
val varchar2(64);
idType number(3);
idGender number(8);
idCountry number(8);
idDistrict number(10);
v_idAddressCountry number(8);
v_idAddressCity number(8);
v_userType number(2);
v_newidPeople number(8);
v_idCountryPhone number(8);
v_idPhoneType number(2);

begin   


        idType:=packagegetid.getididentification(p_idType);
        idGender:=packagegetid.getidgender(p_idGender);
        idCountry:=packagegetid.getidCountry(p_idCountry);
       v_idaddressCountry:=packagegetid.getidCountry(p_aCountry);
        v_idAddressCity:=packagegetid.getidCity(p_idCity,v_idaddressCountry);
        idDistrict:=packagegetid.getidDistrict(p_district,v_idAddresscity);
        v_userType:=packagegetid.getidUserType('User');
        v_idCountryPhone:= packagegetid.getIdCountryWCode(p_phoneCode);
       v_idPhoneType :=packageGetid.getIdPhoneType(p_phonetype);

INSERT INTO PEOPLE(idPeople,identificationNumber,identificationType,gender,citenzenship,birthdate,namePeople,surname,secondsurname)
values(s_people.nextval,p_identification,idType,idGender,idCountry,p_birthdate,p_name,p_surname,p_secondsurname);

    ----v_newidPeople:=packagegetid.getidpeople(p_identification);

    val:=packagefnnew.fnnewappuser(p_username , 
                            s_people.currval ,
                         v_userType , 
                            iddistrict ,
		 	     p_password ,
			     p_Email );

INSERT INTO PHONE(phonenumber,iduser,idcountry,idtype) values (p_phoneNumber,s_appuser.currval,v_idCountryPhone,v_idPhoneType);
   commit;
  val:='You have been registered';
   return val;
exception
    WHEN no_data_found THEN

     rollback;
     val:='Missing information'; 

     return val;
    when dup_val_on_index then

     rollback;
      val:='User already exists';
     return val;
    when others then

    rollback;
     val:='Data error';
     return val;

end fnNewPeopleappuser;


function  fnNewReview(p_descriptionR in VARCHAR2, p_rating in NUMBER)return varchar2 as
val varchar2(50);

begin

    packagepcd.new_Review(p_descriptionR,p_rating);
    commit;
    val:='Successfully Created';
    return val;
exception
    WHEN no_data_found THEN
     val:='Wrong or missing information'; 
     return val;
    when dup_val_on_index then
     val:='Already exists';   
     return val;
    when others then
     val:='Wrong data';
     return val;
end fnNewReview;

function  fnNewSellerRating(p_idUser in varchar2, p_rating in number)return varchar2 as
val varchar2(50);
v_idUser number(8);
begin
    v_idUser:=packagegetid.getidusername(p_idUser);
    packagepcd.new_sellerrating(v_idUSer,p_rating);
    commit;
    val:='Successfully Created';
    return val;
exception
    WHEN no_data_found THEN
     val:='Wrong or missing information'; 
     return val;
    when dup_val_on_index then
     val:='Already exists';   
     return val;
    when others then
     val:='Wrong data';
     return val;
end fnNewSellerRating;

function  fnNewShCart_appuserxclock(p_idappuser in varchar2,
				      p_Clock in number)return varchar2 as
val varchar2(50);
v_idUser number(8);
begin
    v_idUser:=packagegetid.getidusername(p_idappUser);
    packagepcd.new_Review(v_iduser,p_clock);
    commit;
    val:='Successfully Created';
    return val;
exception
    WHEN no_data_found THEN
     val:='Wrong or missing information'; 
     return val;
    when dup_val_on_index then
     val:='Already exists';   
     return val;
    when others then
     val:='Wrong data';
     return val;
end fnNewShCart_appuserxclock;

function  fnNewShippingMethod(p_nameSM in VARCHAR2, p_company VARCHAR2)
return varchar2 as
val varchar2(50);

begin

    packagepcd.new_ShippingMethod(p_nameSM,p_company);
    commit;
    val:='Successfully Created';
    return val;
exception
    WHEN no_data_found THEN
     val:='Wrong or missing information'; 
     return val;
    when dup_val_on_index then
     val:='Already exists';   
     return val;
    when others then
     val:='Wrong data';
     return val;
end fnNewShippingMethod;
function  fnNewTypeClock(p_nameT in varchar2, p_descriptionT in varchar2)return varchar2 as
val varchar2(50);

begin
    packagepcd.new_TypeClock(p_nameT,p_descriptionT);
    commit;
    val:='Successfully Created';
    return val;
exception
    WHEN no_data_found THEN
     val:='Wrong or missing information'; 
     return val;
    when dup_val_on_index then
     val:='Already exists';   
     return val;
    when others then
     val:='Wrong data';
     return val;
end fnNewTypeClock;

function  fnNewuserType(p_nameT in varchar2, p_descriptionT in varchar2)return varchar2 as
val varchar2(50);

begin

    packagepcd.new_userType(p_nameT,p_descriptionT);
    commit;
    val:='Successfully Created';
    return val;
exception
    WHEN no_data_found THEN
     val:='Wrong or missing information'; 
     return val;
    when dup_val_on_index then
     val:='Already exists';   
     return val;
    when others then
     val:='Wrong data';
     return val;
end fnNewUsertype;

function  fnNewWlistUserxClock( p_idUser in varchar2, 
                        p_idClock in NUMBER)return varchar2 as
val varchar2(50);
v_idUser number(8);
begin
    v_idUser:=packagegetid.getidusername(p_idUser);
    packagepcd.new_WLISTUSERXCLOCK(v_idUser,p_idClock);
    commit;
    val:='Successfully Created';
    return val;
exception
    WHEN no_data_found THEN
     val:='Wrong or missing information'; 
     return val;
    when dup_val_on_index then
     val:='Already exists';   
     return val;
    when others then
     val:='Wrong data';
     return val;
end fnNewWlistUserxClock;

function  fnNewPaymentMethod(p_namep in varchar2)return varchar2 as
val varchar2(50);

begin

    packagepcd.new_PaymentMethod(p_nameP);
    commit;
    val:='Successfully Created';
    return val;
exception
    WHEN no_data_found THEN
     val:='Wrong or missing information'; 
     return val;
    when dup_val_on_index then
     val:='Already exists';   
     return val;
    when others then
     val:='Wrong data';
     return val;
end fnNewPaymentMethod;

function  fnNewGender(p_nameG in varchar2)return varchar2
is
val varchar2(50);

begin

    packagepcd.new_Gender(p_nameG);
    val:='Successfully Created';
    commit;
    return val;
exception
    WHEN no_data_found THEN
     val:='Wrong or missing information'; 
     return val;
    when dup_val_on_index then
     val:='Already exists';   
     return val;
    when others then
     val:='Wrong data';
     return val;
end fnNewGender;

function fnNewPhone(p_number in number,p_username in varchar2,p_nametype in varchar2,p_nameCountry in varchar2)return varchar2
is
val varchar2(50);
v_idUSer number(8);
v_idTypep number(2);
v_idCountry number(8);
begin
    v_idUser:= packagegetid.getIdUsername(p_username);
    v_idTypep:=packagegetid.getIdPhoneType(p_nameType);
    v_idCountry:=packagegetid.getidCountry(p_nameCountry);
    insert into phone(phonenumber,iduser,idType,idCountry)
    values(p_number,v_iduser,v_idTypep,v_idCountry);
    val:='Successfully Created';
    commit;
    return val;
exception
    WHEN no_data_found THEN
     val:='Wrong or missing information'; 
     return val;
    when dup_val_on_index then
     val:='Already exists';   
     return val;
    when others then
     val:='Wrong data';
     return val;

end fnNewPhone;

function fnNewPhoneType(p_nameType in varchar2)return varchar2 is
val varchar2(50);

begin

    insert into phoneType(idphonetype,nameType) values(s_phonetype.nextval,p_nameType);
    val:='Successfully Created';
    commit;
    return val;
exception
    WHEN no_data_found THEN
     val:='Wrong or missing information'; 
     return val;
    when dup_val_on_index then
     val:='Already exists';   
     return val;
    when others then
     val:='Wrong data';
     return val;
end fnNewPhoneType;

function fnNewBuy(p_username in varchar2, p_idbuysale in number, p_paymentmethod in varchar2,p_shippingmethod in varchar2 ) return varchar2 is
val varchar2(50);
v_idAppUser number(8);
v_idPayment number(3);
v_idShipping number(4);
v_idSeller number(8);
begin
    v_idAppUser:=packagegetid.getidUsername(p_username);
    v_idPayment:=packagegetid.getidPaymentMethod(p_paymentmethod);
    v_idShipping:=packagegetid.getidShippingMethod(p_shippingmethod);
    Select iduserseller into v_idSeller from buysale where buysale.idbuysale=p_idBuysale;
    if v_idSeller=v_idAppuser then
     return 'This item is yours';
    end if;
        
    update buysale set   idShippingM=v_idShipping,
                         idpaymentm=v_idPayment,
                         iduserbuyer=v_idAppuser,
                         datesale=SYSDATE,
                         idBuyStatus=2
                         where buysale.idbuysale=p_idbuysale; 
    insert into HISTORY_APPUSERXBUYSALE(IDUSER,IDBUYSALE)values(v_idAppUser,p_idBuySale);
    val:='You have bought the clock';
    return val;
    commit;
exception
    WHEN no_data_found THEN
     rollback;
     val:='Wrong or missing information'; 
     return val;
    when dup_val_on_index then
     rollback;
     val:='Already Bought';   
     return val;
    when others then
     rollback;
     val:='Wrong data';
     return val;
end fnNewBuy;
END PACKAGEFNNEW;