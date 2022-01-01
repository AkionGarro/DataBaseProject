create table shoppingcart_userxclock(
idUser varchar2(10),
idClock Number(10),
subTotal Number(10),
createdBy varchar2(10),
creationDate DATE,
modifiedBy varchar2(10),
modificationDate DATE
);

ALTER TABLE shoppingcart_userxclock 
ADD CONSTRAINT pk_shoppingcart_userxclock PRIMARY KEY (idUser ,idClock )
USING INDEX
TABLESPACE pr_ind PCTFREE 20
STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);

ALTER TABLE shoppingcart_userxclock
ADD CONSTRAINT fk_shoppingcart_userxclock_appUser FOREIGN KEY
(idUser) REFERENCES appuser(username);

ALTER TABLE shoppingcart_userxclock
ADD CONSTRAINT fk_shoppingcart_userxclock_Clock FOREIGN KEY
(idClock) REFERENCES CLOCK(idClock);

COMMENT ON TABLE shoppingcart_userxclock
is 'The table containing the information of the clocks that the user has in his shoppingcart';

COMMENT ON COLUMN shoppingcart_userxclock.idUser
is 'References the username of the user that has the clock in the shoppingcart';

COMMENT ON COLUMN shoppingcart_userxclock.idClock
is 'References the idClock in the shoppingcart';

COMMENT on column shoppingcart_userxclock.subTotal
is 'the amount that the user has to pay for the clock';

COMMENT ON COLUMN shoppingcart_userxclock.createdBy
IS 'The name of the user that created the tuple';

COMMENT ON COLUMN shoppingcart_userxclock.creationDate
IS 'Date when it was created';

COMMENT ON COLUMN shoppingcart_userxclock.modifiedBy
IS 'The name of the user that modified the tuple';

COMMENT ON COLUMN shoppingcart_userxclock.modificationDate
IS 'Date when it was last modified';