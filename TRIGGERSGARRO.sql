-------------------------------Triggers for CLOCK------------------------------------
CREATE OR REPLACE TRIGGER pr.beforeCreateCLOCK
BEFORE INSERT
ON pr.CLOCK
For each row
BEGIN
:new.createdBy:=USER;
:new.creationDate:=SYSDATE;
END beforeCreateCLOCK;


CREATE OR REPLACE TRIGGER pr.beforeUpdateCLOCK
BEFORE UPDATE
ON pr.CLOCK
For each row
BEGIN
:new.modifiedBy:=USER;
:new.modificationDate:=SYSDATE;
END beforeUpdateCLOCK;




------------------------------Triggers for DISTRICT------------------------------------
CREATE OR REPLACE TRIGGER pr.beforeCreateDISTRICT
BEFORE INSERT
ON pr.DISTRICT
For each row
BEGIN
:new.createdBy:=USER;
:new.creationDate:=SYSDATE;
END beforeCreateDISTRICT;


CREATE OR REPLACE TRIGGER pr.beforeUpdateDISTRICT
BEFORE UPDATE
ON pr.DISTRICT
For each row
BEGIN
:new.modifiedBy:=USER;
:new.modificationDate:=SYSDATE;
END beforeUpdateDISTRICT;


------------------------------Triggers for USERTYPE------------------------------------
CREATE OR REPLACE TRIGGER pr.beforeCreateUSERTYPE
BEFORE INSERT
ON pr.USERTYPE
For each row
BEGIN
:new.createdBy:=USER;
:new.creationDate:=SYSDATE;
END beforeCreateUSERTYPE;


CREATE OR REPLACE TRIGGER pr.beforeUpdateUSERTYPE
BEFORE UPDATE
ON pr.USERTYPE
For each row
BEGIN
:new.modifiedBy:=USER;
:new.modificationDate:=SYSDATE;
END beforeUpdateUSERTYPE;


------------------------------Triggers for  WLISTUSERXCLOCK------------------------------------
CREATE OR REPLACE TRIGGER pr.beforeCreateWLISTUSERXCLOCK
BEFORE INSERT
ON pr.WLISTUSERXCLOCK
For each row
BEGIN
:new.createdBy:=USER;
:new.creationDate:=SYSDATE;
END beforeCreateWLISTUSERXCLOCK;


CREATE OR REPLACE TRIGGER pr.beforeUpdateWLISTUSERXCLOCK
BEFORE UPDATE
ON pr.WLISTUSERXCLOCK
For each row
BEGIN
:new.modifiedBy:=USER;
:new.modificationDate:=SYSDATE;
END beforeUpdateWLISTUSERXCLOCK;



------------------------------Triggers for  MODELP------------------------------------
CREATE OR REPLACE TRIGGER pr.beforeCreateMODELP
BEFORE INSERT
ON pr.MODELP
For each row
BEGIN
:new.createdBy:=USER;
:new.creationDate:=SYSDATE;
END beforeCreateMODELP;


CREATE OR REPLACE TRIGGER pr.beforeUpdateMODELP
BEFORE UPDATE
ON pr.MODELP
For each row
BEGIN
:new.modifiedBy:=USER;
:new.modificationDate:=SYSDATE;
END beforeUpdateMODELP;

------------------------------Triggers for  SELLERRATING------------------------------------
CREATE OR REPLACE TRIGGER pr.beforeCreateSELLERRATING
BEFORE INSERT
ON pr.SELLERRATING
For each row
BEGIN
:new.createdBy:=USER;
:new.creationDate:=SYSDATE;
END beforeCreateSELLERRATING;


CREATE OR REPLACE TRIGGER pr.beforeUpdateSELLERRATING
BEFORE UPDATE
ON pr.SELLERRATING
For each row
BEGIN
:new.modifiedBy:=USER;
:new.modificationDate:=SYSDATE;
END beforeUpdateSELLERRATING;

------------------------------Triggers for  BUYERRATING------------------------------------
CREATE OR REPLACE TRIGGER pr.beforeCreateBUYERRATING
BEFORE INSERT
ON pr.BUYERRATING
For each row
BEGIN
:new.createdBy:=USER;
:new.creationDate:=SYSDATE;
END beforeCreateBUYERRATING;


CREATE OR REPLACE TRIGGER pr.beforeUpdateBUYERRATING
BEFORE UPDATE
ON pr.BUYERRATING
For each row
BEGIN
:new.modifiedBy:=USER;
:new.modificationDate:=SYSDATE;
END beforeUpdateBUYERRATING;


------------------------------Triggers for  PAYMENTMETHOD------------------------------------
CREATE OR REPLACE TRIGGER pr.beforeCreatePAYMENTMETHOD
BEFORE INSERT
ON pr.PAYMENTMETHOD
For each row
BEGIN
:new.createdBy:=USER;
:new.creationDate:=SYSDATE;
END beforeCreatePAYMENTMETHOD;


CREATE OR REPLACE TRIGGER pr.beforeUpdatePAYMENTMETHOD
BEFORE UPDATE
ON pr.PAYMENTMETHOD
For each row
BEGIN
:new.modifiedBy:=USER;
:new.modificationDate:=SYSDATE;
END beforeUpdatePAYMENTMETHOD;