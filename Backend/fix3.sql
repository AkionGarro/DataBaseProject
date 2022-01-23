alter table paymentmethod modify(
	type varchar2(20);
);


create table typeClockxBrand(
	idTypeClock number(3),
	idBrand number(10),
	createdBy VARCHAR2(20),
	creationDate DATE,
	modifiedBy VARCHAR2(20),
	modificationDate DATE

);

ALTER TABLE typeClockxBrand
ADD CONSTRAINT pk_typeClockxBrand PRIMARY KEY (idBrand,idTypeClock)
USING INDEX
TABLESPACE pr_ind PCTFREE 20
STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);

comment on table typeClockxBrand
is 'Table that links brands and types of clock';
COMMENT ON COLUMN typeClockxBrand.idBrand
is 'Reference to id of the Brand';
COMMENT ON COLUMN typeClockxBrand.idTypeClock
is 'Reference to id of typeclock';

COMMENT ON COLUMN typeClockxBrand.createdBy
is 'The user who created the tuple';
COMMENT ON COLUMN typeClockxBrand.creationDate
is 'The date when the tuple was created';
COMMENT ON COLUMN typeClockxBrand.modifiedBy
is 'The user who modified the tuple';
COMMENT ON COLUMN typeClockxBrand.modificationDate
is 'The date when the tuple was modified';


CREATE OR REPLACE TRIGGER pr.beforeCreatetypeClockxBrand before insert ON pr.typeClockxBrand
For each row
BEGIN
:new.createdBy:=USER;
:new.creationDate:=SYSDATE;
END beforeCreateBUYSALE;


ALTER TABLE typeClockxBrand
ADD CONSTRAINT fk_typexbrand_Brand FOREIGN KEY
(idBrand) REFERENCES brand(idBrand);
ALTER TABLE typeClockxBrand
ADD CONSTRAINT fk_typexbrand_type FOREIGN KEY
(idTypeClock) REFERENCES typeClock(idType);




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
nameType VARCHAR2(20) CONSTRAINT CONDITION_nameTyoe_nn not null,
createdBy VARCHAR2(20),
creationDate DATE,
modifiedBy VARCHAR2(20),
modificationDate DATE
);

CREATE TABLE PHONE(
PhoneNumber number(8) Constraint CONDITION_PhoneNumber_nn, 
idUser NUMBER(8) CONSTRAINT CONDITION_idUser_nn not null,
idCountry Number(8) CONSTRAINT CONDITION_idCountry_nn not null,
idType Number(2) CONSTRAINT CONDITION_idType_nn not null,
createdBy VARCHAR2(20),
creationDate DATE,
modifiedBy VARCHAR2(20),
modificationDate DATE
);

ALTER TABLE PHONE
ADD CONSTRAINT pk_CONDITION PRIMARY KEY (PhoneNumber,idUser)
USING INDEX
TABLESPACE pr_ind PCTFREE 20
STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);

ALTER TABLE PHONE
ADD CONSTRAINT fk_PHONE_APPUSER FOREIGN KEY
(idUSer) REFERENCES APPUSER(idAppUser);

ALTER TABLE PHONE
ADD CONSTRAINT fk_PHONE_COUNTRY FOREIGN KEY
(idCountry) REFERENCES CONUTRY(idCountry);

ALTER TABLE PHONE
ADD CONSTRAINT fk_PHONE_TYPEPHONE FOREIGN KEY
(idType) REFERENCES PHONETYPE(idPhoneType);