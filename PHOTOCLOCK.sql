CREATE TABLE PHOTOCLOCK(
idPhoto number(5), 
idClock number(10) CONSTRAINT PHOTOCLOCK_idClock_nn NOT NULL,
photo BLOB CONSTRAINT PHOTOCLOCK_photo_nn NOT NULL,
descriptionP varchar2(20),
createdBy VARCHAR2(20),
creationDate DATE,
modifiedBy VARCHAR2(20),
modificationDate DATE
);

--------------------------------------PK---------------------------------------------------

ALTER TABLE PHOTOCLOCK
ADD CONSTRAINT pk_PHOTOCLOCK PRIMARY KEY (idPhoto)
USING INDEX
TABLESPACE pr_ind PCTFREE 20
STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);

--------------------------------------Comments---------------------------------------------------


COMMENT ON TABLE PHOTOCLOCK
is 'It is a table that stores the photos of a clock';
COMMENT ON COLUMN PHOTOCLOCK.idPhoto
is 'Unique identifier of the photo';
COMMENT ON COLUMN PHOTOCLOCK.idClock
is 'Reference to id of the clock';
COMMENT ON COLUMN PHOTOCLOCK.photo
is 'Stores the photo';
COMMENT ON COLUMN PHOTOCLOCK.descriptionP
is 'Description of the photo';
COMMENT ON COLUMN PHOTOCLOCK.createdBy
is 'The user who created the tuple';
COMMENT ON COLUMN PHOTOCLOCK.creationDate
is 'The date when the tuple was created';
COMMENT ON COLUMN PHOTOCLOCK.modifiedBy
is 'The user who modified the tuple';
COMMENT ON COLUMN PHOTOCLOCK.modificationDate
is 'The date when the tuple was modified';
