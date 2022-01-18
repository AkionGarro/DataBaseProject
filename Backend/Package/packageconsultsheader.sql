create or replace PACKAGE      "PACKAGECONSULTS" is

function fngetUserInfo(p_name in varchar2) return sys_RefCursor;


end PACKAGECONSULTS;
