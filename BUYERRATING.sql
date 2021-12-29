create table BUYERRATING
(
idBuyRating varchar2(10), CONSTRAINT BUYERRATING_pk PRIMARY KEY (idBuyRating),
username varchar(10) CONSTRAINT BUYERRATING_username_nn NOT NULL,
rating varchar(10) CONSTRAINT BUYERRATING_rating_nn NOT NULL,
createdBy varchar2(10),
creationDate DATE,
modifiedBy varchar2(10),
modificationDate DATE
);

COMMENT ON TABLE BUYERRATING
is 'The table containing the information about the buyer rating';

COMMENT ON COLUMN BUYERRATING.idBuyRating
IS 'The id that identifies the buyer rating';

COMMENT ON COLUMN BUYERRATING.username
IS 'The id that identifies the username';

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
