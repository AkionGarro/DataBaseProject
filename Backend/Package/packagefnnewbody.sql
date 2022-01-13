--------------------------------------------------------
-- Archivo creado  - jueves-enero-13-2022   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Package Body PACKAGEFNNEW
--------------------------------------------------------

  CREATE OR REPLACE PACKAGE BODY "PR"."PACKAGEFNNEW" AS
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

function  fnNewBrand(p_nameB in varchar2, p_nameType in varchar2)return varchar2 as
val varchar2(50);
v_nameType number(3);
v_idBrand number(10);
begin
    v_nameType:=packagegetid.getidTypeClock(p_nameType);
    packagepcd.new_Brand(p_nameB);
    v_idBrand:=packagegetid.getidBrand(p_nameB);
    packagepcd.new_typeclockxbrand(v_nameType,v_idBrand);
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

function fnnewTypeClockxBrand(p_typeClock in varchar2 , p_nameBrand in varchar2) return varchar2 as
val varchar2(50);
v_nameType number(3);
v_idBrand number(10);
begin
    v_nameType:=packagegetid.getidTypeClock(p_typeClock);
    v_idBrand:=packagegetid.getidBrand(p_nameBrand);
    packagepcd.new_typeclockxbrand(v_nameType,v_idBrand);
    commit;
    val:='Successfully Created';
    return val;
exception
    WHEN no_data_found THEN
     return val;
    when dup_val_on_index then
     val:='Already exists';
     return val;
    when others then
     val:='Wrong data';
     return val;

end FnnewtypeclockxBrand;



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


function  fnNewClockBuysale( p_idType in varchar2,  p_idModel in varchar2,
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
v_idType number(3);
v_idModel number(10);
v_idBrand number(10);
v_idCondition number(2);
v_idUserS number(8);
v_idBuyS number(8);

begin
    v_idType:=packagegetid.getidTypeClock(p_idType);
    v_idBrand:=packagegetid.getidBrand(p_idBrand);
    v_idModel:=packagegetid.getidModel(p_idModel,v_idBrand);
    v_idCondition:=packagegetid.getidCondition(p_idCondition);
    v_idUserS:=packagegetid.getIdusername(p_idUsers);
    v_idBuyS:=packagegetid.getIdBuyStatus(p_idbuyS);


    packagepcd.new_clock(v_idType, v_idModel,
		 	                v_idCondition ,
		                    p_descriptionClock ,
			                p_manufactureDate ,
                            p_vintage ,
                            p_price);
    
    val:=packagefnnew.fnnewBuySale(v_idUserS , s_clock.currval,
                             v_idBuyS );
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
                        )return varchar2 as
val varchar2(50);
idB number(10);
begin
    idB:=packagegetid.getidBrand(p_idBrand);
    packagepcd.new_modelP(idB,p_nameModel);
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
                             p_district in varchar2,
		 	     p_password in VARCHAR2,
			     p_Email in VARCHAR2,p_idCity in varchar2, p_aCountry in varchar2)return varchar2 as
val varchar2(50);
idType number(3);
idGender number(8);
idCountry number(8);
idDistrict number(10);
v_idAddressCountry number(8);
v_idAddressCity number(8);
v_userType number(2);
v_newidPeople number(8);

begin   
        idType:=packagegetid.getididentification(p_idType);
        idGender:=packagegetid.getidgender(p_idGender);
        idCountry:=packagegetid.getidCountry(p_idCountry);
        v_idaddressCountry:=packagegetid.getidCountry(p_aCountry);
        v_idAdDressCity:=packagegetid.getidCity(p_idCity,v_idaddressCountry);
        idDistrict:=packagegetid.getidDistrict(p_district,v_idAddresscity);
        v_userType:=packagegetid.getidUserType('User');
    packagepcd.new_people(p_identification, 
                             idType,
                             idGender, 
                             idCountry,
		 	     p_birthdate,
		             p_name ,
			     p_surname ,
			     p_secondsurname);
    v_newidPeople:=packagegetid.getidpeople(p_identification);
    val:=packagefnnew.fnnewappuser(p_username , 
                             v_newIdPeople ,
                             v_userType , 
                             iddistrict ,
		 	     p_password ,
			     p_Email );
    commit;
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

function fnListGenderBasic return sys_RefCursor is
cCursor sys_refCursor;
begin open ccUrsor for select nameGender from gender;
return ccursor;
end fnListGenderBasic;





END PACKAGEFNNEW;

/

  GRANT EXECUTE ON "PR"."PACKAGEFNNEW" TO "PR";
