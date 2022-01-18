create or replace PACKAGE BODY  "PACKAGECONSULTS"  AS

function fngetUserInfo(p_name in varchar2) return sys_refCursor is
cCursor sys_refCursor;
begin open cCursor for select username,usertype,passworda,idappuser  from APPUSER where(APPUSER.username = p_name);
    return cCursor;
end fngetUserInfo;

end PACKAGECONSULTS;