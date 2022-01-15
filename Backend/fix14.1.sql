drop table typeclockxbrand;
delete from modelP;
alter table modelp

add idTypeClock number(3) constraint modelP_idTypeClock_nn NOT NULL;

ALTER TABLE modelP
ADD CONSTRAINT fk_modelp_typeclock FOREIGN KEY (idTypeClock) REFERENCES typeClock(idtype);



ALTER TABLE CLOCK DROP COLUMN IDTYPE;