CREATE TABLE SHIPPINGMETHOD(
idShipping number(4),
nameSM VARCHAR2(20) CONSTRAINT SHIPPINGMETHOD_nameSm_nn NOT NULL,
company VARCHAR2(20) CONSTRAINT SHIPPINGMETHOD_company_nn NOT NULL, 
createdBy VARCHAR2(20),
creationDate DATE,
modifiedBy VARCHAR2(20),
modificationDate DATE
);
----------------------------------------PK-------------------------------------------------

ALTER TABLE SHIPPINGMETHOD
ADD CONSTRAINT pk_SHIPPINGMETHOD PRIMARY KEY (idShipping)
USING INDEX
TABLESPACE pr_ind PCTFREE 20
STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);
-------------------------------------comments----------------------------------------------------

COMMENT ON TABLE SHIPPINGMETHOD
is 'It is a table that stores shipping methods';
COMMENT ON COLUMN SHIPPINGMETHOD.idShipping
is  'Unique identifier for the shipping method';
COMMENT ON COLUMN SHIPPINGMETHOD.nameSM
is  'Name of the shipping method';
COMMENT ON COLUMN SHIPPINGMETHOD.company
is  'Name of the company providing the shipping';
COMMENT ON COLUMN SHIPPINGMETHOD.createdBy
is 'The user who created the tuple';
COMMENT ON COLUMN SHIPPINGMETHOD.creationDate
is 'The date when the tuple was created';
COMMENT ON COLUMN SHIPPINGMETHOD.modifiedBy
is 'The user who modified the tuple';
COMMENT ON COLUMN SHIPPINGMETHOD.modificationDate
is 'The date when the tuple was modified';
