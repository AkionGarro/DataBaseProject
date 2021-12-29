create table City
(
idCity NUMBER(8),
idCountry Number(8) constraint city_idCountry_nn not null,
name varchar2(10) constraint city_nameCity_nn not null,
createdBy varchar2(10),
creationDate DATE,
modifiedBy varchar2(10),
modificationDate DATE
);

ALTER TABLE city
ADD CONSTRAINT pk_city PRIMARY KEY (idCity)
USING INDEX
TABLESPACE pr_ind PCTFREE 20
STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);

COMMENT ON TABLE City
IS 'Table for the diferents cities';

COMMENT ON COLUMN City.idCity
IS 'The id number of the city';

COMMENT ON COLUMN City.idCountry
IS 'The id number of the country where the city belongs';

COMMENT ON COLUMN City.nameCity
IS 'The name of the city';

COMMENT ON COLUMN City.createdBy
IS 'The name of the user that created the tuple';

COMMENT ON COLUMN City.creationDate
IS 'Date when the tuple was created';

COMMENT ON COLUMN City.modifiedBy
IS 'The name of the user that modified the type';

COMMENT ON COLUMN City.modificationDate
IS 'Date when it was last modified';
