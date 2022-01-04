create table WLISTUSERXCLOCK
(
idUser varchar2(10), 
idClock number(10), 
createdBy varchar2(10),
creationDate DATE,
modifiedBy varchar2(10),
modificationDate DATE
);

----------------------------------PK-------------------------------------------------------

ALTER TABLE WLISTUSERXCLOCK 
ADD CONSTRAINT pk_WLISTUSERXCLOCK PRIMARY KEY (idUser,idClock)
USING INDEX
TABLESPACE pr_ind PCTFREE 20
STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);

---------------------------------FK--------------------------------------------------------


ALTER TABLE WLISTUSERXCLOCK
ADD CONSTRAINT fk_WLISTUSERXCLOCK_APPUSER FOREIGN KEY
(idUser) REFERENCES APPUSER(username);

ALTER TABLE WLISTUSERXCLOCK
ADD CONSTRAINT fk_WLISTUSERXCLOCK_CLOCK FOREIGN KEY
(idClock) REFERENCES CLOCK(idClock);

-------------------------------comments----------------------------------------------------------


COMMENT ON TABLE WLISTUSERXCLOCK
is 'The table containing the information about the wish list of the user';

COMMENT ON COLUMN WLISTUSERXCLOCK.idUser
IS 'The id that identifies the user ';

COMMENT ON COLUMN WLISTUSERXCLOCK.idClock
IS 'The id that identifies the clock';

COMMENT ON COLUMN WLISTUSERXCLOCK.createdBy
is 'The user who created the tuple';

COMMENT ON COLUMN WLISTUSERXCLOCK.creationDate
is 'The date when the tuple was created';

COMMENT ON COLUMN WLISTUSERXCLOCK.modifiedBy
is 'The user who modified the tuple';

COMMENT ON COLUMN WLISTUSERXCLOCK.modificationDate
is 'The date when the tuple was modified'; 
