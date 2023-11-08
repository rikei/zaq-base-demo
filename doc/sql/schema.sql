CREATE DATABASE `zaq-base-demo-db` CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

use `zaq-base-demo-db`;

create table if not exists sys_user
(
    id          bigint auto_increment comment '用户ID'
    primary key,
    user_name   varchar(30)              not null comment '用户账号',
    password    varchar(100) default ''  null comment '密码',
    is_delete   char         default '0' null comment '删除标志（0代表存在 1代表删除）',
    create_user bigint                   null comment '创建者',
    create_time datetime                 null comment '创建时间',
    update_user bigint                   null comment '更新者',
    update_time datetime                 null comment '更新时间'
    )
    comment '用户信息表';

INSERT INTO `zaq-base-demo-db`.sys_user (user_name, password, is_delete, create_user, create_time, update_user, update_time) VALUES ('小明1', 'xxx', '0', 0, '2023-11-02 10:17:59', 0, '2023-11-02 10:18:04');
INSERT INTO `zaq-base-demo-db`.sys_user (user_name, password, is_delete, create_user, create_time, update_user, update_time) VALUES ('小明2', 'xxx', '0', 0, '2023-11-02 10:17:59', 0, '2023-11-02 10:18:04');
INSERT INTO `zaq-base-demo-db`.sys_user (user_name, password, is_delete, create_user, create_time, update_user, update_time) VALUES ('小明3', 'xxx', '0', 0, '2023-11-02 10:17:59', 0, '2023-11-02 10:18:04');
INSERT INTO `zaq-base-demo-db`.sys_user (user_name, password, is_delete, create_user, create_time, update_user, update_time) VALUES ('小明4', 'xxx', '0', 0, '2023-11-02 10:17:59', 0, '2023-11-02 10:18:04');
INSERT INTO `zaq-base-demo-db`.sys_user (user_name, password, is_delete, create_user, create_time, update_user, update_time) VALUES ('小明5', 'xxx', '0', 0, '2023-11-02 10:17:59', 0, '2023-11-02 10:18:04');
INSERT INTO `zaq-base-demo-db`.sys_user (user_name, password, is_delete, create_user, create_time, update_user, update_time) VALUES ('小明6', 'xxx', '0', 0, '2023-11-02 10:17:59', 0, '2023-11-02 10:18:04');
INSERT INTO `zaq-base-demo-db`.sys_user (user_name, password, is_delete, create_user, create_time, update_user, update_time) VALUES ('小明7', 'xxx', '0', 0, '2023-11-02 10:17:59', 0, '2023-11-02 10:18:04');
INSERT INTO `zaq-base-demo-db`.sys_user (user_name, password, is_delete, create_user, create_time, update_user, update_time) VALUES ('小明8', 'xxx', '0', 0, '2023-11-02 10:17:59', 0, '2023-11-02 10:18:04');
INSERT INTO `zaq-base-demo-db`.sys_user (user_name, password, is_delete, create_user, create_time, update_user, update_time) VALUES ('小明9', 'xxx', '0', 0, '2023-11-02 10:17:59', 0, '2023-11-02 10:18:04');
INSERT INTO `zaq-base-demo-db`.sys_user (user_name, password, is_delete, create_user, create_time, update_user, update_time) VALUES ('小明10', 'xxx', '0', 0, '2023-11-02 10:17:59', 0, '2023-11-02 10:18:04');
INSERT INTO `zaq-base-demo-db`.sys_user (user_name, password, is_delete, create_user, create_time, update_user, update_time) VALUES ('小明11', 'xxx', '0', 0, '2023-11-02 10:17:59', 0, '2023-11-02 10:18:04');

