drop table typeclockxbrand;
delete from modelP;
alter table modelp

add idTypeClock number(3) constraint modelP_idTypeClock_nn NOT NULL;

ALTER TABLE modelP
ADD CONSTRAINT fk_modelp_typeclock FOREIGN KEY (idTypeClock) REFERENCES typeClock(idtype);



ALTER TABLE CLOCK DROP COLUMN IDTYPE;



--SEQUENCE PHONETYPE
CREATE SEQUENCE s_PHONETYPE
START WITH 0
INCREMENT BY 1
MINVALUE 0
MAXVALUE 10000000
NOCACHE
NOCYCLE;



--Phone

CREATE TABLE PHONETYPE(
idPhoneType number(2), 
nameType VARCHAR2(20) CONSTRAINT phonetype_nameType_nn not null,
createdBy VARCHAR2(20),
creationDate DATE,
modifiedBy VARCHAR2(20),
modificationDate DATE
);

CREATE TABLE PHONE(
PhoneNumber number(8) Constraint CONDITION_PhoneNumber_nn not null, 
idUser NUMBER(8) CONSTRAINT CONDITION_idUser_nn not null,
idCountry Number(8) CONSTRAINT CONDITION_idCountry_nn not null,
idType Number(2) CONSTRAINT CONDITION_idType_nn not null,
createdBy VARCHAR2(20),
creationDate DATE,
modifiedBy VARCHAR2(20),
modificationDate DATE
);

ALTER TABLE PHONE
ADD CONSTRAINT pk_PHONE PRIMARY KEY (PhoneNumber,idUser)
USING INDEX
TABLESPACE pr_ind PCTFREE 20
STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);

ALTER TABLE PHONEtYPE
ADD CONSTRAINT pk_PHONETYPE PRIMARY KEY (IDPHONETYPE)
USING INDEX
TABLESPACE pr_ind PCTFREE 20
STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);


ALTER TABLE PHONE
ADD CONSTRAINT fk_PHONE_APPUSER FOREIGN KEY
(idUSer) REFERENCES APPUSER(idAppUser);

ALTER TABLE PHONE
ADD CONSTRAINT fk_PHONE_COUNTRY FOREIGN KEY
(idCountry) REFERENCES COUNTRY(idCountry);

ALTER TABLE PHONE
ADD CONSTRAINT fk_PHONE_TYPEPHONE FOREIGN KEY
(idType) REFERENCES PHONETYPE(idPhoneType);

ALTER TABLE PHONETYPE
    ADD CONSTRAINT PHONET_NAMET_UNIQUE
    UNIQUE (NAMETYPE) 
    USING INDEX
    TABLESPACE pr_ind PCTFREE 20
    STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);


alter table appuser modify(
passworda varchar2(64)
);


