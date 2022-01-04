Create table PEOPLE(
identificationNumber varchar2(10),
identificationType Number(3),
gender Number(8),
citenzenship Number(8),
birthdate date constraint people_birthdate_nn not null,
age Number(3),
namePeople varchar2(10) constraint people_name_nn not null,
surname varchar2(10) constraint people_surname_nn not null,
secondsurname varchar2(10) constraint people_secondsurname_nn not null,
createdBy varchar2(10),
creationDate DATE,
modifiedBy varchar2(10),
modificationDate DATE
);

------------------------------------PK-----------------------------------------------------
ALTER TABLE PEOPLE
ADD CONSTRAINT pk_people PRIMARY KEY (identificationNumber) 
USING INDEX
TABLESPACE pr_ind PCTFREE 20
STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);

---------------------------------FK--------------------------------------------------------


ALTER TABLE PEOPLE
ADD CONSTRAINT fk_People_GENDER FOREIGN KEY
(gender) REFERENCES GENDER(idGender);

ALTER TABLE PEOPLE
ADD CONSTRAINT fk_People_country FOREIGN KEY
(citenzenship) REFERENCES country(idCountry);

------------------------------------comments-----------------------------------------------------


COMMENT ON TABLE PEOPLE
IS 'Table for the basic information abount the users';

COMMENT ON COLUMN PEOPLE.identificationNumber
IS 'The identification number of the user';

COMMENT ON COLUMN PEOPLE.identificationType
IS 'The reference to the type of identification';

COMMENT ON COLUMN PEOPLE.gender
IS 'The reference to the gender';

COMMENT ON COLUMN PEOPLE.citenzenship
IS 'The reference to the country where the user belongs';

COMMENT ON COLUMN PEOPLE.birthdate
IS 'The date of birth if the user';

COMMENT ON COLUMN PEOPLE.age
IS 'The age of the user';

COMMENT ON COLUMN PEOPLE.namePeople
IS 'The first name of the user';

COMMENT ON COLUMN PEOPLE.surname
IS 'The srname of the user';

COMMENT ON COLUMN PEOPLE.secondsurname
IS 'The second surname of the user';

COMMENT ON COLUMN PEOPLE.createdBy
IS 'The name of the user that created the tuple';

COMMENT ON COLUMN PEOPLE.creationDate
IS 'Date when the tuple was created';

COMMENT ON COLUMN PEOPLE.modifiedBy
IS 'The name of the user that modified the type';

COMMENT ON COLUMN PEOPLE.modificationDate
IS 'Date when it was last modified';
