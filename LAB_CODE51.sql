-- 5.1.1
DELETE FROM reservation WHERE LB_ID='3006';
DELETE FROM operation WHERE LB_ID='3006';
DELETE FROM LABBOY WHERE LB_EXP_YR < 2;
-- 5.1.2
DELETE FROM reservation WHERE USE_DATE = '2003/04/13';
-- 5.1.3
UPDATE installation SET DATE_INS='2004/12/20' WHERE RM_ID='I304' AND SW_ID='D005';
-- 5.1.4
INSERT INTO LABBOY (LB_ID,LB_NAME,LB_TYPE,LB_PHONE,LB_EXP_YR)VALUES ('3006','�Ѵ�� ����ѡ','3','0-5503-4932',1);
UPDATE LABBOY SET LB_NAME='�Ѵ�� �آ����' WHERE LB_NAME='�Ѵ�� ����ѡ';
-- 5.1.5
UPDATE USERS SET U_TYPE='S' WHERE U_NAME='��ª� �觡Ҩ';