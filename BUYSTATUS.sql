CREATE TABLE BUYSTATUS(
idBuyStatus number(3),
status varchar2(20) CONSTRAINT BUYSTATUS_status_nn NOT NULL,
descriptionB varchar2(20),
createdBy VARCHAR2(20),
creationDate DATE,
modifiedBy VARCHAR2(20),
modificationDate DATE
);


ALTER TABLE BUYSTATUS
ADD CONSTRAINT BUYSTATUS_pk PRIMARY KEY (idBuyStatus)
USING INDEX
TABLESPACE pr_ind PCTFREE 20
STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);

COMMENT ON TABLE BUYSTATUS
is 'It is a table with the status of the ar; for example, sold, not sold';
COMMENT ON COLUMN BUYSTATUS.idBuyStatus
is  'Unique idenfitifier of the status';
COMMENT ON COLUMN BUYSTATUS.status
is  'Name of status';
COMMENT ON COLUMN BUYSTATUS.descriptionB
is  'Description of the status';
COMMENT ON COLUMN BUYSTATUS.createdBy
is 'The user who created the tuple';
COMMENT ON COLUMN BUYSTATUS.creationDate
is 'The date when the tuple was created';
COMMENT ON COLUMN BUYSTATUS.modifiedBy
is 'The user who modified the tuple';
COMMENT ON COLUMN BUYSTATUS.modificationDate
is 'The date when the tuple was modified';
