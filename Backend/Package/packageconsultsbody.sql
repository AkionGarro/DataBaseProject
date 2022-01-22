create or replace PACKAGE BODY  "PACKAGECONSULTS"  AS

function fngetUserInfo(p_name in varchar2) return sys_refCursor is
cCursor sys_refCursor;
begin open cCursor for select username,usertype,passworda,idappuser  from APPUSER where(APPUSER.username = p_name);
    return cCursor;
end fngetUserInfo;




function fngetClocksWithFilters(p_condition in varchar2,p_type in varchar2,p_brand in varchar2,p_model IN varchar2, p_price in number) 
return sys_refcursor is
cCursor sys_refcursor;
v_idStatusSale number(3);
v_pcondition number(2);
v_ptype number(3);
v_pbrand number(10);
v_pmodel number(10);
begin
v_idStatusSale:= packagegetid.getidbuystatus('For Sale');
--v_pcondition:=packagegetid.getidcondition(p_condition);
--v_ptype:=packagegetid.getidTypeClock(p_type);
--v_pbrand:=packagegetid.getidBrand(p_brand);
--v_pmodel:=packagegetid.getidModel(p_model,v_pbrand);
open ccursor for select buysale.idbuysale, buysale.datepost, 
                              appuser.username,
                              typeclock.nameType, 
                              brand.nameBrand, 
                              modelp.nameModel,
                              condition.nameCondition,
                              clock.manufacturedate,
                              clock.descriptionclock,
                              clock.price
                              from buysale
                              inner join appuser on appuser.idappuser=buysale.iduserseller
                              inner join clock on buysale.idClock=clock.idClock
                              inner join condition on clock.idcondition =condition.idcondition                         
                              inner join modelp on clock.idmodel =  modelp.idmodel
                              inner join brand  on  modelp.idbrand = brand.idbrand 
                              inner join typeclock on modelp.idtypeclock = typeclock.idtype 

                              where 
                              
                              buysale.idbuystatus=v_idStatusSale and 
                              clock.price<=p_price and
                              condition.namecondition LIKE '%'||p_condition||'%' and
                              modelp.namemodel LIKE '%'||p_model||'%' and 
                              brand.namebrand LIKE '%'||p_brand||'%' and
                              typeClock.nametype LIKE '%'||p_type||'%'
                             ;




return ccursor;

end fngetClocksWithFilters;

end PACKAGECONSULTS;