CREATE TABLE REVIEW (
idReview number(8),
descriptionR varchar2(100)CONSTRAINT REVIEW_description_nn NOT NULL,
rating number(1),
createdBy VARCHAR2(20),
creationDate DATE,
modifiedBy VARCHAR2(20),
modificationDate DATE
);

ALTER TABLE REVIEW
ADD CONSTRAINT pk_REVIEW PRIMARY KEY (idReview)
USING INDEX
TABLESPACE pr_ind PCTFREE 20
STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);

COMMENT ON TABLE REVIEW
is 'It is a table with the review of a sale';
COMMENT ON COLUMN REVIEW.idReview
is 'Unique identifier of the review';
COMMENT ON COLUMN REVIEW.descriptionR
is 'Detail of the review';
COMMENT ON COLUMN REVIEW.rating
is 'Rating of the sale';
COMMENT ON COLUMN REVIEW.createdBy
is 'The user who created the tuple';
COMMENT ON COLUMN REVIEW.creationDate
is 'The date when the tuple was created';
COMMENT ON COLUMN REVIEW.modifiedBy
is 'The user who modified the tuple';
COMMENT ON COLUMN REVIEW.modificationDate
is 'The date when the tuple was modified';
