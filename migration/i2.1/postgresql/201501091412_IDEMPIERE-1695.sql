-- Jan 9, 2015 2:12:28 PM COT
-- IDEMPIERE-1298 2Pack: Support copying of data from one client to another
UPDATE AD_Process_Para SET AD_Val_Rule_ID=102,Updated=TO_TIMESTAMP('2015-01-09 14:12:28','YYYY-MM-DD HH24:MI:SS'),UpdatedBy=100 WHERE AD_Process_Para_ID=644
;

SELECT register_migration_script('201501091412_IDEMPIERE-1695.sql') FROM dual
;

