CREATE TABLESPACE PR_Data
   DATAFILE 'C:\app\garroakion\oradata\ProyectoBD\prdata01.dbf'
   SIZE 10M
   REUSE
   AUTOEXTEND ON
   NEXT 512k
   MAXSIZE 200M;

CREATE TABLESPACE PR_Ind
   DATAFILE 'C:\app\garroakion\oradata\ProyectoBD\prind01.dbf'
   SIZE 10M
   REUSE
   AUTOEXTEND ON
   NEXT 512k
   MAXSIZE 200M;

CREATE USER pr 
    IDENTIFIED BY pr 
    DEFAULT TABLESPACE pr_data 
    QUOTA 10M ON pr_data 
    TEMPORARY TABLESPACE temp
    QUOTA 5M ON system ;

--------------------------------------------------
GRANT connect TO pr;
--------------------------------------------------
GRANT create session to pr;
--------------------------------------------------
GRANT create table to pr;
--------------------------------------------------
grant create view to pr;
--------------------------------------------------