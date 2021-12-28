create table CLOCK
(
idClock varchar2(10), CONSTRAINT CLOCK_pk PRIMARY KEY (idClock),
idType varchar(10),
idModel varchar(10),
idCondition varchar(10),
descriptionClock varchar(10),
manufactureDate DATE,
vintage varchar2(10),
price varchar2(10),
condition varchar2(10),
createdBy varchar2(10),
creationDate DATE,
modifiedBy varchar2(10),
modificationDate DATE
);

COMMENT ON TABLE CLOCK
is 'The table containing the information about the clock';

COMMENT ON COLUMN CLOCK.idClock
IS 'The id that identifies the clock';

COMMENT ON COLUMN CLOCK.idType
IS 'The id that identifies the clock type';

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