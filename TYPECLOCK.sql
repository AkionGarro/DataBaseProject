CREATE TABLE TYPECLOCK(
idType number(3),
nameType varchar(20) CONSTRAINT TYPECLOCK_nameType_nn not null,
description varchar(20),
createdBy VARCHAR2(20),
creationDate DATE,
modifiedBy VARCHAR2(20),
modificationDate DATE
);

ALTER TABLE TYPECLOCK
ADD CONSTRAINT pk_TYPECLOCK PRIMARY KEY(idType)
USING INDEX
TABLESPACE pr_ind PCTFREE 20
STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);


COMMENT ON TABLE TYPECLOCK
is 'It is a table that has the types of clocks; for example: wall clock, cuckoo clock, watch, etc…'
COMMENT ON COLUMN TYPECLOCK.idType
is 'Unique identifier of the  type of clock';
COMMENT ON COLUMN TYPECLOCK.nameType
is 'Name of the type of clock';
COMMENT ON COLUMN TYPECLOCK.description
is 'Description of the type of clock';
COMMENT ON COLUMN TYPECLOCK.createdBy
is 'The user who created the tuple';
COMMENT ON COLUMN TYPECLOCK.creationDate
is 'The date when the tuple was created';
COMMENT ON COLUMN TYPECLOCK.modifiedBy
is 'The user who modified the tuple';
COMMENT ON COLUMN TYPECLOCK.modificationDate
is 'The date when the tuple was modified';
