create table SELLERATING
(
idSellRating varchar2(10), CONSTRAINT SELLERRATING_pk PRIMARY KEY (idSellRating),
username varchar(10),
rating varchar(10),
createdBy varchar2(10),
creationDate DATE,
modifiedBy varchar2(10),
modificationDate DATE
);

COMMENT ON TABLE SELLERRATING
is 'The table containing the information about the seller rating';

COMMENT ON COLUMN SELLERRATING.idSellRating
IS 'The id that identifies the clock model';

COMMENT ON COLUMN SELLERRATING.username
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