
COMMENT ON COLUMN PEOPLE.citenzenship
IS 'Reference to country of citizenship';


COMMENT ON COLUMN PEOPLE.birthdate
IS 'Birthdate';


COMMENT ON COLUMN PEOPLE.age
IS 'Age of the person';


COMMENT ON COLUMN PEOPLE.surname
IS 'Surname of the person';

COMMENT ON COLUMN PEOPLE.secondsurname
IS 'Second surname of the person';

COMMENT ON COLUMN PEOPLE.createdBy
is 'The user who created the tuple';

COMMENT ON COLUMN PEOPLE.creationDate
is 'The date when the tuple was created';

COMMENT ON COLUMN PEOPLE.modifiedBy
is 'The user who modified the tuple';

COMMENT ON COLUMN PEOPLE.modificationDate
is 'The date when the tuple was modified';





COMMENT ON COLUMN PHONE.PHONENUMBER
IS 'PHONE NUMBER';


COMMENT ON COLUMN PHONE.IDUSER
IS 'Reference to id of user';


COMMENT ON COLUMN PHONE.IDCOUNTRY
IS 'Reference to id of the country';

COMMENT ON COLUMN PHONE.IDTYPE
IS 'Reference to type of phone';


COMMENT ON COLUMN PHONE.createdBy
is 'The user who created the tuple';

COMMENT ON COLUMN PHONE.creationDate
is 'The date when the tuple was created';

COMMENT ON COLUMN PHONE.modifiedBy
is 'The user who modified the tuple';

COMMENT ON COLUMN PHONE.modificationDate
is 'The date when the tuple was modified';




COMMENT ON COLUMN PHONETYPE.IDPHONETYPE
IS 'Identifier of phone type';


COMMENT ON COLUMN PHONETYPE.NAMETYPE
IS 'Name of the phonetype';



COMMENT ON COLUMN PHONETYPE.createdBy
is 'The user who created the tuple';

COMMENT ON COLUMN PHONETYPE.creationDate
is 'The date when the tuple was created';

COMMENT ON COLUMN PHONETYPE.modifiedBy
is 'The user who modified the tuple';

COMMENT ON COLUMN PHONETYPE.modificationDate
is 'The date when the tuple was modified';