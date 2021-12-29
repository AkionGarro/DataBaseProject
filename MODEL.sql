create table MODEL
(
idModel varchar2(10), CONSTRAINT MODEL_pk PRIMARY KEY (idModel),
idBrand varchar(10) CONSTRAINT MODEL_idBrand_nn NOT NULL,
nameBrand varchar(10) CONSTRAINT MODEL_nameBrand_nn NOT NULL,
createdBy varchar2(10),
creationDate DATE,
modifiedBy varchar2(10),
modificationDate DATE
);

COMMENT ON TABLE MODEL
is 'The table containing the information about the clock model';

COMMENT ON COLUMN MODEL.idModel
IS 'The id that identifies the clock model';

COMMENT ON COLUMN MODEL.idBrand
IS 'The id that identifies the clock brand';

COMMENT ON COLUMN MODEL.nameBrand
IS 'Reference to the clock brand name';

COMMENT ON COLUMN MODEL.createdBy
is 'The user who created the tuple';

COMMENT ON COLUMN MODEL.creationDate
is 'The date when the tuple was created';

COMMENT ON COLUMN MODEL.modifiedBy
is 'The user who modified the tuple';

COMMENT ON COLUMN MODEL.modificationDate
is 'The date when the tuple was modified';