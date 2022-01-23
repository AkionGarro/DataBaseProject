create table DISTRICT
(
idDistrict Number(10),
idCity Number(10) CONSTRAINT DISTRICT_idCity_nn NOT NULL,
nameDistrict varchar(10) CONSTRAINT DISTRICT_nameDistrict_nn NOT NULL,
createdBy varchar2(10),
creationDate DATE,
modifiedBy varchar2(10),
modificationDate DATE
);

------------------------------------Pk-----------------------------------------------------
ALTER TABLE DISTRICT 
ADD CONSTRAINT pk_DISTRICT PRIMARY KEY (idDistrict)
USING INDEX
TABLESPACE pr_ind PCTFREE 20
STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);

------------------------------------FK-----------------------------------------------------

ALTER TABLE DISTRICT
ADD CONSTRAINT fk_DISTRICT_CITY FOREIGN KEY
(idCity) REFERENCES CITY(idCity);

-----------------------------------Comments------------------------------------------------------

COMMENT ON TABLE DISTRICT
is 'The table containing the information about the district';

COMMENT ON COLUMN DISTRICT.idDistrict
IS 'The id that identifies the district';

COMMENT ON COLUMN DISTRICT.idCity
IS 'The id that identifies the city';

COMMENT ON COLUMN DISTRICT.nameDistrict
IS 'Reference to the district name';

COMMENT ON COLUMN DISTRICT.createdBy
is 'The user who created the tuple';

COMMENT ON COLUMN DISTRICT.creationDate
is 'The date when the tuple was created';

COMMENT ON COLUMN DISTRICT.modifiedBy
is 'The user who modified the tuple';

COMMENT ON COLUMN DISTRICT.modificationDate
is 'The date when the tuple was modified';
