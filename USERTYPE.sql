create table USERTYPE
(
idUserType number(2),
descriptionType varchar(10) CONSTRAINT USERTYPE_descriptionType_nn NOT NULL,
createdBy varchar2(10),
creationDate DATE,
modifiedBy varchar2(10),
modificationDate DATE
);

ALTER TABLE USERTYPE 
ADD CONSTRAINT pk_USERTYPE PRIMARY KEY (idUserType)
USING INDEX
TABLESPACE pr_ind PCTFREE 20
STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);

COMMENT ON TABLE USERTYPE
is 'The table containing the information about the user type';

COMMENT ON COLUMN USERTYPE.idUserType
IS 'The id that identifies the user type';

COMMENT ON COLUMN USERTYPE.descriptionType
IS 'Reference to the description of the type';

COMMENT ON COLUMN USERTYPE.createdBy
is 'The user who created the tuple';

COMMENT ON COLUMN USERTYPE.creationDate
is 'The date when the tuple was created';

COMMENT ON COLUMN USERTYPE.modifiedBy
is 'The user who modified the tuple';

COMMENT ON COLUMN USERTYPE.modificationDate
is 'The date when the tuple was modified';  
