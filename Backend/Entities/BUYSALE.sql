CREATE TABLE BUYSALE (
idBuySale NUMBER(6), 
idUserSeller number(8)CONSTRAINT BUYSALE_idUserSeller_nn not null, 
idClock NUMBER(10) CONSTRAINT BUYSALE_idClock_nn not null,
idUserBuyer number(8),
idBuyStatus NUMBER(3) CONSTRAINT BUYSALE_idBuyStatus_nn not null,
idReview NUMBER(8),
idShippingM NUMBER(4),
idPaymentM NUMBER(3),
shippingPrice  NUMBER(8),
datePost DATE CONSTRAINT BUYSALE_datePost_nn not null,
totalPrice  NUMBER(8),
dateSale DATE,
createdBy VARCHAR2(20),
creationDate DATE,
modifiedBy VARCHAR2(20),
modificationDate DATE
);

------------------------------------Primary Keys-----------------------------------------

ALTER TABLE BUYSALE
ADD CONSTRAINT pk_BUYSALE PRIMARY KEY (idBuySale)
USING INDEX
TABLESPACE pr_ind PCTFREE 20
STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);

-----------------------------------Comments------------------------------------------------------
COMMENT ON TABLE BUYSALE
is 'It is a table that links the seller with the clock and stores the order information';
COMMENT ON COLUMN BUYSALE.idBuySale
is 'Unique identifier of the sale post';
COMMENT ON COLUMN BUYSALE.idUserSeller
is 'Reference to id of the user who sells the clock';
COMMENT ON COLUMN BUYSALE.idClock
is 'Reference to id of the clock for sale';
COMMENT ON COLUMN BUYSALE.idUserBuyer
is 'Reference to id of the user who bought the clock';
COMMENT ON COLUMN BUYSALE.idBuyStatus
is 'Reference to id of status to know whether the clock has been sold or not';
COMMENT ON COLUMN BUYSALE.idReview
is 'Reference to id of the review left by the user who bought the clock';
COMMENT ON COLUMN BUYSALE.idShippingM
is 'Reference to id of the shipping method';
COMMENT ON COLUMN BUYSALE.idPaymentM
is 'Reference to id of the payment method';
COMMENT ON COLUMN BUYSALE.totalPrice
is 'Total price of the item';
COMMENT ON COLUMN BUYSALE.shippingPrice
is 'Shipping cost';
COMMENT ON COLUMN BUYSALE.datePost
is 'The date when the item was posted';
COMMENT ON COLUMN BUYSALE.totalPrice
is 'Reference to total price of sale';
COMMENT ON COLUMN BUYSALE.dateSale
is 'The date when the item was sold';
COMMENT ON COLUMN BUYSALE.createdBy
is 'The user who created the tuple';
COMMENT ON COLUMN BUYSALE.creationDate
is 'The date when the tuple was created';
COMMENT ON COLUMN BUYSALE.modifiedBy
is 'The user who modified the tuple';
COMMENT ON COLUMN BUYSALE.modificationDate
is 'The date when the tuple was modified';
