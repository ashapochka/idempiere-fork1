-- Apr 24, 2013 3:12:21 PM COT
-- UUID Generator
UPDATE AD_Role_OrgAccess SET AD_Role_OrgAccess_UU='fcc1cd49-542c-4647-8572-966a7d05a4dd',Updated=TO_TIMESTAMP('2013-04-24 15:12:21','YYYY-MM-DD HH24:MI:SS'),UpdatedBy=100 WHERE AD_Role_ID=50004 AND AD_Org_ID=0
;

-- Apr 24, 2013 3:12:21 PM COT
UPDATE AD_Role_OrgAccess SET AD_Role_OrgAccess_UU='4f0274ce-7551-48d0-ab52-98a5aed37787',Updated=TO_TIMESTAMP('2013-04-24 15:12:21','YYYY-MM-DD HH24:MI:SS'),UpdatedBy=100 WHERE AD_Role_ID=50004 AND AD_Org_ID=11
;

-- Apr 24, 2013 3:12:21 PM COT
UPDATE AD_Role_OrgAccess SET AD_Role_OrgAccess_UU='26832dd7-5711-4e8f-a1c6-5b4a049f3726',Updated=TO_TIMESTAMP('2013-04-24 15:12:21','YYYY-MM-DD HH24:MI:SS'),UpdatedBy=100 WHERE AD_Role_ID=50004 AND AD_Org_ID=12
;

-- Apr 24, 2013 3:12:58 PM COT
UPDATE AD_Message SET AD_Message_UU='07252108-a99a-4746-873a-6dceed406b0c' WHERE AD_Message_ID=20001
;

SELECT register_migration_script('201304241518_UUIDGen.sql') FROM dual
;

