-- Jan 24, 2008 2:25:48 PM CST
-- 1877902 - Implement  JSR 223: Scripting 
DELETE FROM AD_REF_LIST_TRL WHERE AD_Ref_List_ID=53298
;

DELETE FROM AD_REF_LIST WHERE AD_Ref_List_ID=53298
;

UPDATE AD_REF_LIST SET VALUE='Q',Updated=TO_TIMESTAMP('2008-01-24 14:27:04','YYYY-MM-DD HH24:MI:SS'),UpdatedBy=0 WHERE AD_Ref_List_ID=53292
;

UPDATE AD_REF_LIST SET VALUE='S', NAME='JSR 223 Scripting APIs',Updated=TO_TIMESTAMP('2008-01-24 14:26:54','YYYY-MM-DD HH24:MI:SS'),UpdatedBy=0 WHERE AD_Ref_List_ID=53290
;

UPDATE AD_REF_LIST_TRL SET IsTranslated='N' WHERE AD_Ref_List_ID=53290
;

UPDATE AD_FIELD SET DisplayLogic='@RuleType@=Q',Updated=TO_TIMESTAMP('2008-01-24 14:28:14','YYYY-MM-DD HH24:MI:SS'),UpdatedBy=0 WHERE AD_Field_ID=54338
;