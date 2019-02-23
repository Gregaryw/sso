#单点登陆
##  项目概述
* 1.authorization-service为认证授权服务
* 2.resource-service-a和resource-service-b为资源服务
* 3.db为数据库sql文件

## 使用示例
* 在数据库执行db目录下table.sql
* 在浏览器访问localhost:8081/member/list接口，在没有登录情况下跳转到localhost:8080/login登录页面，登录完成后自动进入localhost:8081/member/list
* 再次访问localhost:8082/coupon/list可以直接访问其数据   