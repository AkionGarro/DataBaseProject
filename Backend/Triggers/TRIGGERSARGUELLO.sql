--Triggers for SHIPPINGMETHOD
CREATE OR REPLACE TRIGGER pr.beforeCreateSHIPPINGMETHOD
BEFORE INSERT
ON pr.SHIPPINGMETHOD
For each row
BEGIN
:new.createdBy:=USER;
:new.creationDate:=SYSDATE;
END beforeCreateSHIPPINGMETHOD;


CREATE OR REPLACE TRIGGER pr.beforeUpdateSHIPPINGMETHOD
BEFORE UPDATE
ON pr.SHIPPINGMETHOD
For each row
BEGIN
:new.modifiedBy:=USER;
:new.modificationDate:=SYSDATE;
END beforeUpdateSHIPPINGMETHOD;

--Triggers for APPUSER
CREATE OR REPLACE TRIGGER pr.beforeCreateAPPUSER
BEFORE INSERT
ON pr.APPUSER
For each row
BEGIN
:new.createdBy:=USER;
:new.creationDate:=SYSDATE;
END beforeCreateAPPUSER;


CREATE OR REPLACE TRIGGER pr.beforeUpdateAPPUSER
BEFORE UPDATE
ON pr.APPUSER
For each row
BEGIN
:new.modifiedBy:=USER;
:new.modificationDate:=SYSDATE;
END beforeUpdateAPPUSER;


--Triggers for IDENTIFICATION
CREATE OR REPLACE TRIGGER pr.beforeCreateIDENTIFICATION
BEFORE INSERT
ON pr.IDENTIFICATION
For each row
BEGIN
:new.createdBy:=USER;
:new.creationDate:=SYSDATE;
END beforeCreateIDENTIFICATION;


CREATE OR REPLACE TRIGGER pr.beforeUpdateIDENTIFICATION
BEFORE UPDATE
ON pr.IDENTIFICATION
For each row
BEGIN
:new.modifiedBy:=USER;
:new.modificationDate:=SYSDATE;
END beforeUpdateIDENTIFICATION;


--Triggers for shcart_appuserxclock
CREATE OR REPLACE TRIGGER pr.beforeCrshcart_appuserxclock
BEFORE INSERT
ON pr.shcart_appuserxclock
For each row
BEGIN
:new.createdBy:=USER;
:new.creationDate:=SYSDATE;
END beforeCrshcart_appuserxclock;


CREATE OR REPLACE TRIGGER pr.beforeUpdtshcart_appuserxclock
BEFORE UPDATE
ON pr.shcart_appuserxclock
For each row
BEGIN
:new.modifiedBy:=USER;
:new.modificationDate:=SYSDATE;
END beforeUpdtshcart_appuserxclock;

--Triggers for GENDER
CREATE OR REPLACE TRIGGER pr.beforeCreateGENDER
BEFORE INSERT
ON pr.GENDER
For each row
BEGIN
:new.createdBy:=USER;
:new.creationDate:=SYSDATE;
END beforeCreateGENDER;


CREATE OR REPLACE TRIGGER pr.beforeUpdateGENDER
BEFORE UPDATE
ON pr.GENDER
For each row
BEGIN
:new.modifiedBy:=USER;
:new.modificationDate:=SYSDATE;
END beforeUpdateGENDER;


--Triggers for COUNTRY
CREATE OR REPLACE TRIGGER pr.beforeCreateCOUNTRY
BEFORE INSERT
ON pr.COUNTRY
For each row
BEGIN
:new.createdBy:=USER;
:new.creationDate:=SYSDATE;
END beforeCreateCOUNTRY;


CREATE OR REPLACE TRIGGER pr.beforeUpdateCOUNTRY
BEFORE UPDATE
ON pr.COUNTRY
For each row
BEGIN
:new.modifiedBy:=USER;
:new.modificationDate:=SYSDATE;
END beforeUpdateCOUNTRY;

--Triggers for CITY
CREATE OR REPLACE TRIGGER pr.beforeCreateCITY
BEFORE INSERT
ON pr.CITY
For each row
BEGIN
:new.createdBy:=USER;
:new.creationDate:=SYSDATE;
END beforeCreateCITY;


CREATE OR REPLACE TRIGGER pr.beforeUpdateCITY
BEFORE UPDATE
ON pr.CITY
For each row
BEGIN
:new.modifiedBy:=USER;
:new.modificationDate:=SYSDATE;
END beforeUpdateCITY;

--Triggers for PEOPLE
CREATE OR REPLACE TRIGGER pr.beforeCreatePEOPLE
BEFORE INSERT
ON pr.PEOPLE
For each row
BEGIN
:new.createdBy:=USER;
:new.creationDate:=SYSDATE;
END beforeCreatePEOPLE;


CREATE OR REPLACE TRIGGER pr.beforeUpdatePEOPLE
BEFORE UPDATE
ON pr.PEOPLE
For each row
BEGIN
:new.modifiedBy:=USER;
:new.modificationDate:=SYSDATE;
END beforeUpdatePEOPLE;
