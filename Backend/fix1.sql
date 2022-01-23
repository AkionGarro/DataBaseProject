ALTER TABLE APPUSER
  DROP COLUMN phoneNumber;

ALTER TABLE COUNTRY ADD codeCountry varchar2(8) constraint country_codeCountry_nn not null;


COMMENT ON COLUMN country.codeCountry
is 'Phone code of the country';

--ejecutar4-1.2

grant execute on pr.PACKAGEPCD to pr;
ALTER TABLE Condition
ADD CONSTRAINT condition_name_unique UNIQUE(nameCondition);




ALTER TABLE TypeClock
ADD CONSTRAINT typeClock_name_unique UNIQUE(nameType);

create or replace PACKAGE BODY PACKAGEPCD AS
procedure new_APPUSER(p_username in VARCHAR2, 
                             p_idNumber in VARCHAR2,
                             p_userType in NUMBER, 
                             p_district in NUMBER,
		 	     p_password in VARCHAR2,
			     p_Email in VARCHAR2)

     is
BEGIN
INSERT INTO APPUSER(idappuser,username,identificationNumber,userType,district,passworda,email)
values(s_appuser.nextval,p_username,p_idNumber,p_userType,p_district,p_password,p_Email);
commit;
END new_APPUSER; 

procedure new_COUNTRY(p_nameCountry in VARCHAR2, p_codeCountry in VARCHAR2)
IS
BEGIN
INSERT INTO COUNTRY(idCountry,nameCountry,codeCountry)
values(s_Country.nextval,p_nameCountry, p_codeCountry);
commit;
end new_COUNTRY;

PROCEDURE new_HISTORY_APPUSERXBUYSALE(p_idUser in NUMBER, 
                                              p_idSale in NUMBER)
IS
BEGIN
INSERT INTO HISTORY_APPUSERXBUYSALE(idUser,idbuySale)
values(p_idUSer,p_idSale);
commit;
end new_HISTORY_APPUSERXBUYSALE;

PROCEDURE new_MSG_USERXUSER(p_idWriter in NUMBER,
                                        p_idRecipient in NUMBER,
                                        p_subject in VARCHAR2,
                                        p_descriptionM IN VARCHAR2, p_sendDate in DATE)
is
BEGIN
INSERT INTO MSG_USERXUSER(idWriter,idRecipient,subject,descriptionM,sendDate)
values(p_idWriter,p_idRecipient,p_subject,p_descriptionM,p_sendDate);
commit;
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
INSERT INTO PEOPLE(identificationNumber,identificationType,gender,citenzenship,birthdate,namePeople,surname,secondsurname)
values(p_identification,p_idType,p_idGender,p_idCountry,p_birthdate,p_name,p_surname,p_secondsurname);
commit;
END new_People;