create table WLISTUSERXCLOCK
(
idUser varchar2(10), 
idClock number(10), CONSTRAINT WLISTUSERXCLOCK_pk PRIMARY KEY (idClock,idUser),
createdBy varchar2(10),
creationDate DATE,
modifiedBy varchar2(10),
modificationDate DATE
);

COMMENT ON TABLE WLISTUSERXCLOCK
is 'The table containing the information about the district';

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