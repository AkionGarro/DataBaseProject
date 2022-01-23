create table GENDER
(
idGender NUMBER(8),
nameGender varchar2(20) constraint gender_name_nn not null,
createdBy varchar2(10),
creationDate DATE,
modifiedBy varchar2(10),
modificationDate DATE
);

-------------------------------------PK----------------------------------------------------
ALTER TABLE GENDER
ADD CONSTRAINT pk_GENDER PRIMARY KEY (idGender)
USING INDEX
TABLESPACE pr_ind PCTFREE 20
STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);


-----------------------------------Comments------------------------------------------------------
COMMENT ON TABLE gender
IS 'Table for the diferents genders';

COMMENT ON COLUMN gender.idgender
IS 'The id number of the type of gender';

COMMENT ON COLUMN gender.nameGender
IS 'The gender name';

COMMENT ON COLUMN gender.createdBy
IS 'The name of the user that created the tuple';

COMMENT ON COLUMN gender.creationDate
IS 'Date when the tuple was created';

COMMENT ON COLUMN gender.modifiedBy
IS 'The name of the user that modified the type';

COMMENT ON COLUMN gender.modificationDate
IS 'Date when it was last modified';
