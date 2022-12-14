
DROP TABLE IF EXISTS COURSES CASCADE;
CREATE TABLE IF NOT EXISTS COURSES
(
    ID         SERIAL PRIMARY KEY,
    TITLE      VARCHAR(20) NOT NULL,
    DATE_START DATE,
    DATE_END   DATE,
    IS_ACTIVE  BOOLEAN
);
DROP TABLE IF EXISTS STUDENTS CASCADE;
CREATE TABLE IF NOT EXISTS STUDENTS
(
    ID           SERIAL PRIMARY KEY,
    FIRST_NAME   VARCHAR(20) NOT NULL,
    PATRONYMIC   VARCHAR(20),
    LAST_NAME    VARCHAR(20) NOT NULL,
    GROUP_NUMBER NUMERIC,
    IS_ACTIVE    BOOLEAN
);
DROP TABLE IF EXISTS COURSES_STUDENTS CASCADE;
CREATE TABLE IF NOT EXISTS COURSES_STUDENTS
(
    ID         SERIAL,
    COURSE_ID  BIGINT NOT NULL,
    STUDENT_ID BIGINT NOT NULL,
    CONSTRAINT COURSES_STUDENTS_PK PRIMARY KEY (ID),
    CONSTRAINT COURSE_FK FOREIGN KEY (COURSE_ID) REFERENCES COURSES (ID),
    CONSTRAINT STUDENT_FK FOREIGN KEY (STUDENT_ID) REFERENCES STUDENTS (ID)
);