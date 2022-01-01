create table shcart_appuserxclock(
idUser varchar2(10),
idClock Number(10),
subTotal Number(10),
createdBy varchar2(10),
creationDate DATE,
modifiedBy varchar2(10),
modificationDate DATE
);

ALTER TABLE shcart_appuserxclock 
ADD CONSTRAINT pk_shcart_appuserxclock PRIMARY KEY (idUser ,idClock )
USING INDEX
TABLESPACE pr_ind PCTFREE 20
STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);

ALTER TABLE shcart_appuserxclock
ADD CONSTRAINT fk_shcart_appuserxclock_appUser FOREIGN KEY
(idUser) REFERENCES appuser(username);

ALTER TABLE shcart_appuserxclock
ADD CONSTRAINT fk_shcart_appuserxclock_Clock FOREIGN KEY
(idClock) REFERENCES CLOCK(idClock);

COMMENT ON TABLE shcart_appuserxclock
is 'The table containing the information of the clocks that the user has in his shoppingcart';

COMMENT ON COLUMN shcart_appuserxclock.idUser
is 'References the username of the user that has the clock in the shoppingcart';

COMMENT ON COLUMN shcart_appuserxclock.idClock
is 'References the idClock in the shoppingcart';

COMMENT on column shcart_appuserxclock.subTotal
is 'the amount that the user has to pay for the clock';

COMMENT ON COLUMN shcart_appuserxclock.createdBy
IS 'The name of the user that created the tuple';

COMMENT ON COLUMN shcart_appuserxclock.creationDate
IS 'Date when it was created';

COMMENT ON COLUMN shcart_appuserxclock.modifiedBy
IS 'The name of the user that modified the tuple';

COMMENT ON COLUMN shcart_appuserxclock.modificationDate
IS 'Date when it was last modified';
