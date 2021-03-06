create table LOGBOOKCLOCK (
idLogBook number(10),
nameTable varchar2(20) constraint logbook_nameTable_nn NOT NULL,
nameScheme varchar2(20)constraint logbook_nameScheme_nn NOT NULL,
nameColumn varchar2(20)constraint logbook_nameColumn_nn NOT NULL,
idClock number(10),
currentPrice number(10),
lastPrice number(10),
modificationDate DATE
);


ALTER TABLE LOGBOOKCLOCK
ADD CONSTRAINT pk_LOGBOOKCLOCK  PRIMARY KEY (idLogBook)
USING INDEX
TABLESPACE pr_ind PCTFREE 20
STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);

ALTER TABLE LOGBOOKCLOCK
ADD CONSTRAINT fk_LOGBOOKCLOCK_IDCLOCK FOREIGN KEY
(idClock) REFERENCES pr.clock(idClock);


COMMENT ON TABLE LOGBOOKCLOCK
IS 'Table of logs when a price is updated';

COMMENT ON COLUMN LOGBOOKCLOCK.idLogBook
IS 'Unique identifier of the log';

COMMENT ON COLUMN LOGBOOKCLOCK.nameTable
IS 'Name of the modified table';

COMMENT ON COLUMN LOGBOOKCLOCK.nameScheme
IS 'Name of the scheme';

COMMENT ON COLUMN LOGBOOKCLOCK.nameColumn
IS 'Name of the modified column';

COMMENT ON COLUMN LOGBOOKCLOCK.idClock
IS 'Reference of the clock';

COMMENT ON COLUMN LOGBOOKCLOCK.currentPrice
IS 'New price of the clock';

COMMENT ON COLUMN LOGBOOKCLOCK.lastPrice
IS 'Last price of the clock';


COMMENT ON COLUMN LOGBOOKCLOCK.modificationDate
IS 'Date when it was last modified';





