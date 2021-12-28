create table USERTYPE
(
idUserType varchar2(10), CONSTRAINT USERTYPE_pk PRIMARY KEY (idUserType),
descriptionType varchar(10),
createdBy varchar2(10),
creationDate DATE,
modifiedBy varchar2(10),
modificationDate DATE
);

COMMENT ON TABLE USERTYPE
is 'The table containing the information about the district';

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