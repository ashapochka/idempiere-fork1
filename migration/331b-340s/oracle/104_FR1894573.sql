-- FR [ 1894573 ] Alert Processor Improvements
insert into AD_SysConfig (AD_SYSCONFIG_ID,AD_CLIENT_ID,AD_ORG_ID,CREATED,UPDATED,CREATEDBY,UPDATEDBY,ISACTIVE,NAME,VALUE,DESCRIPTION,ENTITYTYPE,CONFIGURATIONLEVEL)
values (50014,0,0,to_date('15-02-2008','DD-MM-RRRR'),to_date('15-02-2008','DD-MM-RRRR'),0,0,'Y','ALERT_SEND_ATTACHMENT_AS_XLS','Y','Send alert results as Excel attachments','D','C');
