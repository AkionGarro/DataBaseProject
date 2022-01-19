create or replace PACKAGE BODY      "PACKAGEUPDATE" is

function fnUpdtCondition(p_name in varchar2, p_newName in varchar2) return varchar2 is
val varchar2(50);
v_idCondition number(2);
begin
    v_idCondition:=packagegetid.getIdCondition(p_name);
    UPDATE condition Set nameCondition=p_newName
    where condition.idcondition=v_idcondition; 
    val:='Successfully Updated';
    commit;
    return val;
exception
    WHEN no_data_found THEN
     val:='Not found'; 
     return val;
    when others then
     val:='Wrong data';
     return val;
end fnUpdtCondition;

function fnUpdtTypeClock(p_name in varchar2, p_newName in varchar2) return varchar2 is
val varchar2(50);
v_idC number(2);
begin
    v_idC:=packagegetid.getIdTypeClock(p_name);
    UPDATE typeClock set nameType=p_newName where typeClock.idType=v_idC; 
    val:='Successfully Updated';
    commit;
    return val;
exception
    WHEN no_data_found THEN
     val:='Not found'; 
     return val;
    when others then
     val:='Wrong data';
     return val;
end fnUpdtTypeClock;

function fnUpdtTypeClockDescription(p_name in varchar2, p_newName in varchar2) return varchar2 is
val varchar2(50);
v_idC number(2);
begin
    v_idC:=packagegetid.getIdTypeClock(p_name);
    UPDATE typeClock set descriptionT=p_newName where typeClock.idType=v_idC; 
    val:='Successfully Updated';
    commit;
    return val;
exception
    WHEN no_data_found THEN
     val:='Not found'; 
     return val;
    when others then
     val:='Wrong data';
     return val;
end fnUpdtTypeClockDescription;

function fnUpdtBrand(p_name in varchar2, p_newName in varchar2) return varchar2 is
val varchar2(50);
v_idC number(10);
begin
    v_idC:=packagegetid.getIdBrand(p_name);
    UPDATE Brand set nameBrand=p_newName where brand.idBrand=v_idC; 
    val:='Successfully Updated';
    commit;
    return val;
exception
    WHEN no_data_found THEN
     val:='Not found'; 
     return val;
    when others then
     val:='Cannot be deleted, it has models';
     return val;
end fnUpdtBrand;

function fnUpdtBuyStatus(p_name in varchar2, p_newName in varchar2) return varchar2 is
val varchar2(50);
v_idC number(3);
begin
    v_idC:=packagegetid.getIdBuyStatus(p_name);
    UPDATE BuyStatus set status=p_newName where BuyStatus.idBuyStatus=v_idC; 
    val:='Successfully Updated';
    commit;
    return val;
exception
    WHEN no_data_found THEN
     val:='Not found'; 
     return val;
    when others then
     val:='Wrong data';
     return val;
end fnUpdtBuyStatus;

function fnUpdtUserType(p_name in varchar2, p_newName in varchar2) return varchar2 is
val varchar2(50);
v_idC number(3);
begin
    IF p_name='Admin' THEN
    val:='This user type cannot be deleted';
    return val;
    END IF;
    v_idC:=packagegetid.getidusertype(p_name);
    UPDATE UserType set nametype=p_newName where Usertype.idUserType=v_idC; 
    val:='Successfully Updated';
    commit;
    return val;
exception
    WHEN no_data_found THEN
     val:='Not found'; 
     return val;
    when others then
     val:='Wrong data';
     return val;
end fnUpdtUserType;

function fnUpdtPaymentMethod(p_name in varchar2, p_newName in varchar2) return varchar2
is
val varchar2(50);
v_idC number(3);
begin
    v_idC:=packagegetid.getidPaymentMethod(p_name);
    UPDATE PaymentMethod set type=p_newName where PaymentMethod.idPay=v_idC; 
    val:='Successfully Updated';
    commit;
    return val;
exception
    WHEN no_data_found THEN
     val:='Not found'; 
     return val;
    when others then
     val:='Wrong data';
     return val;
end fnUpdtPaymentMethod;

function fnUpdtCountry(p_name in varchar2, p_newName in varchar2) return varchar2
is
val varchar2(50);
v_idC number(3);
begin
    v_idC:=packagegetid.getidCountry(p_name);
    UPDATE Country set nameCountry=p_newName where Country.idCountry=v_idC; 
    val:='Updated Successfully';
    commit;
    return val;
exception
    WHEN no_data_found THEN
     val:='Not found'; 
     return val;
    when others then
     val:='Cannot be deleted';
     return val;
end fnUpdtCountry;

function fnUpdtPhone(p_phonenumber in number, p_newphone in number) return varchar2 is
val varchar2(50);
begin
    UPDATE phone  set phonenumber=p_newPhone where phone.phonenumber=p_phonenumber; 
    val:='Successfully Updated';
    commit;
    return val;
exception
    WHEN no_data_found THEN
     val:='Not found'; 
     return val;
    when others then
     val:='Wrong data';
     return val;
end fnUpdtPhone;

function fnUpdtGender(p_name in varchar2, p_newName in varchar2) return varchar2 is
val varchar2(50);
begin
    UPDATE gender set nameGender=p_newName where gender.nameGender=p_name; 
    val:='Successfully Updated';
    commit;
    return val;
exception
    WHEN no_data_found THEN
     val:='Not found'; 
     return val;
    when others then
     val:='Wrong data';
     return val;
end fnUpdtGender;
function fnUpdtIdentification(p_name in varchar2, p_newName in varchar2) return varchar2 is
val varchar2(50);
begin
    UPDATE identification set typeid=p_newName where Identification.TypeID=p_name; 
    val:='Successfully Updated';
    commit;
    return val;
exception
    WHEN no_data_found THEN
     val:='Not found'; 
     return val;
    when others then
     val:='Wrong data';
     return val;
end fnUpdtIdentification;
function fnUpdtCity(p_nameCity in varchar2,p_nameCountry in varchar2, p_newName in varchar2)return varchar2 is
val varchar2(50);
v_idCountry number(8);
v_idCity number(8);
begin
    select idCity into v_idcity from city 
    inner join country on  country.nameCountry=p_nameCountry and city.idCountry=country.idCountry and city.nameCity=p_nameCity; 
    --v_idCountry:=packagegetid.getIdCountry(p_nameCountry);
  --  v_idCity:=packagegetid.getIdCity(p_nameCity,v_idCity);
    UPDATE city set nameCity=p_newName where city.idCity=v_idCity; 
    val:='Successfully Updated ';
    commit;
    return val;
exception
    WHEN no_data_found THEN
     val:='Not found'; 
     return val;
    when others then
     val:='Cannot delete, it has districts';
     return val;
end fnUpdtCity;
function fnUpdtDistrict(p_nameDistrict in varchar2, p_nameCity in varchar2, p_nameCountry in varchar2, p_newName in varchar2)return varchar2
 is
val varchar2(50);
v_idCountry number(8);
v_idDistrict number(10);
begin
    select idDistrict into v_idDistrict from district 
    inner join city on city.nameCity=p_nameCity and district.idCity=city.idCity and district.nameDistrict=p_nameDistrict
    inner join country on city.idCountry=country.idCountry   and country.nameCountry=p_nameCountry; 
    --v_idCountry:=packagegetid.getIdCountry(p_nameCountry);
  --  v_idCity:=packagegetid.getIdCity(p_nameCity,v_idCity);
   UPDATE district set nameDistrict=p_newName where district.iddistrict=v_idDistrict; 
    val:='Successfully Updated ';
    commit;
    return v_idDistrict ;
exception
    WHEN no_data_found THEN
     val:='Not found'; 
     return val;
    when others then
     val:='Cannot delete, a user lives here';
     return val;
end fnUpdtDistrict;


function fnUpdtModelP(p_nameModel in varchar2,p_nameBrand in varchar2, p_newName in varchar2)return varchar2 is
val varchar2(50);
v_idModelP number(10);
begin
   select modelP.idModel into v_idModelP from modelP
    inner join brand on brand.nameBrand= p_nameBrand and  modelp.idBrand=brand.idBrand and modelp.nameModel=p_nameModel ;
    UPDATE MODELP set namemodel=p_newName where (MODELP.idModel=v_idModelP); 
    val:='Successfully Updated';
    commit;
    return val;
exception
    WHEN no_data_found THEN
     val:='Not found'; 
     return val;
    when others then
     val:='Wrong data';
     return val;
end fnUpdtModelP;


function fnUpdtShippingMethod(p_nameShipping in varchar2,p_nameCompany in varchar2, p_newName in varchar2)return varchar2 is
val varchar2(50);
begin
    UPDATE SHIPPINGMETHOD set nameSm=p_newName where SHIPPINGMETHOD.namesm=p_nameShipping and SHIPPINGMETHOD.Company=p_nameCompany; 
    val:='Successfully Updated';
    commit;
    return val;
exception
    WHEN no_data_found THEN
     val:='Not found'; 
     return val;
    when others then
     val:='Wrong data';
     return val;
end fnUpdtShippingMethod;

function fnUpdtPhoneType(p_namePhoneType in varchar2, p_newName in varchar2) return varchar2 is
val varchar2(50);

begin

    UPDATE phonetype set idPhoneType=p_newName where phonetype.nameType=p_namePhoneType; 
    val:='Successfully Updated';
    commit;
    return val;
exception
    WHEN no_data_found THEN
     val:='Not found'; 
     return val;
    when others then
     val:='Wrong data';
     return val;
end fnUpdtPhoneType;

end PACKAGEUPDATE;