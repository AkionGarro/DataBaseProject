--fix 17

alter table buysale drop constraint FK_BUYSALE_SHIPPINGMETHOD;

ALTER TABLE BUYSALE
ADD CONSTRAINT FK_BUYSALE_SHIPPINGMETHOD
   FOREIGN KEY (IDSHIPPINGM)
   REFERENCES shippingmethod (idshipping);


alter table clock modify(
	price number(10)
);