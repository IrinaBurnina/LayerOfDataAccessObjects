create table homework.CUSTOMERS
(
    id           serial primary key,
    name         varchar(50) not null,
    surname      varchar(50) not null,
    age          int default 0,
    phone_number varchar(50)
);
create table homework.ORDERS
(
    id           serial primary key,
    date         varchar(10) default now(),
    customer_id  int         not null references homework.customers (id),
    product_name varchar(50) not null,
    amount       int         default 0
);
