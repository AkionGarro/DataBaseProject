CREATE TABLE BRAND(
idBrand NUMBER(10),
nameBrand VARCHAR2(20) CONSTRAINT BRAND_nameBrand_nn NOT NULL,
createdBy VARCHAR2(20),
creationDate DATE,
modifiedBy VARCHAR2(20),
modificationDate DATE
);

------------------------------------Primary Keys-----------------------------------------

ALTER TABLE BRAND
ADD CONSTRAINT pk_BRAND PRIMARY KEY (idBrand)
USING INDEX
TABLESPACE pr_ind PCTFREE 20
STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);

------------------------------------Comments-----------------------------------------------------
COMMENT ON TABLE BRAND
is 'It is a table that stores the brands';
COMMENT ON COLUMN BRAND.idBrand
is 'Unique identifier of the brand';
COMMENT ON COLUMN BRAND.nameBrand
is 'Name of the brand';
COMMENT ON COLUMN BRAND.createdBy
is 'The user who created the tuple';
COMMENT ON COLUMN BRAND.creationDate
is 'The date when the tuple was created';
COMMENT ON COLUMN BRAND.modifiedBy
is 'The user who modified the tuple';
COMMENT ON COLUMN BRAND.modificationDate
is 'The date when the tuple was modified';
