DROP VIEW PP_Product_BOM_Header_v;
CREATE OR REPLACE VIEW PP_Product_BOM_Header_v
AS 
SELECT b.AD_Client_ID, b.AD_Org_ID, b.IsActive, b.Created, b.CreatedBy, b.Updated, b.UpdatedBy,
	cast('en_US' as varchar) AS AD_Language,
	b.DocumentNo,b.name,b.help,
	oi.C_Location_ID AS Org_Location_ID, oi.TaxID, 
 	b.Description,processing, validfrom, validto, bomtype, bomuse, m_changenotice_id,
	b.M_Product_ID,b.M_AttributeSetInstance_ID,b.C_UOM_ID,b.PP_Product_BOM_ID
FROM PP_Product_BOM b
	INNER JOIN AD_OrgInfo oi ON (oi.AD_Org_ID=b.AD_Org_ID);