create table DISTRICT
(
idDistrict varchar2(10), CONSTRAINT DISTRICT_pk PRIMARY KEY (idDistrict),
idCity varchar(10),
nameDistrict varchar(10),
createdBy varchar2(10),
creationDate DATE,
modifiedBy varchar2(10),
modificationDate DATE
);

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
