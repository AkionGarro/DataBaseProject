create table BUYERRATING
(
idBuyRating varchar2(10),
IDAPPUSER NUMBER(8) CONSTRAINT BUYERRATING_username_nn NOT NULL,
rating varchar2(10) CONSTRAINT BUYERRATING_rating_nn NOT NULL,
createdBy varchar2(10),
creationDate DATE,
modifiedBy varchar2(10),
modificationDate DATE
);

------------------------------------Primary Keys-----------------------------------------

ALTER TABLE BUYERRATING 
ADD CONSTRAINT pk_BUYERRATING PRIMARY KEY (idBuyRating)
USING INDEX
TABLESPACE pr_ind PCTFREE 20
STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);
---------------------------------------Foreign keys---------------------------------------

ALTER TABLE BUYERRATING
ADD CONSTRAINT fk_BUYERRATING_APPUSER FOREIGN KEY
(IDAPPUSER) REFERENCES APPUSER (IDAPPUSER);

---------------------------------------Comments--------------------------------------------------

COMMENT ON TABLE BUYERRATING
is 'The table containing the information about the buyer rating';

COMMENT ON COLUMN BUYERRATING.idBuyRating
IS 'The id that identifies the buyer rating';

COMMENT ON COLUMN BUYERRATING.IDAPPUSER
IS 'Reference to the user';

COMMENT ON COLUMN BUYERRATING.rating
IS 'Reference to the buyer rating';

COMMENT ON COLUMN BUYERRATING.createdBy
is 'The user who created the tuple';

COMMENT ON COLUMN BUYERRATING.creationDate
is 'The date when the tuple was created';

COMMENT ON COLUMN BUYERRATING.modifiedBy
is 'The user who modified the tuple';

COMMENT ON COLUMN BUYERRATING.modificationDate
is 'The date when the tuple was modified';
