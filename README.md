# spring-cloud-Eureka
使用Eureka完成的分布式微服务

## eureka-server
注册控制台Eureka到端口8761

## provider-ticket1
注册服务到端口8001和8002

## consumer-user
开启轮回调用的LoadBalanced，调用服务provider-ticket1，同时注册自身到端口8200
