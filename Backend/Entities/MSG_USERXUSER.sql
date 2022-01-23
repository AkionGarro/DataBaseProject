CREATE TABLE MSG_USERXUSER(
idWriter number(8),
idRecipient number(8),
subject varchar2(20) CONSTRAINT MSG_USERXUSER_subject_nn NOT NULL,
descriptionM varchar2(150)CONSTRAINT MSG_USERXUSER_descriptionm_nn NOT NULL,
sendDate DATE CONSTRAINT MSG_USERXUSER_sendDate_nn NOT NULL,
createdBy VARCHAR2(20),
creationDate DATE,
modifiedBy VARCHAR2(20),
modificationDate DATE
);

--------------------------------------PK---------------------------------------------------
ALTER TABLE MSG_USERXUSER
ADD CONSTRAINT pk_MSG_USERXUSER PRIMARY KEY (idWriter,idRecipient)
USING INDEX
TABLESPACE pr_ind PCTFREE 20
STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);
-------------------------------------Comments----------------------------------------------------

COMMENT ON TABLE MSG_USERXUSER
is 'It is a table that stores the messages sent between two users';
COMMENT ON COLUMN MSG_USERXUSER.idWriter
is 'Reference to the user who sends the message';
COMMENT ON COLUMN MSG_USERXUSER.idRecipient
is 'Reference to the user who receives the message';
COMMENT ON COLUMN MSG_USERXUSER.subject
is 'Subject of the message';
COMMENT ON COLUMN MSG_USERXUSER.descriptionM
is 'The message that will be sent';
COMMENT ON COLUMN MSG_USERXUSER.sendDate
is 'Time the message was sent';
COMMENT ON COLUMN MSG_USERXUSER.createdBy
is 'The user who created the tuple';
COMMENT ON COLUMN MSG_USERXUSER.creationDate
is 'The date when the tuple was created';
COMMENT ON COLUMN MSG_USERXUSER.modifiedBy
is 'The user who modified the tuple';
COMMENT ON COLUMN MSG_USERXUSER.modificationDate
is 'The date when the tuple was modified';
