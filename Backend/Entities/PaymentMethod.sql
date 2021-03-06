create table paymentMethod
(
idPay NUMBER(3),
type varchar2(10) constraint paymentMethod_type_nn not null,
createdBy varchar2(10),
creationDate DATE,
modifiedBy varchar2(10),
modificationDate DATE
);

------------------------------PK-----------------------------------------------------------
ALTER TABLE paymentMethod
ADD CONSTRAINT pk_paymentMethod PRIMARY KEY (idPay)
USING INDEX
TABLESPACE pr_ind PCTFREE 20
STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);

-----------------------------Comments------------------------------------------------------------
COMMENT ON TABLE paymentMethod
IS 'Table for the diferents payment method';

COMMENT ON COLUMN paymentMethod.idPay
IS 'The id number of the payment method';

COMMENT ON COLUMN paymentMethod.type
IS 'The name of the type of payment method';

COMMENT ON COLUMN paymentMethod.createdBy
IS 'The name of the user that created the tuple';

COMMENT ON COLUMN paymentMethod.creationDate
IS 'Date when the tuple was created';

COMMENT ON COLUMN paymentMethod.modifiedBy
IS 'The name of the user that modified the type';

COMMENT ON COLUMN paymentMethod.modificationDate
IS 'Date when it was last modified';
