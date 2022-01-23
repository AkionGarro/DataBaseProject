--Trigger logbook dont add yet
CREATE OR REPLACE trigger beforeUpdatePriceClock
before insert or update of price
on pr.clock
for each row
BEGIN
INSERT INTO ps.bitacora
(idLogBook, nameScheme, nameTable,
nameColumn, modificationDate, lastPrice, currentPrice)
VALUES (ps.s_logbook, 'PR', 'CLOCK',
'PRICE', SYSDATE, :old.PRICE, :new.PRICE);
END beforeUpdatePriceClock;
