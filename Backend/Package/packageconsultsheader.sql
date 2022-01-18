create or replace PACKAGE      "PACKAGECONSULTS" is

function fngetUserInfo(p_name in varchar2) return sys_RefCursor;

function fngetClocksWithFilters(p_condition in varchar2,p_type in varchar2,p_brand in varchar2,p_model IN varchar2) return sys_refcursor;

end PACKAGECONSULTS;
