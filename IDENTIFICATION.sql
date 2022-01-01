--identification table------

create table IDENTIFICATION
(
idIdentification NUMBER(3);
typeId varchar2(10) constraint identification_type_nn not null,
createdBy varchar2(10),
creationDate DATE,
modifiedBy varchar2(10),
modificationDate DATE
);

ALTER TABLE IDENTIFICATION
ADD CONSTRAINT pk_IDENTIFICATION PRIMARY KEY (idIdentification) 
USING INDEX
TABLESPACE pr_ind PCTFREE 20
STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);

COMMENT ON TABLE identification
IS 'Table for the diferents kinds of identifications';

COMMENT ON COLUMN identification.ididentification
IS 'The id number of the type of identification';

COMMENT ON COLUMN identification.typeId
IS 'The type of identification';

COMMENT ON COLUMN identification.createdBy
IS 'The name of the user that created the tuple';

COMMENT ON COLUMN identification.creationDate
IS 'Date when the tuple was created';

COMMENT ON COLUMN identification.modifiedBy
IS 'The name of the user that modified the type';

COMMENT ON COLUMN identification.modificationDate
IS 'Date when it was last modified';
