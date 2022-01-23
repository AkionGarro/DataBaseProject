alter table USERTYPE ADD nameType varchar2(10) constraint usertype_nameType_nn not null;
alter table clock drop column condition;

alter table sellerrating modify(rating number(2));

alter table sellerrating add
CONSTRAINT Check_rating
    CHECK ((rating < 6) and 
      (rating>0));


alter table buyerrating modify(rating number(2));

alter table buyerrating add
CONSTRAINT Check_BuyerRating
    CHECK ((rating < 6) and 
      (rating>0));

---quitar foreignkey de appuser a people
alter table appuser
drop constraint fk_APPUSER_persona;
---quitar primary key de people
alter table people
drop constraint pk_people;
-- agregaridpeople
alter table people add idPeople  number(8);

--agregarprimarykey a id people
ALTER TABLE people
ADD CONSTRAINT pk_people PRIMARY KEY (idPeople)
USING INDEX
TABLESPACE pr_ind PCTFREE 20
STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);
--agregar secuencia people
CREATE SEQUENCE s_people
START WITH 0
INCREMENT BY 1
MINVALUE 0
MAXVALUE 10000000
NOCACHE
NOCYCLE;

---borrar columna en appuser
alter table appuser drop column IDENTIFICATIONNUMBER;
--agregar columna idpeople
alter table appuser add idpeople number(8);
--agregar foreignkey de appuser a people
ALTER TABLE appuser
ADD CONSTRAINT fk_appuser_people FOREIGN KEY
(idPeople) REFERENCES people(idPeople);


alter table userType modify(
nameType varchar2(20), descriptionType varchar2(50));


execute packagepcd.new_Usertype('SuperAdmin','Can modify the DB');
execute packagepcd.new_Usertype('Admin','Can modify the DB');            
execute packagepcd.new_Usertype('User','Can buy and sell');


alter table city drop constraint CITY_NAMECITY_IDCOUNTRY_U;

ALTER TABLE CITY 
    ADD CONSTRAINT CITY_NAMECITY_IDCOUNTRY_U 
    UNIQUE (nameCITY, IDCOUNTRY) 
    USING INDEX
    TABLESPACE pr_ind PCTFREE 20
    STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);



---cambiar tamaño nombre ciudad a 40
alter table city
modify(nameCity varchar2(40));
---cambiartamaño nombre distrito
alter table district
modify(namedistrict varchar2(40));
---canmbiartamaño nombre pais
alter table country
modify(nameCountry varchar2(40));


alter table userType modify(
nameType varchar2(20), descriptionType varchar2(50));

---resetear uniques
alter table city drop constraint CITY_NAMECITY_IDCOUNTRY_U;

ALTER TABLE CITY 
    ADD CONSTRAINT CITY_NAMECITY_IDCOUNTRY_U 
    UNIQUE (nameCITY, IDCOUNTRY) 
    USING INDEX
    TABLESPACE pr_ind PCTFREE 20
    STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);

alter table appuser drop constraint APPUSER_USERNAME_U;
ALTER TABLE appuser
    ADD CONSTRAINT APPUSER_USERNAME_U 
    UNIQUE (username) 
    USING INDEX
    TABLESPACE pr_ind PCTFREE 20
    STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);

alter table BRAND drop constraint BRAND_NAMEBRAND_U;
ALTER TABLE BRAND
    ADD CONSTRAINT BRAND_NAMEBRAND_U
    UNIQUE (NAMEBRAND) 
    USING INDEX
    TABLESPACE pr_ind PCTFREE 20
    STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);


alter table BUYSTATUS drop constraint STATUS_BUYSTATUS_U ;
ALTER TABLE BUYSTATUS
    ADD CONSTRAINT BUYSTATUS_STATUS_U
    UNIQUE (STATUS) 
    USING INDEX
    TABLESPACE pr_ind PCTFREE 20
    STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);


alter table CONDITION drop constraint COND_NAMEC_UNIQUE;
ALTER TABLE CONDITION
    ADD CONSTRAINT COND_NAMEC_UNIQUE
    UNIQUE (NAMECONDITION) 
    USING INDEX
    TABLESPACE pr_ind PCTFREE 20
    STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);


alter table COUNTRY drop constraint COUNTRY_NAMECOUNTRY_U;
ALTER TABLE COUNTRY
    ADD CONSTRAINT COUNTRY_NAMECOUNTRY_U
    UNIQUE (NAMECOUNTRY) 
    USING INDEX
    TABLESPACE pr_ind PCTFREE 20
    STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);




alter table DISTRICT drop constraint DSTRICT_NAMED_IDC_U;
ALTER TABLE DISTRICT
    ADD CONSTRAINT DSTRICT_NAMED_IDC_U 
    UNIQUE (nameDistrict,idCity) 
    USING INDEX
    TABLESPACE pr_ind PCTFREE 20
    STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);

alter table GENDER drop constraint GENDER_NAMEGENDER_U;
ALTER TABLE GENDER
    ADD CONSTRAINT GENDER_NAMEGENDER_U
    UNIQUE (NAMEGENDER) 
    USING INDEX
    TABLESPACE pr_ind PCTFREE 20
    STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);


alter table IDENTIFICATION drop constraint IDENTIFICATION_TYPEID_U;
ALTER TABLE IDENTIFICATION
    ADD CONSTRAINT IDENTIFICATION_TYPEID_U
    UNIQUE (TYPEID) 
    USING INDEX
    TABLESPACE pr_ind PCTFREE 20
    STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);

alter table MODELP drop constraint MODELP_NAMEM_IDBRAND_U;
ALTER TABLE MODELP
    ADD CONSTRAINT MODELP_NAMEM_IDBRAND_U
    UNIQUE (namemodel,idbrand) 
    USING INDEX
    TABLESPACE pr_ind PCTFREE 20
    STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);


alter table PAYMENTMETHOD drop constraint PAYMENTMETHOD_TYPE_U;
ALTER TABLE PAYMENTMETHOD
    ADD CONSTRAINT PAYMENTMETHOD_TYPE_U
    UNIQUE (TYPE) 
    USING INDEX
    TABLESPACE pr_ind PCTFREE 20
    STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);


alter table PEOPLE drop constraint PEOPLE_IDNUMBER_U;
ALTER TABLE PEOPLE
    ADD CONSTRAINT PEOPLE_IDNUMBER_U
    UNIQUE (IDENTIFICATIONNUMBER) 
    USING INDEX
    TABLESPACE pr_ind PCTFREE 20
    STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);


alter table SHIPPINGMETHOD drop constraint SHIPM_NAMESM_COMPANY_U;
ALTER TABLE SHIPPINGMETHOD
    ADD CONSTRAINT SHIPM_NAMESM_COMPANY_U
    UNIQUE (NAMESM,COMPANY) 
    USING INDEX
    TABLESPACE pr_ind PCTFREE 20
    STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);



alter table TYPECLOCK drop constraint TYPECLOCK_NAME_UNIQUE;
ALTER TABLE TYPECLOCK
    ADD CONSTRAINT TYPECLOCK_NAMETYPE_U
    UNIQUE (NAMETYPE) 
    USING INDEX
    TABLESPACE pr_ind PCTFREE 20
    STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);

alter table USERTYPE drop constraint USERTYPE_NAMETYPE_U;
ALTER TABLE USERTYPE
    ADD CONSTRAINT USERTYPE_NAMETYPE_U
    UNIQUE (NAMETYPE) 
    USING INDEX
    TABLESPACE pr_ind PCTFREE 20
    STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);