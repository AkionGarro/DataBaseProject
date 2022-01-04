--verificado
create table APPUSER
(
username varchar2(10),
identificationNumber VARCHAR2(10) constraint appuser_identification_nn not null,
userType Number(2) constraint appuser_userType_nn not null,
district Number(10) constraint appuser_disctrict_nn not null,
password varchar2(10) constraint user_password_nn not null,
photo BLOB DEFAULT EMPTY_BLOB(),
phoneNumber Number(8) constraint user_phone_number_nn not null,
email varchar2(30) constraint user_email_nn not null,
averageAsSeller Number(1),
averageAsBuyer Number(1),
createdBy varchar2(10),
creationDate DATE,
modifiedBy varchar2(10),
modificationDate DATE
);


---------------------------------Primary Key---------------------------------------
ALTER TABLE APPUSER
ADD CONSTRAINT pk_appuser PRIMARY KEY (username)
USING INDEX
TABLESPACE pr_ind PCTFREE 20
STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);



-----------------------------------Foreign Keys------------------------------------

ALTER TABLE APPUSER
ADD CONSTRAINT fk_APPUSER_persona FOREIGN KEY
(identificationNumber) REFERENCES PEOPLE(identificationNumber);

ALTER TABLE APPUSER
ADD CONSTRAINT fk_APPUSER_usertpe FOREIGN KEY
(userType) REFERENCES USERTYPE(idUserType);

ALTER TABLE APPUSER
ADD CONSTRAINT fk_APPUSER_disctrict FOREIGN KEY
(district ) REFERENCES DISTRICT(idDistrict);



----------------------------------Coments------------------------------------------

COMMENT ON TABLE APPUSER
is 'The table containing the information about the user';

COMMENT ON COLUMN APPUSER.username
IS 'The username that identifies the user';

COMMENT ON COLUMN APPUSER.identificationNumber
IS 'Reference to the identification from the people ';

COMMENT ON COLUMN APPUSER.userType
IS 'Reference to the type of user';

COMMENT ON COLUMN APPUSER.district
IS 'Reference to the district where the user lives';

COMMENT ON COLUMN APPUSER.password
IS 'Password of the account';

COMMENT ON COLUMN APPUSER.photo
IS 'Photo of the user';

COMMENT ON COLUMN APPUSER.phoneNumber
IS 'Phone number of the user';

COMMENT ON COLUMN APPUSER.email
IS 'Email of the user';

COMMENT ON COLUMN APPUSER.averageAsSeller
IS 'Average score as seller';

COMMENT ON COLUMN APPUSER.averageAsBuyer
IS 'Average score as buyer';

COMMENT ON COLUMN APPUSER.createdBy
is 'The user who created the tuple';

COMMENT ON COLUMN APPUSER.creationDate
is 'The date when the tuple was created';

COMMENT ON COLUMN APPUSER.modifiedBy
is 'The user who modified the tuple';

COMMENT ON COLUMN APPUSER.modificationDate
is 'The date when the tuple was modified';

