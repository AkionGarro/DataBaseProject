CREATE TABLE HISTORY_APPUSERXBUYSALE(
idUser varchar2(20),
idBuySale number(8),
createdBy VARCHAR2(20),
creationDate DATE,
modifiedBy VARCHAR2(20),
modificationDate DATE

);

ALTER TABLE HISTORY_APPUSERXBUYSALE
ADD CONSTRAINT pk_HISTORY_APPUSERXBUYSALE PRIMARY KEY ( idUser, idBuySale)
USING INDEX
TABLESPACE pr_ind PCTFREE 20
STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);

COMMENT ON TABLE HISTORY_APPUSERXBUYSALE
is 'It is a table that links users with the items they have bought';
COMMENT ON COLUMN HISTORY_APPUSERXBUYSALE.idUser
is 'Reference to id of the user who bought the item';
COMMENT ON COLUMN HISTORY_APPUSERXBUYSALE.idBuySale
is 'Reference to id of the item’s post';
COMMENT ON COLUMN HISTORY_APPUSERXBUYSALE.createdBy
is 'The user who created the tuple';
COMMENT ON COLUMN HISTORY_APPUSERXBUYSALE.creationDate
is 'The date when the tuple was created';
COMMENT ON COLUMN HISTORY_APPUSERXBUYSALE.modifiedBy
is 'The user who modified the tuple';
COMMENT ON COLUMN HISTORY_APPUSERXBUYSALE.modificationDate
is 'Date when it was last modified';
 
