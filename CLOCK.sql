create table CLOCK
(
idClock number(10),
idModel number(10) CONSTRAINT CLOCK_idModel_nn NOT NULL,
idType number(3) CONSTRAINT CLOCK_idType_nn NOT NULL,
idCondition number(2) CONSTRAINT CLOCK_idCondition_nn NOT NULL,
descriptionClock varchar2(100) CONSTRAINT CLOCK_descriptionClock_nn NOT NULL,
manufactureDate DATE CONSTRAINT CLOCK_manufactureDate_nn NOT NULL,
vintage varchar2(10) CONSTRAINT CLOCK_vintage_nn NOT NULL,
price varchar2(10) CONSTRAINT CLOCK_price_nn NOT NULL,
condition varchar2(10) CONSTRAINT CLOCK_condition_nn NOT NULL,
createdBy varchar2(10),
creationDate DATE,
modifiedBy varchar2(10),
modificationDate DATE
);

--------------------------------------------Primary Keys----------------------------------
ALTER TABLE CLOCK 
ADD CONSTRAINT pk_CLOCK PRIMARY KEY (idClock)
USING INDEX
TABLESPACE pr_ind PCTFREE 20
STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);
--------------------------------------------Foreign Keys----------------------------------

ALTER TABLE CLOCK
ADD CONSTRAINT fk_CLOCK_MODEL FOREIGN KEY
(idModel) REFERENCES MODELP(idModel);

ALTER TABLE CLOCK
ADD CONSTRAINT fk_CLOCK_CONDITION FOREIGN KEY
(idCondition) REFERENCES CONDITION(idCondition);


ALTER TABLE CLOCK
ADD CONSTRAINT fk_CLOCK_TYPECLOCK FOREIGN KEY
(idType) REFERENCES TYPECLOCK(idType);

-----------------------------------------Comments--------------------------------------------------


COMMENT ON TABLE CLOCK
is 'The table containing the information about the clock';

COMMENT ON COLUMN CLOCK.idClock
IS 'The id that identifies the clock';


COMMENT ON COLUMN CLOCK.idModel
IS 'The id that identifies the clock model';

COMMENT ON COLUMN  CLOCK.idCondition
IS 'The id that identifies the clock condition ';

COMMENT ON COLUMN  CLOCK.descriptionClock
IS 'Reference to the all descriptions and features of the watch';

COMMENT ON COLUMN CLOCK.manufactureDate
IS 'Reference to the manufacture date';

COMMENT ON COLUMN CLOCK.vintage
IS 'Reference to the vintage category';

COMMENT ON COLUMN CLOCK.price
IS 'Reference to the clock price';

COMMENT ON COLUMN CLOCK.condition
IS 'Reference to the clock condition';

COMMENT ON COLUMN CLOCK.createdBy
is 'The user who created the tuple';

COMMENT ON COLUMN CLOCK.creationDate
is 'The date when the tuple was created';

COMMENT ON COLUMN CLOCK.modifiedBy
is 'The user who modified the tuple';

COMMENT ON COLUMN CLOCK.modificationDate
is 'The date when the tuple was modified';

COMMENT ON COLUMN CLOCK.idType
IS 'The id that identifies the clock type';

