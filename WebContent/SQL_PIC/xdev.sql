drop database ssm_test;
create database ssm_test;

drop database ssm_test_export;
create database ssm_test_export;

use ssm_test;


insert into privileges(id, RenderedDelete, create_date, privilege_name, update_date) value(1, "true", now(), "Admin", now());
insert into id_gen value('PRIVILEGE_ID', 2);
select * from privileges;

INSERT INTO employees(id, password, username, privilege_id) VALUES ('1', sha1('1'), 'admin', 1);
insert into id_gen value('EMPLOYEE_ID', 2);
select * from employees;

select * from id_gen;

select privilege0_.id as id1_10_0_, privilege0_.create_date as create_d2_10_0_, privilege0_.privilege_name as privileg3_10_0_, privilege0_.renderedDelete as rendered4_10_0_, privilege0_.update_date as update_d5_10_0_, employees1_.privilege_id as privile23_1_1_, employees1_.id as id1_1_1_, employees1_.id as id1_1_2_, employees1_.address as address2_1_2_, employees1_.attachments as attachme3_1_2_, employees1_.business_phone as business4_1_2_, employees1_.city as city5_1_2_, employees1_.company as company6_1_2_, employees1_.country_region as country_7_1_2_, employees1_.create_date as create_d8_1_2_, employees1_.email_address as email_ad9_1_2_, employees1_.fax_number as fax_num10_1_2_, employees1_.first_name as first_n11_1_2_, employees1_.home_phone as home_ph12_1_2_, employees1_.job_title as job_tit13_1_2_, employees1_.last_name as last_na14_1_2_, employees1_.mobile_phone as mobile_15_1_2_, employees1_.notes as notes16_1_2_, employees1_.password as passwor17_1_2_, employees1_.privilege_id as privile23_1_2_, employees1_.state_province as state_p18_1_2_, employees1_.update_date as update_19_1_2_, employees1_.username as usernam20_1_2_, employees1_.web_page as web_pag21_1_2_, employees1_.zip_postal_code as zip_pos22_1_2_, orders2_.employee_id as employe17_7_3_, orders2_.id as id1_7_3_, orders2_.id as id1_7_4_, orders2_.customer_id as custome16_7_4_, orders2_.employee_id as employe17_7_4_, orders2_.notes as notes2_7_4_, orders2_.order_date as order_da3_7_4_, orders2_.status_id as status_18_7_4_, orders2_.tax_status_id as tax_sta19_7_4_, orders2_.paid_date as paid_dat4_7_4_, orders2_.payment_type as payment_5_7_4_, orders2_.ship_address as ship_add6_7_4_, orders2_.ship_city as ship_cit7_7_4_, orders2_.ship_country_region as ship_cou8_7_4_, orders2_.ship_name as ship_nam9_7_4_, orders2_.ship_state_province as ship_st10_7_4_, orders2_.ship_zip_postal_code as ship_zi11_7_4_, orders2_.shipped_date as shipped12_7_4_, orders2_.shipper_id as shipper20_7_4_, orders2_.shipping_fee as shippin13_7_4_, orders2_.tax_rate as tax_rat14_7_4_, orders2_.taxes as taxes15_7_4_, purchaseor3_.created_by as created14_14_5_, purchaseor3_.id as id1_14_5_, purchaseor3_.id as id1_14_6_, purchaseor3_.approved_by as approved2_14_6_, purchaseor3_.approved_date as approved3_14_6_, purchaseor3_.creation_date as creation4_14_6_, purchaseor3_.created_by as created14_14_6_, purchaseor3_.expected_date as expected5_14_6_, purchaseor3_.notes as notes6_14_6_, purchaseor3_.payment_amount as payment_7_14_6_, purchaseor3_.payment_date as payment_8_14_6_, purchaseor3_.payment_method as payment_9_14_6_, purchaseor3_.status_id as status_15_14_6_, purchaseor3_.shipping_fee as shippin10_14_6_, purchaseor3_.submitted_by as submitt11_14_6_, purchaseor3_.submitted_date as submitt12_14_6_, purchaseor3_.supplier_id as supplie16_14_6_, purchaseor3_.taxes as taxes13_14_6_ from privileges privilege0_ left outer join employees employees1_ on privilege0_.id=employees1_.privilege_id left outer join orders orders2_ on employees1_.id=orders2_.employee_id left outer join purchase_orders purchaseor3_ on employees1_.id=purchaseor3_.created_by where privilege0_.id=?;

select * from inventory_transaction_types;
select * from purchase_order_status;
select * from employees;
select * from orders;
select * from orders_status;
select * from customer;


