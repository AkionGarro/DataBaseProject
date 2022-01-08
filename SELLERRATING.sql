create table SELLERRATING
(
idSellRating number(8),
idAppUser number(8) CONSTRAINT SELLERRATING_username_nn NOT NULL ,
rating varchar(10) CONSTRAINT SELLERRATING_rating_nn NOT NULL,
createdBy varchar2(10),
creationDate DATE,
modifiedBy varchar2(10),
modificationDate DATE
);

---------------------------------PK--------------------------------------------------------

ALTER TABLE SELLERRATING 
ADD CONSTRAINT pk_SELLERRATING PRIMARY KEY (idSellRating)
USING INDEX
TABLESPACE pr_ind PCTFREE 20
STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);

--------------------------------FK---------------------------------------------------------

ALTER TABLE SELLERRATING
ADD CONSTRAINT fk_SELLERRATING_APPUSER FOREIGN KEY
(idAPPUSer) REFERENCES APPUSER (idappuser);


-----------------------------------Comments------------------------------------------------------

COMMENT ON TABLE SELLERRATING
is 'The table containing the information about the seller rating';

COMMENT ON COLUMN SELLERRATING.idSellRating
IS 'The id that identifies the sell rating';

COMMENT ON COLUMN SELLERRATING.idappuser
IS 'The id that identifies the username';

COMMENT ON COLUMN SELLERRATING.rating
IS 'Reference to the seller rating';

COMMENT ON COLUMN SELLERRATING.createdBy
is 'The user who created the tuple';

COMMENT ON COLUMN SELLERRATING.creationDate
is 'The date when the tuple was created';

COMMENT ON COLUMN SELLERRATING.modifiedBy
is 'The user who modified the tuple';

COMMENT ON COLUMN SELLERRATING.modificationDate
is 'The date when the tuple was modified';
