UPDATE M_CostDetail SET M_MatchInv_ID=NULL WHERE M_MatchInv_ID IS NOT NULL AND NOT EXISTS (SELECT a.M_MatchInv_ID FROM M_MatchInv a WHERE a.M_MatchInv_ID=M_CostDetail.M_MatchInv_ID)
;

ALTER TABLE M_CostDetail ADD CONSTRAINT MCostDetail_MatchInv FOREIGN KEY(M_MatchInv_ID) REFERENCES M_MatchInv(M_MatchInv_ID) ON DELETE RESTRICT DEFERRABLE INITIALLY DEFERRED
;

SELECT register_migration_script('201309250432_IDEMPIERE-1188.sql') FROM dual
;
