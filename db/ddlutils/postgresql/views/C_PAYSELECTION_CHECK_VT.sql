﻿DROP VIEW c_payselection_check_vt;

CREATE OR REPLACE VIEW c_payselection_check_vt AS 
SELECT psc.ad_client_id,
    psc.ad_org_id,
    l.ad_language,
    psc.c_payselection_id,
    psc.c_payselectioncheck_id,
    oi.c_location_id                        AS org_location_id,
    oi.taxid,
    p.c_doctype_id,
    bp.c_bpartner_id,
    bp.value                                AS bpvalue,
    bp.taxid                                AS bptaxid,
    bp.naics,
    bp.duns,
    bpgt.greeting                           AS bpgreeting,
    bp.name,
    bp.name2,
    bpartnerremitlocation(bp.c_bpartner_id) AS c_location_id,
    bp.referenceno,
    bp.poreference,
    ps.paydate,
    psc.payamt,
    psc.payamt                              AS amtinwords,
    psc.qty,
    psc.paymentrule,
    psc.documentno,
    COALESCE(oi.logo_id, ci.logo_id)        AS logo_id,
    dt.printname                            AS documenttype,
    dt.documentnote                         AS documenttypenote,
    p.description,
    ba.description                          AS bankaccountdescription,
    psc.c_bp_bankaccount_id,
    psc.c_payment_id,
    psc.created                             AS c_payselectioncheck_created,
    psc.createdby                           AS c_payselectioncheck_createdby,
    psc.discountamt                         AS c_payselectioncheck_discamt,
    psc.isactive                            AS c_payselectioncheck_isactive,
    psc.isgenerateddraft,
    psc.isprinted,
    psc.isreceipt,
    psc.processed,
    psc.updated                             AS c_payselectioncheck_updated,
    psc.updatedby                           AS c_payselectioncheck_updatedby,
    ps.ad_org_id                            AS c_payselection_ad_org_id,
    ps.c_bankaccount_id                     AS c_paysel_c_bankaccount_id,
    ps.created                              AS c_payselection_created,
    ps.createdby                            AS c_payselection_createdby,
    ps.description                          AS c_payselection_description,
    ps.isactive                             AS c_payselection_isactive,
    ps.isapproved                           AS c_payselection_isapproved,
    ps.name                                 AS c_payselection_name,
    ps.processed                            AS c_payselection_processed,
    ps.totalamt,
    ps.updated                              AS c_payselection_updated,
    ps.updatedby                            AS c_payselection_updatedby,
    p.a_city,
    p.a_country,
    p.ad_org_id                             AS c_payment_ad_org_id,
    p.a_email,
    p.a_ident_dl,
    p.a_name,
    p.a_state,
    p.a_street,
    p.a_zip,
    p.c_activity_id,
    p.c_bpartner_id                         AS c_payment_c_bpartner_id,
    p.c_campaign_id,
    p.c_charge_id                           AS c_payment_c_charge_id,
    p.c_conversiontype_id,
    p.c_currency_id,
    p.chargeamt                             AS c_payment_chargeamt,
    p.checkno,
    p.c_invoice_id                          AS c_payment_c_invoice_id,
    p.c_order_id                            AS c_payment_c_order_id,
    p.c_paymentbatch_id,
    p.c_project_id,
    p.created                               AS c_payment_created,
    p.createdby                             AS c_payment_createdby,
    p.dateacct,
    p.datetrx,
    p.discountamt                           AS c_payment_discountamt,
    p.docstatus,
    p.documentno                            AS c_payment_documentno,
    p.isactive                              AS c_payment_isactive,
    p.isallocated,
    p.isapproved,
    p.isdelayedcapture,
    p.isonline,
    p.isoverunderpayment,
    p.isprepayment,
    p.isreconciled,
    p.isselfservice                         AS c_payment_isselfservice,
    p.micr,
    p.orig_trxid,
    p.overunderamt,
    p.payamt                                AS c_payment_payamt,
    p.ponum,
    p.posted                                AS c_payment_posted,
    p.processed                             AS c_payment_processed,
    p.processedon                           AS c_payment_processedon,
    p.r_authcode,
    p.r_authcode_dc,
    p.r_avsaddr,
    p.r_avszip,
    p.r_cvv2match,
    p.ref_payment_id,
    p.reversal_id                           AS c_payment_reversal_id,
    p.r_info,
    p.routingno,
    p.r_pnref,
    p.r_pnref_dc,
    p.r_respmsg,
    p.r_result,
    p.swipe,
    p.taxamt,
    p.tendertype,
    p.trxtype,
    p.updated                               AS c_payment_updated,
    p.updatedby                             AS c_payment_updatedby,
    p.user1_id,
    p.user2_id,
    p.voiceauthcode,
    p.writeoffamt,
    bp.acqusitioncost                       AS c_bp_acqusitioncost,
    bp.actuallifetimevalue                  AS c_bp_actuallifetimevalue,
    bp.ad_language                          AS c_bp_ad_language,
    bp.ad_orgbp_id                          AS c_bp_ad_orgbp_id,
    bp.ad_org_id                            AS c_bp_ad_org_id,
    bp.bpartner_parent_id                   AS c_bp_bpartner_parent_id,
    bp.c_bp_group_id                        AS c_bp_c_bp_group_id,
    bp.c_dunning_id                         AS c_bp_c_dunning_id,
    bp.c_greeting_id                        AS c_bp_c_greeting_id,
    bp.c_invoiceschedule_id                 AS c_bp_c_invoiceschedule_id,
    bp.c_paymentterm_id                     AS c_bp_c_paymentterm_id,
    bp.created                              AS c_bp_created,
    bp.createdby                            AS c_bp_createdby,
    bp.c_taxgroup_id                        AS c_bp_c_taxgroup_id,
    bp.deliveryrule                         AS c_bp_deliveryrule,
    bp.deliveryviarule                      AS c_bp_deliveryviarule,
    bp.description                          AS c_bp_description,
    bp.dunninggrace                         AS c_bp_dunninggrace,
    bp.firstsale                            AS c_bp_firstsale,
    bp.flatdiscount                         AS c_bp_flatdiscount,
    bp.freightcostrule                      AS c_bp_freightcostrule,
    bp.invoicerule                          AS c_bp_invoicerule,
    bp.isactive                             AS c_bp_isactive,
    bp.iscustomer                           AS c_bp_iscustomer,
    bp.isdiscountprinted                    AS c_bp_isdiscountprinted,
    bp.isemployee                           AS c_bp_isemployee,
    bp.ismanufacturer                       AS c_bp_ismanufacturer,
    bp.isonetime                            AS c_bp_isonetime,
    bp.ispotaxexempt                        AS c_bp_ispotaxexempt,
    bp.isprospect                           AS c_bp_isprospect,
    bp.issalesrep                           AS c_bp_issalesrep,
    bp.issummary                            AS c_bp_issummary,
    bp.istaxexempt                          AS c_bp_istaxexempt,
    bp.isvendor                             AS c_bp_isvendor,
    bp.logo_id                              AS c_bp_logo_id,
    bp.m_discountschema_id                  AS c_bp_m_discountschema_id,
    bp.m_pricelist_id                       AS c_bp_m_pricelist_id,
    bp.numberemployees                      AS c_bp_numberemployees,
    bp.paymentrule                          AS c_bp_paymentrule,
    bp.paymentrulepo                        AS c_bp_paymentrulepo,
    bp.po_discountschema_id                 AS c_bp_po_discountschema_id,
    bp.po_paymentterm_id                    AS c_bp_po_paymentterm_id,
    bp.po_pricelist_id                      AS c_bp_po_pricelist_id,
    bp.potentiallifetimevalue               AS c_bp_potentiallifetimevalue,
    bp.rating                               AS c_bp_rating,
    bp.salesrep_id                          AS c_bp_salesrep_id,
    bp.salesvolume                          AS c_bp_salesvolume,
    bp.sendemail                            AS c_bp_sendemail,
    bp.shareofcustomer                      AS c_bp_shareofcustomer,
    bp.shelflifeminpct                      AS c_bp_shelflifeminpct,
    bp.so_creditlimit                       AS c_bp_so_creditlimit,
    bp.socreditstatus                       AS c_bp_socreditstatus,
    bp.so_creditused                        AS c_bp_so_creditused,
    bp.so_description                       AS c_bp_so_description,
    bp.totalopenbalance                     AS c_bp_totalopenbalance,
    bp.updated                              AS c_bp_updated,
    bp.updatedby                            AS c_bp_updatedby,
    bp.url                                  AS c_bp_url,
    bpgt.ad_org_id                          AS c_greeting_ad_org_id,
    bpgt.isactive                           AS c_greeting_isactive,
    bpg.isfirstnameonly,
    bpgt.name                               AS c_greeting_name,
    oi.ad_org_id                            AS ad_orginfo_ad_org_id,
    oi.ad_orgtype_id,
    oi.c_calendar_id,
    oi.created                              AS ad_orginfo_created,
    oi.createdby                            AS ad_orginfo_createdby,
    oi.dropship_warehouse_id,
    oi.duns                                 AS ad_orginfo_duns,
    oi.email                                AS ad_orginfo_email,
    oi.fax                                  AS ad_orginfo_fax,
    oi.isactive                             AS ad_orginfo_isactive,
    oi.m_warehouse_id,
    oi.parent_org_id,
    oi.phone                                AS ad_orginfo_phone,
    oi.phone2                               AS ad_orginfo_phone2,
    oi.receiptfootermsg,
    oi.supervisor_id,
    oi.updated                              AS ad_orginfo_updated,
    oi.updatedby                            AS ad_orginfo_updatedby 
FROM c_payselectioncheck psc 
        JOIN c_payselection ps 
        ON psc.c_payselection_id = ps.c_payselection_id 
        LEFT JOIN c_payment p 
        ON psc.c_payment_id = p.c_payment_id 
        LEFT JOIN c_bankaccount ba 
        ON p.c_bankaccount_id = ba.c_bankaccount_id 
        LEFT JOIN c_doctype_trl dt 
        ON p.c_doctype_id = dt.c_doctype_id 
        JOIN c_bpartner bp 
        ON psc.c_bpartner_id = bp.c_bpartner_id 
        JOIN ad_orginfo oi 
        ON psc.ad_org_id = oi.ad_org_id 
        JOIN ad_clientinfo ci 
        ON psc.ad_client_id = ci.ad_client_id 
        LEFT JOIN ad_language l 
        ON l.issystemlanguage = 'Y' 
        LEFT JOIN c_greeting bpg 
        ON bp.c_greeting_id = bpg.c_greeting_id 
        LEFT JOIN c_greeting_trl bpgt 
        ON bp.c_greeting_id = bpgt.c_greeting_id AND bpgt.ad_language = l.ad_language
;
