drop database ssm_test;
create database ssm_test;

drop database ssm_test_export;
create database ssm_test_export;

insert into privileges(id, RenderedDelete, create_date, privilege_name, update_date) value(1, "true", now(), "Admin", now());
insert into id_gen value('PRIVILEGE_ID', 2);
select * from privileges;

INSERT INTO employees(id, password, username, renderedDelete, privilege_id) VALUES ('1', sha1('1'), 'admin', 'true', 1);
insert into id_gen value('EMPLOYEE_ID', 2);
select * from employees;

select * from id_gen;

select * from inventory_transaction_types;
select * from purchase_order_status;
select * from employees;
select * from orders;
select * from orders_status;
select * from customer;
select * from plant;
select * from project;
select * from suppliers;


