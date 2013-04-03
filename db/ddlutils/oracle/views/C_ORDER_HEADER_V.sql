DROP VIEW c_order_header_v;

CREATE OR REPLACE VIEW c_order_header_v
AS
  SELECT o.ad_client_id,
         o.ad_org_id,
         o.isactive,
         o.created,
         o.createdby,
         o.updated,
         o.updatedby,
         'en_US'                          AS ad_language,
         o.c_order_id,
         o.issotrx,
         o.documentno,
         o.docstatus,
         o.c_doctype_id,
         o.c_bpartner_id,
         bp.value                         AS bpvalue,
         bp.taxid                         AS bptaxid,
         bp.naics,
         bp.duns,
         oi.c_location_id                 AS org_location_id,
         oi.taxid,
         o.m_warehouse_id,
         wh.c_location_id                 AS warehouse_location_id,
         dt.printname                     AS documenttype,
         dt.documentnote                  AS documenttypenote,
         o.salesrep_id,
         COALESCE(ubp.name, u.name)       AS salesrep_name,
         o.dateordered,
         o.datepromised,
         bpg.greeting                     AS bpgreeting,
         bp.name,
         bp.name2,
         bpcg.greeting                    AS bpcontactgreeting,
         bpc.title,
         bpc.phone,
         NULLIF(bpc.name, bp.name)        AS contactname,
         bpl.c_location_id,
         l.postal
         || l.postal_add                  AS postal,
         bp.referenceno,
         o.bill_bpartner_id,
         o.bill_location_id,
         o.bill_user_id,
         bbp.value                        AS bill_bpvalue,
         bbp.taxid                        AS bill_bptaxid,
         bbp.name                         AS bill_name,
         bbp.name2                        AS bill_name2,
         bbpc.title                       AS bill_title,
         bbpc.phone                       AS bill_phone,
         NULLIF(bbpc.name, bbp.name)      AS bill_contactname,
         bbpl.c_location_id               AS bill_c_location_id,
         o.description,
         o.poreference,
         o.c_currency_id,
         pt.name                          AS paymentterm,
         pt.documentnote                  AS paymenttermnote,
         o.c_charge_id,
         o.chargeamt,
         o.totallines,
         o.grandtotal,
         o.grandtotal                     AS amtinwords,
         o.m_pricelist_id,
         o.istaxincluded,
         o.volume,
         o.weight,
         o.c_campaign_id,
         o.c_project_id,
         o.c_activity_id,
         o.m_shipper_id,
         o.deliveryrule,
         o.deliveryviarule,
         o.priorityrule,
         o.invoicerule,
         COALESCE(oi.logo_id, ci.logo_id) AS logo_id,
         o.ad_orgtrx_id,
         o.ad_user_id,
         o.amountrefunded,
         o.amounttendered,
         o.c_bpartner_location_id,
         o.c_cashline_id,
         o.c_cashplanline_id,
         o.c_conversiontype_id,
         o.c_doctypetarget_id,
         o.copyfrom,
         o.c_payment_id,
         o.c_paymentterm_id,
         o.c_pos_id,
         o.dateacct,
         o.dateprinted,
         o.docaction,
         o.dropship_bpartner_id,
         o.dropship_location_id,
         o.dropship_user_id,
         o.freightamt,
         o.freightcostrule,
         o.isapproved,
         o.iscreditapproved,
         o.isdelivered,
         o.isdiscountprinted,
         o.isdropship,
         o.isinvoiced,
         o.ispayschedulevalid,
         o.isprinted,
         o.isselected,
         o.isselfservice,
         o.istransferred,
         o.link_order_id,
         o.m_freightcategory_id,
         o.ordertype,
         o.pay_bpartner_id,
         o.pay_location_id,
         o.paymentrule,
         o.posted,
         o.processed,
         o.processedon,
         o.promotioncode,
         o.ref_order_id,
         o.sendemail,
         o.user1_id,
         o.user2_id,
         wh.ad_org_id                     AS m_warehouse_ad_org_id,
         wh.description                   AS m_warehouse_description,
         wh.isactive                      AS m_warehouse_isactive,
         wh.isdisallownegativeinv,
         wh.isintransit,
         wh.m_warehousesource_id,
         wh.name                          AS m_warehouse_name,
         wh.replenishmentclass,
         wh.separator,
         wh.value                         AS m_warehouse_value,
         pt.ad_org_id                     AS c_paymentterm_ad_org_id,
         pt.afterdelivery,
         pt.description                   AS c_paymentterm_description,
         pt.discount,
         pt.discount2,
         pt.discountdays,
         pt.discountdays2,
         pt.fixmonthcutoff,
         pt.fixmonthday,
         pt.fixmonthoffset,
         pt.gracedays,
         pt.isactive                      AS c_paymentterm_isactive,
         pt.isdefault,
         pt.isduefixed,
         pt.isnextbusinessday,
         pt.isvalid,
         pt.netday,
         pt.netdays,
         pt.paymenttermusage,
         pt.value                         AS m_paymentterm_value,
         bp.acqusitioncost                AS bp_acqusitioncost,
         bp.actuallifetimevalue           AS bp_actuallifetimevalue,
         bp.ad_language                   AS bp_ad_language,
         bp.ad_orgbp_id                   AS bp_ad_orgbp_id,
         bp.ad_org_id                     AS bp_ad_org_id,
         bp.bpartner_parent_id            AS bp_bpartner_parent_id,
         bp.c_bp_group_id                 AS bp_c_bp_group_id,
         bp.c_dunning_id                  AS bp_c_dunning_id,
         bp.c_greeting_id                 AS bp_c_greeting_id,
         bp.c_invoiceschedule_id          AS bp_c_invoiceschedule_id,
         bp.c_paymentterm_id              AS bp_c_paymentterm_id,
         bp.created                       AS bp_created,
         bp.createdby                     AS bp_createdby,
         bp.c_taxgroup_id                 AS bp_c_taxgroup_id,
         bp.deliveryrule                  AS bp_deliveryrule,
         bp.deliveryviarule               AS bp_deliveryviarule,
         bp.description                   AS bp_description,
         bp.dunninggrace                  AS bp_dunninggrace,
         bp.firstsale                     AS bp_firstsale,
         bp.flatdiscount                  AS bp_flatdiscount,
         bp.freightcostrule               AS bp_freightcostrule,
         bp.invoicerule                   AS bp_invoicerule,
         bp.isactive                      AS bp_isactive,
         bp.iscustomer                    AS bp_iscustomer,
         bp.isdiscountprinted             AS bp_isdiscountprinted,
         bp.isemployee                    AS bp_isemployee,
         bp.ismanufacturer                AS bp_ismanufacturer,
         bp.isonetime                     AS bp_isonetime,
         bp.ispotaxexempt                 AS bp_ispotaxexempt,
         bp.isprospect                    AS bp_isprospect,
         bp.issalesrep                    AS bp_issalesrep,
         bp.issummary                     AS bp_issummary,
         bp.istaxexempt                   AS bp_istaxexempt,
         bp.isvendor                      AS bp_isvendor,
         bp.logo_id                       AS bp_logo_id,
         bp.m_discountschema_id           AS bp_m_discountschema_id,
         bp.m_pricelist_id                AS bp_m_pricelist_id,
         bp.numberemployees               AS bp_numberemployees,
         bp.paymentrule                   AS bp_paymentrule,
         bp.paymentrulepo                 AS bp_paymentrulepo,
         bp.po_discountschema_id          AS bp_po_discountschema_id,
         bp.po_paymentterm_id             AS bp_po_paymentterm_id,
         bp.po_pricelist_id               AS bp_po_pricelist_id,
         bp.poreference                   AS bp_poreference,
         bp.potentiallifetimevalue        AS bp_potentiallifetimevalue,
         bp.rating                        AS bp_rating,
         bp.salesrep_id                   AS bp_salesrep_id,
         bp.salesvolume                   AS bp_salesvolume,
         bp.sendemail                     AS bp_sendemail,
         bp.shareofcustomer               AS bp_shareofcustomer,
         bp.shelflifeminpct               AS bp_shelflifeminpct,
         bp.so_creditlimit                AS bp_so_creditlimit,
         bp.socreditstatus                AS bp_socreditstatus,
         bp.so_creditused                 AS bp_so_creditused,
         bp.so_description                AS bp_so_description,
         bp.totalopenbalance              AS bp_totalopenbalance,
         bp.updated                       AS bp_updated,
         bp.updatedby                     AS bp_updatedby,
         bp.url                           AS bp_url,
         bpg.ad_org_id                    AS c_greeting_ad_org_id,
         bpg.isactive                     AS c_greeting_isactive,
         bpg.isfirstnameonly,
         bpg.name                         AS c_greeting_name,
         bpl.ad_org_id                    AS bp_location_ad_org_id,
         bpl.c_bpartner_id                AS bp_location_c_bpartner_id,
         bpl.created                      AS bp_location_created,
         bpl.createdby                    AS bp_location_createdby,
         bpl.c_salesregion_id             AS bp_location_c_salesregion_id,
         bpl.fax                          AS bp_location_fax,
         bpl.isactive                     AS bp_location_isactive,
         bpl.isbillto                     AS bp_location_isbillto,
         bpl.isdn                         AS bp_location_isdn,
         bpl.ispayfrom                    AS bp_location_ispayfrom,
         bpl.isremitto                    AS bp_location_isremitto,
         bpl.isshipto                     AS bp_location_isshipto,
         bpl.name                         AS bp_location_name,
         bpl.phone                        AS bp_location_phone,
         bpl.phone2                       AS bp_location_phone2,
         bpl.updated                      AS bp_location_updated,
         bpl.updatedby                    AS bp_location_updatedby,
         l.address1,
         l.address2,
         l.address3,
         l.address4,
         l.ad_org_id                      AS c_location_ad_org_id,
         l.c_city_id,
         l.c_country_id,
         l.city,
         l.created                        AS c_location_created,
         l.createdby                      AS c_location_createdby,
         l.c_region_id,
         l.isactive                       AS c_location_isactive,
         l.regionname,
         l.updated                        AS c_location_updated,
         l.updatedby                      AS c_location_updatedby,
         bpc.ad_org_id                    AS ad_user_ad_org_id,
         bpc.ad_orgtrx_id                 AS ad_user_ad_orgtrx_id,
         bpc.birthday                     AS ad_user_ad_birthday,
         bpc.c_bpartner_id                AS ad_user_c_bpartner_id,
         bpc.c_bpartner_location_id       AS ad_user_c_bpartner_location_id,
         bpc.c_greeting_id                AS ad_user_c_greeting_id,
         bpc.comments                     AS ad_user_comments,
         bpc.created                      AS ad_user_created,
         bpc.createdby                    AS ad_user_createdby,
         bpc.description                  AS ad_user_description,
         bpc.email                        AS ad_user_email,
         bpc.fax                          AS ad_user_fax,
         bpc.isactive                     AS ad_user_isactive,
         bpc.lastcontact                  AS ad_user_lastcontact,
         bpc.lastresult                   AS ad_user_lastresult,
         bpc.phone2                       AS ad_user_phone2,
         bpc.supervisor_id                AS ad_user_supervisor_id,
         bpc.updated                      AS ad_user_updated,
         bpc.updatedby                    AS ad_user_updatedby,
         bpc.value                        AS ad_user_value,
         bpcg.ad_org_id                   AS c_user_greeting_ad_org_id,
         bpcg.isactive                    AS c_user_greeting_isactive,
         bpcg.isfirstnameonly             AS c_user_greeting_isfnameonly,
         bpcg.name                        AS c_user_greeting_name,
         oi.ad_org_id                     AS ad_orginfo_ad_org_id,
         oi.ad_orgtype_id,
         oi.c_calendar_id,
         oi.created                       AS ad_orginfo_created,
         oi.createdby                     AS ad_orginfo_createdby,
         oi.dropship_warehouse_id,
         oi.duns                          AS ad_orginfo_duns,
         oi.email                         AS ad_orginfo_email,
         oi.fax                           AS ad_orginfo_fax,
         oi.isactive                      AS ad_orginfo_isactive,
         oi.m_warehouse_id                AS ad_orginfo_m_warehouse_id,
         oi.parent_org_id,
         oi.phone                         AS ad_orginfo_phone,
         oi.phone2                        AS ad_orginfo_phone2,
         oi.receiptfootermsg,
         oi.supervisor_id,
         oi.updated                       AS ad_orginfo_updated,
         oi.updatedby                     AS ad_orginfo_updatedby,
         u.ad_org_id                      AS salesrep_ad_org_id,
         u.ad_orgtrx_id                   AS salesrep_ad_orgtrx_id,
         u.birthday                       AS salesrep_ad_birthday,
         u.c_bpartner_id                  AS salesrep_c_bpartner_id,
         u.c_bpartner_location_id         AS salesrep_c_bp_location_id,
         u.c_greeting_id                  AS salesrep_c_greeting_id,
         u.comments                       AS salesrep_comments,
         u.created                        AS salesrep_created,
         u.createdby                      AS salesrep_createdby,
         u.description                    AS salesrep_description,
         u.email                          AS salesrep_email,
         u.fax                            AS salesrep_fax,
         u.isactive                       AS salesrep_isactive,
         u.lastcontact                    AS salesrep_lastcontact,
         u.lastresult                     AS salesrep_lastresult,
         u.phone                          AS salesrep_phone,
         u.phone2                         AS salesrep_phone2,
         u.supervisor_id                  AS salesrep_supervisor_id,
         u.title                          AS salesrep_title,
         u.updated                        AS salesrep_updated,
         u.updatedby                      AS salesrep_updatedby,
         u.value                          AS salesrep_value,
         ubp.acqusitioncost               AS salesrep_bp_acqusitioncost,
         ubp.actuallifetimevalue          AS salesrep_bp_actuallifetimeval,
         ubp.ad_language                  AS salesrep_bp_ad_language,
         ubp.ad_orgbp_id                  AS salesrep_bp_ad_orgbp_id,
         ubp.ad_org_id                    AS salesrep_bp_ad_org_id,
         ubp.bpartner_parent_id           AS salesrep_bp_bpartner_parent_id,
         ubp.c_bp_group_id                AS salesrep_bp_c_bp_group_id,
         ubp.c_dunning_id                 AS salesrep_bp_c_dunning_id,
         ubp.c_greeting_id                AS salesrep_bp_c_greeting_id,
         ubp.c_invoiceschedule_id         AS salesrep_bp_c_invoicesched_id,
         ubp.c_paymentterm_id             AS salesrep_bp_c_paymentterm_id,
         ubp.created                      AS salesrep_bp_created,
         ubp.createdby                    AS salesrep_bp_createdby,
         ubp.c_taxgroup_id                AS salesrep_bp_c_taxgroup_id,
         ubp.deliveryrule                 AS salesrep_bp_deliveryrule,
         ubp.deliveryviarule              AS salesrep_bp_deliveryviarule,
         ubp.description                  AS salesrep_bp_description,
         ubp.dunninggrace                 AS salesrep_bp_dunninggrace,
         ubp.duns                         AS salesrep_bp_duns,
         ubp.firstsale                    AS salesrep_bp_firstsale,
         ubp.flatdiscount                 AS salesrep_bp_flatdiscount,
         ubp.freightcostrule              AS salesrep_bp_freightcostrule,
         ubp.invoicerule                  AS salesrep_bp_invoicerule,
         ubp.isactive                     AS salesrep_bp_isactive,
         ubp.iscustomer                   AS salesrep_bp_iscustomer,
         ubp.isdiscountprinted            AS salesrep_bp_isdiscountprinted,
         ubp.isemployee                   AS salesrep_bp_isemployee,
         ubp.ismanufacturer               AS salesrep_bp_ismanufacturer,
         ubp.isonetime                    AS salesrep_bp_isonetime,
         ubp.ispotaxexempt                AS salesrep_bp_ispotaxexempt,
         ubp.isprospect                   AS salesrep_bp_isprospect,
         ubp.issalesrep                   AS salesrep_bp_issalesrep,
         ubp.issummary                    AS salesrep_bp_issummary,
         ubp.istaxexempt                  AS salesrep_bp_istaxexempt,
         ubp.isvendor                     AS salesrep_bp_isvendor,
         ubp.logo_id                      AS salesrep_bp_logo_id,
         ubp.m_discountschema_id          AS salesrep_bp_m_discountschm_id,
         ubp.m_pricelist_id               AS salesrep_bp_m_pricelist_id,
         ubp.naics                        AS salesrep_bp_naics,
         ubp.name2                        AS salesrep_bp_name2,
         ubp.numberemployees              AS salesrep_bp_numberemployees,
         ubp.paymentrule                  AS salesrep_bp_paymentrule,
         ubp.paymentrulepo                AS salesrep_bp_paymentrulepo,
         ubp.po_discountschema_id         AS salesrep_bp_po_discountschm_id,
         ubp.po_paymentterm_id            AS salesrep_bp_po_paymentterm_id,
         ubp.po_pricelist_id              AS salesrep_bp_po_pricelist_id,
         ubp.poreference                  AS salesrep_bp_poreference,
         ubp.potentiallifetimevalue       AS salesrep_bp_potentiallifetime,
         ubp.rating                       AS salesrep_bp_rating,
         ubp.referenceno                  AS salesrep_bp_referenceno,
         ubp.salesrep_id                  AS salesrep_bp_salesrep_id,
         ubp.salesvolume                  AS salesrep_bp_salesvolume,
         ubp.sendemail                    AS salesrep_bp_sendemail,
         ubp.shareofcustomer              AS salesrep_bp_shareofcustomer,
         ubp.shelflifeminpct              AS salesrep_bp_shelflifeminpct,
         ubp.so_creditlimit               AS salesrep_bp_so_creditlimit,
         ubp.socreditstatus               AS salesrep_bp_socreditstatus,
         ubp.so_creditused                AS salesrep_bp_so_creditused,
         ubp.so_description               AS salesrep_bp_so_description,
         ubp.taxid                        AS salesrep_bp_taxid,
         ubp.totalopenbalance             AS salesrep_bp_totalopenbalance,
         ubp.updated                      AS salesrep_bp_updated,
         ubp.updatedby                    AS salesrep_bp_updatedby,
         ubp.url                          AS salesrep_bp_url,
         ubp.value                        AS salesrep_bp_value,
         bbp.acqusitioncost               AS bill_bp_acqusitioncost,
         bbp.actuallifetimevalue          AS bill_bp_actuallifetimevalue,
         bbp.ad_language                  AS bill_bp_ad_language,
         bbp.ad_orgbp_id                  AS bill_bp_ad_orgbp_id,
         bbp.ad_org_id                    AS bill_bp_ad_org_id,
         bbp.bpartner_parent_id           AS bill_bp_bpartner_parent_id,
         bbp.c_bp_group_id                AS bill_bp_c_bp_group_id,
         bbp.c_dunning_id                 AS bill_bp_c_dunning_id,
         bbp.c_greeting_id                AS bill_bp_c_greeting_id,
         bbp.c_invoiceschedule_id         AS bill_bp_c_invoiceschedule_id,
         bbp.c_paymentterm_id             AS bill_bp_c_paymentterm_id,
         bbp.created                      AS bill_bp_created,
         bbp.createdby                    AS bill_bp_createdby,
         bbp.c_taxgroup_id                AS bill_bp_c_taxgroup_id,
         bbp.deliveryrule                 AS bill_bp_deliveryrule,
         bbp.deliveryviarule              AS bill_bp_deliveryviarule,
         bbp.description                  AS bill_bp_description,
         bbp.dunninggrace                 AS bill_bp_dunninggrace,
         bbp.duns                         AS bill_bp_duns,
         bbp.firstsale                    AS bill_bp_firstsale,
         bbp.flatdiscount                 AS bill_bp_flatdiscount,
         bbp.freightcostrule              AS bill_bp_freightcostrule,
         bbp.invoicerule                  AS bill_bp_invoicerule,
         bbp.isactive                     AS bill_bp_isactive,
         bbp.iscustomer                   AS bill_bp_iscustomer,
         bbp.isdiscountprinted            AS bill_bp_isdiscountprinted,
         bbp.isemployee                   AS bill_bp_isemployee,
         bbp.ismanufacturer               AS bill_bp_ismanufacturer,
         bbp.isonetime                    AS bill_bp_isonetime,
         bbp.ispotaxexempt                AS bill_bp_ispotaxexempt,
         bbp.isprospect                   AS bill_bp_isprospect,
         bbp.issalesrep                   AS bill_bp_issalesrep,
         bbp.issummary                    AS bill_bp_issummary,
         bbp.istaxexempt                  AS bill_bp_istaxexempt,
         bbp.isvendor                     AS bill_bp_isvendor,
         bbp.logo_id                      AS bill_bp_logo_id,
         bbp.m_discountschema_id          AS bill_bp_m_discountschema_id,
         bbp.m_pricelist_id               AS bill_bp_m_pricelist_id,
         bbp.naics                        AS bill_bp_naics,
         bbp.numberemployees              AS bill_bp_numberemployees,
         bbp.paymentrule                  AS bill_bp_paymentrule,
         bbp.paymentrulepo                AS bill_bp_paymentrulepo,
         bbp.po_discountschema_id         AS bill_bp_po_discountschema_id,
         bbp.po_paymentterm_id            AS bill_bp_po_paymentterm_id,
         bbp.po_pricelist_id              AS bill_bp_po_pricelist_id,
         bbp.poreference                  AS bill_bp_poreference,
         bbp.potentiallifetimevalue       AS bill_bp_potentiallifetimevalue,
         bbp.rating                       AS bill_bp_rating,
         bbp.referenceno                  AS bill_bp_referenceno,
         bbp.salesrep_id                  AS bill_bp_salesrep_id,
         bbp.salesvolume                  AS bill_bp_salesvolume,
         bbp.sendemail                    AS bill_bp_sendemail,
         bbp.shareofcustomer              AS bill_bp_shareofcustomer,
         bbp.shelflifeminpct              AS bill_bp_shelflifeminpct,
         bbp.so_creditlimit               AS bill_bp_so_creditlimit,
         bbp.socreditstatus               AS bill_bp_socreditstatus,
         bbp.so_creditused                AS bill_bp_so_creditused,
         bbp.so_description               AS bill_bp_so_description,
         bbp.totalopenbalance             AS bill_bp_totalopenbalance,
         bbp.updated                      AS bill_bp_updated,
         bbp.updatedby                    AS bill_bp_updatedby,
         bbp.url                          AS bill_bp_url,
         bbpl.ad_org_id                   AS bill_bp_location_ad_org_id,
         bbpl.c_bpartner_id               AS bill_bp_location_c_bpartner_id,
         bbpl.created                     AS bill_bp_location_created,
         bbpl.createdby                   AS bill_bp_location_createdby,
         bbpl.c_salesregion_id            AS bill_bp_location_c_salesreg_id,
         bbpl.fax                         AS bill_bp_location_fax,
         bbpl.isactive                    AS bill_bp_location_isactive,
         bbpl.isbillto                    AS bill_bp_location_isbillto,
         bbpl.isdn                        AS bill_bp_location_isdn,
         bbpl.ispayfrom                   AS bill_bp_location_ispayfrom,
         bbpl.isremitto                   AS bill_bp_location_isremitto,
         bbpl.isshipto                    AS bill_bp_location_isshipto,
         bbpl.name                        AS bill_bp_location_name,
         bbpl.phone                       AS bill_bp_location_phone,
         bbpl.phone2                      AS bill_bp_location_phone2,
         bbpl.updated                     AS bill_bp_location_updated,
         bbpl.updatedby                   AS bill_bp_location_updatedby,
         bbpc.ad_org_id                   AS bill_user_ad_org_id,
         bbpc.ad_orgtrx_id                AS bill_user_ad_orgtrx_id,
         bbpc.birthday                    AS bill_user_ad_birthday,
         bbpc.c_bpartner_id               AS bill_user_c_bpartner_id,
         bbpc.c_bpartner_location_id      AS bill_user_c_bp_location_id,
         bbpc.c_greeting_id               AS bill_user_c_greeting_id,
         bbpc.comments                    AS bill_user_comments,
         bbpc.created                     AS bill_user_created,
         bbpc.createdby                   AS bill_user_createdby,
         bbpc.description                 AS bill_user_description,
         bbpc.email                       AS bill_user_email,
         bbpc.fax                         AS bill_user_fax,
         bbpc.isactive                    AS bill_user_isactive,
         bbpc.lastcontact                 AS bill_user_lastcontact,
         bbpc.lastresult                  AS bill_user_lastresult,
         bbpc.phone2                      AS bill_user_phone2,
         bbpc.supervisor_id               AS bill_user_supervisor_id,
         bbpc.updated                     AS bill_user_updated,
         bbpc.updatedby                   AS bill_user_updatedby,
         bbpc.value                       AS bill_user_value
  FROM   c_order o
         JOIN c_doctype dt
           ON o.c_doctype_id = dt.c_doctype_id
         JOIN m_warehouse wh
           ON o.m_warehouse_id = wh.m_warehouse_id
         JOIN c_paymentterm pt
           ON o.c_paymentterm_id = pt.c_paymentterm_id
         JOIN c_bpartner bp
           ON o.c_bpartner_id = bp.c_bpartner_id
         LEFT JOIN c_greeting bpg
                ON bp.c_greeting_id = bpg.c_greeting_id
         JOIN c_bpartner_location bpl
           ON o.c_bpartner_location_id = bpl.c_bpartner_location_id
         JOIN c_location l
           ON bpl.c_location_id = l.c_location_id
         LEFT JOIN ad_user bpc
                ON o.ad_user_id = bpc.ad_user_id
         LEFT JOIN c_greeting bpcg
                ON bpc.c_greeting_id = bpcg.c_greeting_id
         JOIN ad_orginfo oi
           ON o.ad_org_id = oi.ad_org_id
         JOIN ad_clientinfo ci
           ON o.ad_client_id = ci.ad_client_id
         LEFT JOIN ad_user u
                ON o.salesrep_id = u.ad_user_id
         LEFT JOIN c_bpartner ubp
                ON u.c_bpartner_id = ubp.c_bpartner_id
         JOIN c_bpartner bbp
           ON o.bill_bpartner_id = bbp.c_bpartner_id
         JOIN c_bpartner_location bbpl
           ON o.bill_location_id = bbpl.c_bpartner_location_id
         LEFT JOIN ad_user bbpc
                ON o.bill_user_id = bbpc.ad_user_id 
;

