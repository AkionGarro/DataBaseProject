create table MODELP
(
idModel varchar2(10),
idBrand varchar(10) CONSTRAINT MODEL_idBrand_nn NOT NULL,
nameBrand varchar(10) CONSTRAINT MODEL_nameBrand_nn NOT NULL,
createdBy varchar2(10),
creationDate DATE,
modifiedBy varchar2(10),
modificationDate DATE
);

ALTER TABLE MODELP 
ADD CONSTRAINT pk_MODEL PRIMARY KEY (idModel)
USING INDEX
TABLESPACE pr_ind PCTFREE 20
STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);


ALTER TABLE MODELP
ADD CONSTRAINT fk_MODEL_BRAND FOREIGN KEY
(idBrand) REFERENCES BRAND(idBrand);

COMMENT ON TABLE MODELP
is 'The table containing the information about the clock model';

COMMENT ON COLUMN MODELP.idModel
IS 'The id that identifies the clock model';

COMMENT ON COLUMN MODELP.idBrand
IS 'The id that identifies the clock brand';

COMMENT ON COLUMN MODELP.nameBrand
IS 'Reference to the clock brand name';

COMMENT ON COLUMN MODELP.createdBy
is 'The user who created the tuple';

COMMENT ON COLUMN MODELP.creationDate
is 'The date when the tuple was created';

COMMENT ON COLUMN MODELP.modifiedBy
is 'The user who modified the tuple';

COMMENT ON COLUMN MODELP.modificationDate
is 'The date when the tuple was modified';
