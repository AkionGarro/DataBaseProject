create table country
(
idCountry NUMBER(8),
nameCountry varchar2(10) constraint country_nameCountry_nn not null,
createdBy varchar2(10),
creationDate DATE,
modifiedBy varchar2(10),
modificationDate DATE
);

ALTER TABLE country
ADD CONSTRAINT pk_country PRIMARY KEY (idCountry)
USING INDEX
TABLESPACE pr_ind PCTFREE 20
STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);

COMMENT ON TABLE country
IS 'Table for the diferents countries';

COMMENT ON COLUMN country.idCountry
IS 'The id number of the country';

COMMENT ON COLUMN country.nameCountry
IS 'The name of the country';

COMMENT ON COLUMN country.createdBy
IS 'The name of the user that created the tuple';

COMMENT ON COLUMN country.creationDate
IS 'Date when the tuple was created';

COMMENT ON COLUMN country.modifiedBy
IS 'The name of the user that modified the type';

COMMENT ON COLUMN country.modificationDate
IS 'Date when it was last modified';


_----------------------------------------------------------
