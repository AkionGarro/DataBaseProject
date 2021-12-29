CREATE TABLE CONDITION(
idCondition number(2), 
description VARCHAR2(20) CONSTRAINT CONDITION_description_nn not null,
createdBy VARCHAR2(20),
creationDate DATE,
modifiedBy VARCHAR2(20),
modificationDate DATE
);
ALTER TABLE CONDITION
ADD CONSTRAINT CONDITION_pk PRIMARY KEY (idCondition)
USING INDEX
TABLESPACE pr_ind PCTFREE 20
STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);

COMMENT ON TABLE CONDITION
is 'It is a table that has the clock’s condition; for example: new, used, repaired, factory repaired'
COMMENT ON COLUMN CONDITION.idCondition
is 'Unique identifier of the condition';
COMMENT ON COLUMN CONDITION.description
is 'Description of the condition';
COMMENT ON COLUMN CONDITION.createdBy
is 'The user who created the tuple';
COMMENT ON COLUMN CONDITION.creationDate
is 'The date when the tuple was created';
COMMENT ON COLUMN CONDITION.modifiedBy
is 'The user who modified the tuple';
COMMENT ON COLUMN CONDITION.modificationDate
is 'The date when the tuple was modified';
