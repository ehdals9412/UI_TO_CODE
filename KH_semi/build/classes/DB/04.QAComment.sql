DROP TABLE QACOMMENT;

DROP SEQUENCE QACOMMENTSQ;
DROP SEQUENCE QAGROUPNOSQ;

CREATE SEQUENCE QACOMMENTSQ;
CREATE SEQUENCE QAGROUPNOSQ;

CREATE TABLE QACOMMENT(
   QACOMMENT_ID NUMBER NOT NULL, --댓글번호
   QAGROUPNO NUMBER NOT NULL, --그룹번호
   QAGROUPSQ NUMBER NOT NULL, --시퀀스그룹번호
   QATITLETAB NUMBER NOT NULL, --답변
   MEMBER_ID NUMBER NOT NULL, -- 회원번호
    MEMBER_NAME VARCHAR2(30) NOT NULL,
   QA_ID NUMBER NOT NULL, --QA번호
   QACOMMENT_CONTENT VARCHAR2(2000) NOT NULL, --댓글내용
   QAREGDATE DATE NOT NULL, --댓글쓴날짜
   CONSTRAINT COMMENT_PK_ID PRIMARY KEY(QACOMMENT_ID),
   CONSTRAINT COMMENT_FK_MEMBER_ID FOREIGN KEY(MEMBER_ID) REFERENCES MEMBER(MEMBER_ID),
   CONSTRAINT COMMENT_FK_QA_ID FOREIGN KEY(QA_ID) REFERENCES QABOARD(QA_ID)
);

-- CASCADE 추가된 쿼리문(이걸로 추가해야함)
CREATE TABLE QACOMMENT(
   QACOMMENT_ID NUMBER NOT NULL, —댓글번호
   QAGROUPNO NUMBER NOT NULL, —그룹번호
   QAGROUPSQ NUMBER NOT NULL, —시퀀스그룹번호
   QATITLETAB NUMBER NOT NULL, —답변
   MEMBER_ID NUMBER NOT NULL, — 회원번호
    MEMBER_NAME VARCHAR2(30) NOT NULL,
   QA_ID NUMBER NOT NULL, —QA번호
   QACOMMENT_CONTENT VARCHAR2(2000) NOT NULL, —댓글내용
   QAREGDATE VARCHAR2(40) NOT NULL, —댓글쓴날짜
   CONSTRAINT COMMENT_PK_ID PRIMARY KEY(QACOMMENT_ID),
   CONSTRAINT COMMENT_FK_MEMBER_ID FOREIGN KEY(MEMBER_ID) REFERENCES MEMBER(MEMBER_ID) ON DELETE CASCADE,
   CONSTRAINT COMMENT_FK_QA_ID FOREIGN KEY(QA_ID) REFERENCES QABOARD(QA_ID) ON DELETE CASCADE
);