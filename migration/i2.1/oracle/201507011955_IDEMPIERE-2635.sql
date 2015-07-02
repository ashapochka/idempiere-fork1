SET SQLBLANKLINES ON
SET DEFINE OFF

-- IDEMPIERE-2635
-- Jul 1, 2015 7:54:49 PM COT
UPDATE AD_Column SET FieldLength=255, IsToolbarButton='N',Updated=TO_DATE('2015-07-01 19:54:49','YYYY-MM-DD HH24:MI:SS'),UpdatedBy=100 WHERE AD_Column_ID=56745
;

-- Jul 1, 2015 7:54:52 PM COT
ALTER TABLE WS_WebService_Para MODIFY ConstantValue VARCHAR2(255) DEFAULT NULL 
;

SELECT register_migration_script('201507011955_IDEMPIERE-2635.sql') FROM dual
;

