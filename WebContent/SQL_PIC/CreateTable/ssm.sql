create database ssm;
use ssm;

-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 17, 2020 at 11:27 AM
-- Server version: 10.4.7-MariaDB
-- PHP Version: 7.4.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `ssm_test`
--

-- --------------------------------------------------------

--
-- Table structure for table `company`
--

CREATE TABLE `company` (
  `id` bigint(20) NOT NULL,
  `address` varchar(500) DEFAULT NULL,
  `attachments` varchar(500) DEFAULT NULL,
  `business_phone` varchar(20) DEFAULT NULL,
  `city` varchar(100) DEFAULT NULL,
  `company` varchar(200) DEFAULT NULL,
  `country_region` varchar(255) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  `create_user` varchar(255) DEFAULT NULL,
  `email_address` varchar(255) DEFAULT NULL,
  `fax_number` varchar(255) DEFAULT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `home_phone` varchar(255) DEFAULT NULL,
  `job_title` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `mobile_phone` varchar(255) DEFAULT NULL,
  `notes` varchar(255) DEFAULT NULL,
  `state_province` varchar(255) DEFAULT NULL,
  `update_date` datetime DEFAULT NULL,
  `web_page` varchar(255) DEFAULT NULL,
  `zip_postal_code` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `id` bigint(20) NOT NULL,
  `address` varchar(500) DEFAULT NULL,
  `attachments` varchar(500) DEFAULT NULL,
  `business_phone` varchar(20) DEFAULT NULL,
  `city` varchar(100) DEFAULT NULL,
  `company` varchar(200) DEFAULT NULL,
  `country_region` varchar(255) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  `create_user` varchar(255) DEFAULT NULL,
  `email_address` varchar(255) DEFAULT NULL,
  `fax_number` varchar(255) DEFAULT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `home_phone` varchar(255) DEFAULT NULL,
  `job_title` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `mobile_phone` varchar(255) DEFAULT NULL,
  `notes` varchar(255) DEFAULT NULL,
  `state_province` varchar(255) DEFAULT NULL,
  `update_date` datetime DEFAULT NULL,
  `web_page` varchar(255) DEFAULT NULL,
  `zip_postal_code` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`id`, `address`, `attachments`, `business_phone`, `city`, `company`, `country_region`, `create_date`, `create_user`, `email_address`, `fax_number`, `first_name`, `home_phone`, `job_title`, `last_name`, `mobile_phone`, `notes`, `state_province`, `update_date`, `web_page`, `zip_postal_code`) VALUES
(1, 'exdev', NULL, '11', NULL, 'exdev', NULL, NULL, NULL, 'exdev', '11', 'exdev', '11', NULL, 'exdev', '11', 'exdev', NULL, '2020-03-17 17:23:46', 'exdev', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `employees`
--

CREATE TABLE `employees` (
  `id` bigint(20) NOT NULL,
  `address` varchar(255) DEFAULT NULL,
  `attachments` varchar(255) DEFAULT NULL,
  `business_phone` varchar(255) DEFAULT NULL,
  `city` varchar(255) DEFAULT NULL,
  `company` varchar(255) DEFAULT NULL,
  `country_region` varchar(255) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  `create_user` varchar(255) DEFAULT NULL,
  `email_address` varchar(255) DEFAULT NULL,
  `fax_number` varchar(255) DEFAULT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `home_phone` varchar(255) DEFAULT NULL,
  `job_title` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `mobile_phone` varchar(255) DEFAULT NULL,
  `notes` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `renderedDelete` varchar(255) DEFAULT NULL,
  `state_province` varchar(255) DEFAULT NULL,
  `update_date` datetime DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  `web_page` varchar(255) DEFAULT NULL,
  `zip_postal_code` varchar(255) DEFAULT NULL,
  `privilege_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `employees`
--

INSERT INTO `employees` (`id`, `address`, `attachments`, `business_phone`, `city`, `company`, `country_region`, `create_date`, `create_user`, `email_address`, `fax_number`, `first_name`, `home_phone`, `job_title`, `last_name`, `mobile_phone`, `notes`, `password`, `renderedDelete`, `state_province`, `update_date`, `username`, `web_page`, `zip_postal_code`, `privilege_id`) VALUES
(1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 'Admin', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '356a192b7913b04c54574d18c28d46e6395428ab', 'true', NULL, '2020-03-17 17:22:32', 'admin', NULL, NULL, 1);

-- --------------------------------------------------------

--
-- Table structure for table `id_gen`
--

CREATE TABLE `id_gen` (
  `GEN_KEY` varchar(255) NOT NULL,
  `GEN_VALUE` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `id_gen`
--

INSERT INTO `id_gen` (`GEN_KEY`, `GEN_VALUE`) VALUES
('CUSTOMER_ID', 2),
('EMPLOYEE_ID', 2),
('ORDERSSTATUS_ID', 6),
('ORDER_ID', 2),
('PRIVILEGE_ID', 2);

-- --------------------------------------------------------

--
-- Table structure for table `inventory_transactions`
--

CREATE TABLE `inventory_transactions` (
  `id` bigint(20) NOT NULL,
  `comments` varchar(255) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  `create_user` varchar(255) DEFAULT NULL,
  `quantity` int(11) NOT NULL,
  `transaction_created_date` datetime DEFAULT NULL,
  `transaction_modified_date` datetime DEFAULT NULL,
  `update_date` datetime DEFAULT NULL,
  `transaction_type` bigint(20) DEFAULT NULL,
  `customer_order_id` bigint(20) DEFAULT NULL,
  `product_id` bigint(20) DEFAULT NULL,
  `purchase_order_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `inventory_transaction_types`
--

CREATE TABLE `inventory_transaction_types` (
  `id` bigint(20) NOT NULL,
  `create_date` datetime DEFAULT NULL,
  `create_user` varchar(255) DEFAULT NULL,
  `type_name` varchar(255) DEFAULT NULL,
  `update_date` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `invoices`
--

CREATE TABLE `invoices` (
  `id` bigint(20) NOT NULL,
  `amount_due` decimal(19,2) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  `create_user` varchar(255) DEFAULT NULL,
  `due_date` datetime DEFAULT NULL,
  `invoice_date` datetime DEFAULT NULL,
  `shipping` decimal(19,2) DEFAULT NULL,
  `tax` decimal(19,2) DEFAULT NULL,
  `update_date` datetime DEFAULT NULL,
  `order_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `orders`
--

CREATE TABLE `orders` (
  `id` bigint(20) NOT NULL,
  `create_date` datetime DEFAULT NULL,
  `create_user` varchar(255) DEFAULT NULL,
  `current_status` bigint(20) DEFAULT NULL,
  `notes` varchar(255) DEFAULT NULL,
  `order_date` datetime DEFAULT NULL,
  `paid_date` datetime DEFAULT NULL,
  `payment_type` varchar(255) DEFAULT NULL,
  `qty` varchar(255) DEFAULT NULL,
  `recipe` varchar(255) DEFAULT NULL,
  `ship_address` varchar(255) DEFAULT NULL,
  `ship_city` varchar(255) DEFAULT NULL,
  `ship_country_region` varchar(255) DEFAULT NULL,
  `ship_name` varchar(255) DEFAULT NULL,
  `ship_state_province` varchar(255) DEFAULT NULL,
  `ship_zip_postal_code` varchar(255) DEFAULT NULL,
  `shipped_date` datetime DEFAULT NULL,
  `shipping_fee` decimal(19,2) DEFAULT NULL,
  `tax_rate` double DEFAULT NULL,
  `taxes` decimal(19,2) DEFAULT NULL,
  `update_date` datetime DEFAULT NULL,
  `customer_id` bigint(20) DEFAULT NULL,
  `employee_id` bigint(20) DEFAULT NULL,
  `tax_status_id` bigint(20) DEFAULT NULL,
  `shipper_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `orders`
--

INSERT INTO `orders` (`id`, `create_date`, `create_user`, `current_status`, `notes`, `order_date`, `paid_date`, `payment_type`, `qty`, `recipe`, `ship_address`, `ship_city`, `ship_country_region`, `ship_name`, `ship_state_province`, `ship_zip_postal_code`, `shipped_date`, `shipping_fee`, `tax_rate`, `taxes`, `update_date`, `customer_id`, `employee_id`, `tax_status_id`, `shipper_id`) VALUES
(1, '2020-03-17 17:24:35', NULL, 1, '1', '2020-03-17 00:00:00', '2020-03-20 00:00:00', '1', '1', '1', '1', '1', '1', '1', '1', '1', '2020-03-19 00:00:00', NULL, 1, NULL, '2020-03-17 17:24:35', 1, NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `orders_orders_status`
--

CREATE TABLE `orders_orders_status` (
  `Order_id` bigint(20) NOT NULL,
  `orderStatuss_id` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `orders_status`
--

CREATE TABLE `orders_status` (
  `id` bigint(20) NOT NULL,
  `create_date` datetime DEFAULT NULL,
  `create_user` varchar(255) DEFAULT NULL,
  `status_name` varchar(255) DEFAULT NULL,
  `update_date` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `orders_status`
--

INSERT INTO `orders_status` (`id`, `create_date`, `create_user`, `status_name`, `update_date`) VALUES
(1, '2020-03-17 17:22:49', NULL, 'begin', '2020-03-17 17:22:49'),
(2, '2020-03-17 17:23:03', NULL, '1', '2020-03-17 17:23:03'),
(3, '2020-03-17 17:23:11', NULL, '2', '2020-03-17 17:23:11'),
(4, '2020-03-17 17:23:16', NULL, '3', '2020-03-17 17:23:16'),
(5, '2020-03-17 17:23:21', NULL, 'end', '2020-03-17 17:23:21');

-- --------------------------------------------------------

--
-- Table structure for table `orders_status_orders`
--

CREATE TABLE `orders_status_orders` (
  `OrdersStatus_id` bigint(20) NOT NULL,
  `orders_id` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `orders_tax_status`
--

CREATE TABLE `orders_tax_status` (
  `id` bigint(20) NOT NULL,
  `create_date` datetime DEFAULT NULL,
  `create_user` varchar(255) DEFAULT NULL,
  `tax_status_name` varchar(255) DEFAULT NULL,
  `update_date` datetime DEFAULT NULL,
  `order_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `order_details`
--

CREATE TABLE `order_details` (
  `id` bigint(20) NOT NULL,
  `create_date` datetime DEFAULT NULL,
  `create_user` varchar(255) DEFAULT NULL,
  `date_allocated` datetime DEFAULT NULL,
  `discount` double NOT NULL,
  `inventory_id` int(11) DEFAULT NULL,
  `purchase_order_id` int(11) DEFAULT NULL,
  `quantity` decimal(19,2) DEFAULT NULL,
  `unit_price` decimal(19,2) DEFAULT NULL,
  `update_date` datetime DEFAULT NULL,
  `order_id` bigint(20) DEFAULT NULL,
  `status_id` bigint(20) DEFAULT NULL,
  `product_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `order_details_status`
--

CREATE TABLE `order_details_status` (
  `id` bigint(20) NOT NULL,
  `create_date` datetime DEFAULT NULL,
  `create_user` varchar(255) DEFAULT NULL,
  `status_name` varchar(255) DEFAULT NULL,
  `update_date` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `privileges`
--

CREATE TABLE `privileges` (
  `id` bigint(20) NOT NULL,
  `create_date` datetime DEFAULT NULL,
  `create_user` varchar(255) DEFAULT NULL,
  `privilege_name` varchar(255) DEFAULT NULL,
  `renderedDelete` varchar(255) DEFAULT NULL,
  `update_date` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `privileges`
--

INSERT INTO `privileges` (`id`, `create_date`, `create_user`, `privilege_name`, `renderedDelete`, `update_date`) VALUES
(1, '2020-03-17 17:21:54', 'Admin', 'Admin', 'true', '2020-03-17 17:21:54');

-- --------------------------------------------------------

--
-- Table structure for table `products`
--

CREATE TABLE `products` (
  `id` bigint(20) NOT NULL,
  `attachments` varchar(255) DEFAULT NULL,
  `category` varchar(255) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  `create_user` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `discontinued` varchar(255) DEFAULT NULL,
  `list_price` decimal(19,2) DEFAULT NULL,
  `minimum_reorder_quantity` int(11) DEFAULT NULL,
  `product_code` varchar(255) DEFAULT NULL,
  `product_name` varchar(255) DEFAULT NULL,
  `quantity_per_unit` varchar(255) DEFAULT NULL,
  `reorder_level` int(11) DEFAULT NULL,
  `standard_cost` decimal(19,2) DEFAULT NULL,
  `supplier_ids` varchar(255) DEFAULT NULL,
  `target_level` int(11) DEFAULT NULL,
  `update_date` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `purchase_orders`
--

CREATE TABLE `purchase_orders` (
  `id` bigint(20) NOT NULL,
  `approved_by` int(11) DEFAULT NULL,
  `approved_date` datetime DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  `create_user` varchar(255) DEFAULT NULL,
  `creation_date` datetime DEFAULT NULL,
  `expected_date` datetime DEFAULT NULL,
  `notes` varchar(255) DEFAULT NULL,
  `payment_amount` decimal(19,2) DEFAULT NULL,
  `payment_date` datetime DEFAULT NULL,
  `payment_method` varchar(255) DEFAULT NULL,
  `shipping_fee` decimal(19,2) DEFAULT NULL,
  `submitted_by` int(11) DEFAULT NULL,
  `submitted_date` datetime DEFAULT NULL,
  `taxes` decimal(19,2) DEFAULT NULL,
  `update_date` datetime DEFAULT NULL,
  `created_by` bigint(20) DEFAULT NULL,
  `status_id` int(11) DEFAULT NULL,
  `supplier_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `purchase_order_details`
--

CREATE TABLE `purchase_order_details` (
  `id` bigint(20) NOT NULL,
  `create_date` datetime DEFAULT NULL,
  `create_user` varchar(255) DEFAULT NULL,
  `date_received` datetime DEFAULT NULL,
  `posted_to_inventory` varchar(255) DEFAULT NULL,
  `quantity` decimal(19,2) DEFAULT NULL,
  `unit_cost` decimal(19,2) DEFAULT NULL,
  `update_date` datetime DEFAULT NULL,
  `inventory_id` bigint(20) DEFAULT NULL,
  `product_id` bigint(20) DEFAULT NULL,
  `purchase_order_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `purchase_order_status`
--

CREATE TABLE `purchase_order_status` (
  `id` int(11) NOT NULL,
  `create_date` datetime DEFAULT NULL,
  `create_user` varchar(255) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `update_date` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `sales_reports`
--

CREATE TABLE `sales_reports` (
  `id` bigint(20) NOT NULL,
  `create_date` datetime DEFAULT NULL,
  `create_user` varchar(255) DEFAULT NULL,
  `defaultvalue` varchar(255) DEFAULT NULL,
  `display` varchar(255) DEFAULT NULL,
  `filter_row_source` varchar(255) DEFAULT NULL,
  `group_by` varchar(255) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  `update_date` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `shippers`
--

CREATE TABLE `shippers` (
  `id` bigint(20) NOT NULL,
  `address` varchar(255) DEFAULT NULL,
  `attachments` varchar(255) DEFAULT NULL,
  `business_phone` varchar(255) DEFAULT NULL,
  `city` varchar(255) DEFAULT NULL,
  `company` varchar(255) DEFAULT NULL,
  `country_region` varchar(255) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  `create_user` varchar(255) DEFAULT NULL,
  `email_address` varchar(255) DEFAULT NULL,
  `fax_number` varchar(255) DEFAULT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `home_phone` varchar(255) DEFAULT NULL,
  `job_title` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `mobile_phone` varchar(255) DEFAULT NULL,
  `notes` varchar(255) DEFAULT NULL,
  `state_province` varchar(255) DEFAULT NULL,
  `update_date` datetime DEFAULT NULL,
  `web_page` varchar(255) DEFAULT NULL,
  `zip_postal_code` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `strings`
--

CREATE TABLE `strings` (
  `string_id` bigint(20) NOT NULL,
  `create_date` datetime DEFAULT NULL,
  `create_user` varchar(255) DEFAULT NULL,
  `string_data` varchar(255) DEFAULT NULL,
  `update_date` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `suppliers`
--

CREATE TABLE `suppliers` (
  `id` bigint(20) NOT NULL,
  `address` varchar(255) DEFAULT NULL,
  `attachments` varchar(255) DEFAULT NULL,
  `business_phone` varchar(255) DEFAULT NULL,
  `city` varchar(255) DEFAULT NULL,
  `company` varchar(255) DEFAULT NULL,
  `country_region` varchar(255) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  `create_user` varchar(255) DEFAULT NULL,
  `email_address` varchar(255) DEFAULT NULL,
  `fax_number` varchar(255) DEFAULT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `home_phone` varchar(255) DEFAULT NULL,
  `job_title` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `mobile_phone` varchar(255) DEFAULT NULL,
  `notes` varchar(255) DEFAULT NULL,
  `state_province` varchar(255) DEFAULT NULL,
  `update_date` datetime DEFAULT NULL,
  `web_page` varchar(255) DEFAULT NULL,
  `zip_postal_code` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `xtbl_docket`
--

CREATE TABLE `xtbl_docket` (
  `id` bigint(20) NOT NULL,
  `admix1ap` varchar(45) DEFAULT NULL,
  `admix2ap` varchar(45) DEFAULT NULL,
  `admix3ap` varchar(45) DEFAULT NULL,
  `admix4ap` varchar(45) DEFAULT NULL,
  `agg1mix` varchar(45) DEFAULT NULL,
  `agg1sp` varchar(45) DEFAULT NULL,
  `agg2mix` varchar(45) DEFAULT NULL,
  `agg2sp` varchar(45) DEFAULT NULL,
  `agg3mix` varchar(45) DEFAULT NULL,
  `agg3sp` varchar(45) DEFAULT NULL,
  `agg4mix` varchar(45) DEFAULT NULL,
  `agg4sp` varchar(45) DEFAULT NULL,
  `cemt1mix` varchar(45) DEFAULT NULL,
  `cemt1sp` varchar(45) DEFAULT NULL,
  `cemt2mix` varchar(45) DEFAULT NULL,
  `cemt2sp` varchar(45) DEFAULT NULL,
  `cemt3mix` varchar(45) DEFAULT NULL,
  `cemt3sp` varchar(45) DEFAULT NULL,
  `cemt4mix` varchar(45) DEFAULT NULL,
  `cemt4sp` varchar(45) DEFAULT NULL,
  `countdoc` varchar(45) DEFAULT NULL,
  `dptype` varchar(45) DEFAULT NULL,
  `datebatch` varchar(45) DEFAULT NULL,
  `docketno` varchar(45) DEFAULT NULL,
  `docketref` varchar(45) DEFAULT NULL,
  `driver` varchar(45) DEFAULT NULL,
  `finished` varchar(45) DEFAULT NULL,
  `fuel` varchar(45) DEFAULT NULL,
  `moist1` varchar(45) DEFAULT NULL,
  `moist2` varchar(45) DEFAULT NULL,
  `moist3` varchar(45) DEFAULT NULL,
  `moist4` varchar(45) DEFAULT NULL,
  `price` varchar(45) DEFAULT NULL,
  `qf` varchar(45) DEFAULT NULL,
  `qn` varchar(45) DEFAULT NULL,
  `qtybatch` varchar(45) DEFAULT NULL,
  `qtydocket` varchar(45) DEFAULT NULL,
  `qtynet` varchar(45) DEFAULT NULL,
  `qtyperbatch` varchar(45) DEFAULT NULL,
  `qtytruck` varchar(45) DEFAULT NULL,
  `qw` varchar(45) DEFAULT NULL,
  `remark` varchar(45) DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL,
  `temp0` varchar(45) DEFAULT NULL,
  `temp1` varchar(45) DEFAULT NULL,
  `time_ex` datetime DEFAULT NULL,
  `time_load` datetime DEFAULT NULL,
  `totalcost` varchar(45) DEFAULT NULL,
  `uploaded` varchar(45) DEFAULT NULL,
  `vat` varchar(45) DEFAULT NULL,
  `wc` varchar(45) DEFAULT NULL,
  `watersp` varchar(45) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  `create_user` varchar(255) DEFAULT NULL,
  `update_date` datetime DEFAULT NULL,
  `order_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `company`
--
ALTER TABLE `company`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `employees`
--
ALTER TABLE `employees`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKpyq0k2pdi2lxgatf0ax2mc10p` (`privilege_id`);

--
-- Indexes for table `id_gen`
--
ALTER TABLE `id_gen`
  ADD PRIMARY KEY (`GEN_KEY`);

--
-- Indexes for table `inventory_transactions`
--
ALTER TABLE `inventory_transactions`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKm9221uh09ln4o46x5lnwe2mh9` (`transaction_type`),
  ADD KEY `FKt9ss95chqp7amw42h548imac6` (`customer_order_id`),
  ADD KEY `FKrm9aaxuvvmp9ehvxwe936ar04` (`product_id`),
  ADD KEY `FKh7fq84yomn986ncnrq4fype7e` (`purchase_order_id`);

--
-- Indexes for table `inventory_transaction_types`
--
ALTER TABLE `inventory_transaction_types`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `invoices`
--
ALTER TABLE `invoices`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK4ko3y00tkkk2ya3p6wnefjj2f` (`order_id`);

--
-- Indexes for table `orders`
--
ALTER TABLE `orders`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK624gtjin3po807j3vix093tlf` (`customer_id`),
  ADD KEY `FKfhl8bv0xn3sj33q2f3scf1bq6` (`employee_id`),
  ADD KEY `FK7collrvo86jelcgiexmd86q0k` (`tax_status_id`),
  ADD KEY `FKsk2tyu7xrdu2ienuay5yrpgoe` (`shipper_id`);

--
-- Indexes for table `orders_orders_status`
--
ALTER TABLE `orders_orders_status`
  ADD KEY `FK8s8h50s3as3627emrgmwrxw2w` (`orderStatuss_id`),
  ADD KEY `FKn4paqn540cr5oeuwn34fsan7v` (`Order_id`);

--
-- Indexes for table `orders_status`
--
ALTER TABLE `orders_status`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `orders_status_orders`
--
ALTER TABLE `orders_status_orders`
  ADD KEY `FKog5te4hr4fyrnee7o079i4vrt` (`orders_id`),
  ADD KEY `FK120fsgyh12gqwaonsfnysbmx4` (`OrdersStatus_id`);

--
-- Indexes for table `orders_tax_status`
--
ALTER TABLE `orders_tax_status`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKdn5lhb8yu7otakaoypbiry6b2` (`order_id`);

--
-- Indexes for table `order_details`
--
ALTER TABLE `order_details`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKjyu2qbqt8gnvno9oe9j2s2ldk` (`order_id`),
  ADD KEY `FK2y4bs08cnmwea2pnkidnp6l6p` (`status_id`),
  ADD KEY `FK4q98utpd73imf4yhttm3w0eax` (`product_id`);

--
-- Indexes for table `order_details_status`
--
ALTER TABLE `order_details_status`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `privileges`
--
ALTER TABLE `privileges`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `products`
--
ALTER TABLE `products`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `purchase_orders`
--
ALTER TABLE `purchase_orders`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKpqy9fcrvmpk3ph36bnbp056xi` (`created_by`),
  ADD KEY `FKl6u9k4y3xofs9hvf67hdmwpec` (`status_id`),
  ADD KEY `FKrpdasmb8y8xs5tiy4369xpinq` (`supplier_id`);

--
-- Indexes for table `purchase_order_details`
--
ALTER TABLE `purchase_order_details`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKkq5j94xriw7aqx11rwn8m7jwc` (`inventory_id`),
  ADD KEY `FKpouou78xjt37rqmveufppyhtp` (`product_id`),
  ADD KEY `FK7k5h72ashr7waatbffpug92ei` (`purchase_order_id`);

--
-- Indexes for table `purchase_order_status`
--
ALTER TABLE `purchase_order_status`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `sales_reports`
--
ALTER TABLE `sales_reports`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `shippers`
--
ALTER TABLE `shippers`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `strings`
--
ALTER TABLE `strings`
  ADD PRIMARY KEY (`string_id`);

--
-- Indexes for table `suppliers`
--
ALTER TABLE `suppliers`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `xtbl_docket`
--
ALTER TABLE `xtbl_docket`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK509xrtac3g8trx7u5psvcx9xi` (`order_id`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `employees`
--
ALTER TABLE `employees`
  ADD CONSTRAINT `FKpyq0k2pdi2lxgatf0ax2mc10p` FOREIGN KEY (`privilege_id`) REFERENCES `privileges` (`id`);

--
-- Constraints for table `inventory_transactions`
--
ALTER TABLE `inventory_transactions`
  ADD CONSTRAINT `FKh7fq84yomn986ncnrq4fype7e` FOREIGN KEY (`purchase_order_id`) REFERENCES `purchase_orders` (`id`),
  ADD CONSTRAINT `FKm9221uh09ln4o46x5lnwe2mh9` FOREIGN KEY (`transaction_type`) REFERENCES `inventory_transaction_types` (`id`),
  ADD CONSTRAINT `FKrm9aaxuvvmp9ehvxwe936ar04` FOREIGN KEY (`product_id`) REFERENCES `products` (`id`),
  ADD CONSTRAINT `FKt9ss95chqp7amw42h548imac6` FOREIGN KEY (`customer_order_id`) REFERENCES `orders` (`id`);

--
-- Constraints for table `invoices`
--
ALTER TABLE `invoices`
  ADD CONSTRAINT `FK4ko3y00tkkk2ya3p6wnefjj2f` FOREIGN KEY (`order_id`) REFERENCES `orders` (`id`);

--
-- Constraints for table `orders`
--
ALTER TABLE `orders`
  ADD CONSTRAINT `FK624gtjin3po807j3vix093tlf` FOREIGN KEY (`customer_id`) REFERENCES `customer` (`id`),
  ADD CONSTRAINT `FK7collrvo86jelcgiexmd86q0k` FOREIGN KEY (`tax_status_id`) REFERENCES `orders_tax_status` (`id`),
  ADD CONSTRAINT `FKfhl8bv0xn3sj33q2f3scf1bq6` FOREIGN KEY (`employee_id`) REFERENCES `employees` (`id`),
  ADD CONSTRAINT `FKsk2tyu7xrdu2ienuay5yrpgoe` FOREIGN KEY (`shipper_id`) REFERENCES `shippers` (`id`);

--
-- Constraints for table `orders_orders_status`
--
ALTER TABLE `orders_orders_status`
  ADD CONSTRAINT `FK8s8h50s3as3627emrgmwrxw2w` FOREIGN KEY (`orderStatuss_id`) REFERENCES `orders_status` (`id`),
  ADD CONSTRAINT `FKn4paqn540cr5oeuwn34fsan7v` FOREIGN KEY (`Order_id`) REFERENCES `orders` (`id`);

--
-- Constraints for table `orders_status_orders`
--
ALTER TABLE `orders_status_orders`
  ADD CONSTRAINT `FK120fsgyh12gqwaonsfnysbmx4` FOREIGN KEY (`OrdersStatus_id`) REFERENCES `orders_status` (`id`),
  ADD CONSTRAINT `FKog5te4hr4fyrnee7o079i4vrt` FOREIGN KEY (`orders_id`) REFERENCES `orders` (`id`);

--
-- Constraints for table `orders_tax_status`
--
ALTER TABLE `orders_tax_status`
  ADD CONSTRAINT `FKdn5lhb8yu7otakaoypbiry6b2` FOREIGN KEY (`order_id`) REFERENCES `orders` (`id`);

--
-- Constraints for table `order_details`
--
ALTER TABLE `order_details`
  ADD CONSTRAINT `FK2y4bs08cnmwea2pnkidnp6l6p` FOREIGN KEY (`status_id`) REFERENCES `order_details_status` (`id`),
  ADD CONSTRAINT `FK4q98utpd73imf4yhttm3w0eax` FOREIGN KEY (`product_id`) REFERENCES `products` (`id`),
  ADD CONSTRAINT `FKjyu2qbqt8gnvno9oe9j2s2ldk` FOREIGN KEY (`order_id`) REFERENCES `orders` (`id`);

--
-- Constraints for table `purchase_orders`
--
ALTER TABLE `purchase_orders`
  ADD CONSTRAINT `FKl6u9k4y3xofs9hvf67hdmwpec` FOREIGN KEY (`status_id`) REFERENCES `purchase_order_status` (`id`),
  ADD CONSTRAINT `FKpqy9fcrvmpk3ph36bnbp056xi` FOREIGN KEY (`created_by`) REFERENCES `employees` (`id`),
  ADD CONSTRAINT `FKrpdasmb8y8xs5tiy4369xpinq` FOREIGN KEY (`supplier_id`) REFERENCES `suppliers` (`id`);

--
-- Constraints for table `purchase_order_details`
--
ALTER TABLE `purchase_order_details`
  ADD CONSTRAINT `FK7k5h72ashr7waatbffpug92ei` FOREIGN KEY (`purchase_order_id`) REFERENCES `purchase_orders` (`id`),
  ADD CONSTRAINT `FKkq5j94xriw7aqx11rwn8m7jwc` FOREIGN KEY (`inventory_id`) REFERENCES `inventory_transactions` (`id`),
  ADD CONSTRAINT `FKpouou78xjt37rqmveufppyhtp` FOREIGN KEY (`product_id`) REFERENCES `products` (`id`);

--
-- Constraints for table `xtbl_docket`
--
ALTER TABLE `xtbl_docket`
  ADD CONSTRAINT `FK509xrtac3g8trx7u5psvcx9xi` FOREIGN KEY (`order_id`) REFERENCES `orders` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
