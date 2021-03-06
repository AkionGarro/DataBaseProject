--Triggers for buysale
CREATE OR REPLACE TRIGGER pr.beforeCreateBUYSALE
BEFORE INSERT
ON pr.BUYSALE
For each row
BEGIN
:new.createdBy:=USER;
:new.creationDate:=SYSDATE;
END beforeCreateBUYSALE;


CREATE OR REPLACE TRIGGER pr.beforeUpdateBUYSALE
BEFORE UPDATE
ON pr.BUYSALE
For each row
BEGIN
:new.modifiedBy:=USER;
:new.modificationDate:=SYSDATE;
END beforeUpdateBUYSALE;


--Triggers for CONDITION
CREATE OR REPLACE TRIGGER pr.beforeCreateCONDITION
BEFORE INSERT
ON pr.CONDITION
For each row
BEGIN
:new.createdBy:=USER;
:new.creationDate:=SYSDATE;
END beforeCreateCONDITION;


CREATE OR REPLACE TRIGGER pr.beforeUpdateCONDITION
BEFORE UPDATE
ON pr.CONDITION
For each row
BEGIN
:new.modifiedBy:=USER;
:new.modificationDate:=SYSDATE;
END beforeUpdateCONDITION;


--Triggers for TYPECLOCK
CREATE OR REPLACE TRIGGER pr.beforeCreateTYPECLOCK
BEFORE INSERT
ON pr.TYPECLOCK
For each row
BEGIN
:new.createdBy:=USER;
:new.creationDate:=SYSDATE;
END beforeCreateTYPECLOCK;


CREATE OR REPLACE TRIGGER pr.beforeUpdateTYPECLOCK
BEFORE UPDATE
ON pr.TYPECLOCK
For each row
BEGIN
:new.modifiedBy:=USER;
:new.modificationDate:=SYSDATE;
END beforeUpdateTYPECLOCK;


--Triggers for HISTORY_APPUSERXBUYSALE
CREATE OR REPLACE TRIGGER pr.beforeCrHIST_APPUSERXBUYSALE
BEFORE INSERT
ON pr.HISTORY_APPUSERXBUYSALE
For each row
BEGIN
:new.createdBy:=USER;
:new.creationDate:=SYSDATE;
END beforeCrHIST_APPUSERXBUYSALE;



CREATE OR REPLACE TRIGGER pr.beforeUpdtHIST_APPUSERXBUYSALE
BEFORE UPDATE
ON pr.HISTORY_APPUSERXBUYSALE
For each row
BEGIN
:new.modifiedBy:=USER;
:new.modificationDate:=SYSDATE;
END beforeUpdtHIST_APPUSERXBUYSALE;


--Triggers for BRAND
CREATE OR REPLACE TRIGGER pr.beforeCreateBRAND
BEFORE INSERT
ON pr.BRAND
For each row
BEGIN
:new.createdBy:=USER;
:new.creationDate:=SYSDATE;
END beforeCreateBRAND;


CREATE OR REPLACE TRIGGER pr.beforeUpdateBRAND
BEFORE UPDATE
ON pr.BRAND
For each row
BEGIN
:new.modifiedBy:=USER;
:new.modificationDate:=SYSDATE;
END beforeUpdateBRAND;


--Triggers for PHOTOCLOCK
CREATE OR REPLACE TRIGGER pr.beforeCreatePHOTOCLOCK
BEFORE INSERT
ON pr.PHOTOCLOCK
For each row
BEGIN
:new.createdBy:=USER;
:new.creationDate:=SYSDATE;
END beforeCreatePHOTOCLOCK;


CREATE OR REPLACE TRIGGER pr.beforeUpdatePHOTOCLOCK
BEFORE UPDATE
ON pr.PHOTOCLOCK
For each row
BEGIN
:new.modifiedBy:=USER;
:new.modificationDate:=SYSDATE;
END beforeUpdatePHOTOCLOCK;

--Triggers for MSG_USERXUSER
CREATE OR REPLACE TRIGGER pr.beforeCreateMSG_USERXUSER
BEFORE INSERT
ON pr.MSG_USERXUSER
For each row
BEGIN
:new.createdBy:=USER;
:new.creationDate:=SYSDATE;
END beforeCreateMSG_USERXUSER;


CREATE OR REPLACE TRIGGER pr.beforeUpdateMSG_USERXUSER
BEFORE UPDATE
ON pr.MSG_USERXUSER
For each row
BEGIN
:new.modifiedBy:=USER;
:new.modificationDate:=SYSDATE;
END beforeUpdateMSG_USERXUSER;

--Triggers for BUYSTATUS
CREATE OR REPLACE TRIGGER pr.beforeCreateBUYSTATUS
BEFORE INSERT
ON pr.BUYSTATUS
For each row
BEGIN
:new.createdBy:=USER;
:new.creationDate:=SYSDATE;
END beforeCreateBUYSTATUS;


CREATE OR REPLACE TRIGGER pr.beforeUpdateBUYSTATUS
BEFORE UPDATE
ON pr.BUYSTATUS
For each row
BEGIN
:new.modifiedBy:=USER;
:new.modificationDate:=SYSDATE;
END beforeUpdateBUYSTATUS;


--Triggers for REVIEW
CREATE OR REPLACE TRIGGER pr.beforeCreateREVIEW
BEFORE INSERT
ON pr.REVIEW
For each row
BEGIN
:new.createdBy:=USER;
:new.creationDate:=SYSDATE;
END beforeCreateREVIEW;


CREATE OR REPLACE TRIGGER pr.beforeUpdateREVIEW
BEFORE UPDATE
ON pr.REVIEW
For each row
BEGIN
:new.modifiedBy:=USER;
:new.modificationDate:=SYSDATE;
END beforeUpdateREVIEW;

