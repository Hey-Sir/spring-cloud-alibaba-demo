## Spring Cloud Alibaba Demo项目

#### 项目介绍

>>spring-cloud-alibaba-demo 项目是一套电商后端系统 采用阿里巴巴公司推出的 分布式解决方案 Spring Cloud Alibaba

#### 开发环境

操作系统:window 10

开发工具:Intellij IDEA

数据库:MySql 5.7.20-log

JAVA SDK: ORACLE JDK 1.8.0_191

#### 组织结构

wml

|————ali-commons 工具类和通用常量

|————ali-commons-domain 实体类

|————ali-commons-mapper 数据操作层

|————ali-commons-service 

|————ali-database 代码生成工具

|————ali-external-skywalking 链路追踪服务

|————ali-service-gateway 网关服务

|————ali-service-oauth2 oauth2服务

#### 主要技术栈

Spring Cloud Alibaba 分布式架构解决方案

​	nacos 服务注册与发现

​	feign 服务调用

​	sentinel 熔断器

​	gateway 路由网关

​	skywalking 链路追踪

MybatisGenerator 逆向工程，代码自动生成工具，快速生成mapper， xml，实体类文件

tkmybatis ORM框架 主要用于简化sql语句的编写

mysql

swagger-UI  开发文档生成工具

Druid 数据库连接池

Redis 分布式缓存

Lombox 简化对象封装工具

Maven 项目构建工具

#### 服务规划



| 服务名                 | 端口 | 说明           |
| ---------------------- | ---- | -------------- |
| nacos                  | 8848 | 服务注册与发现 |
| wml-service-gateway    | 9000 | 网关服务       |
| wml-service-oauth2     | 9001 | 登陆服务       |

未完待续



#### 拓扑结构

