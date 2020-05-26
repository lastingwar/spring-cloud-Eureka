# spring-cloud-Eureka
使用Eureka完成的分布式微服务
![eureka启动.png](https://i.loli.net/2020/05/26/AWkpCZBy4URNzEu.png)

## eureka-server
注册控制台Eureka到端口8761
![eureka界面.png](https://i.loli.net/2020/05/26/rY4vTblyDxgzLWH.png)

## provider-ticket1
注册服务到端口8001和8002
![生产者启动.png](https://i.loli.net/2020/05/26/eog3xLdZuA5BNSD.png)
![生产者部署完成.png](https://i.loli.net/2020/05/26/QBKrinFc6Gz2jVa.png)

## consumer-user
开启轮回调用的LoadBalanced，调用服务provider-ticket1，同时注册自身到端口8200
![消费者启动.png](https://i.loli.net/2020/05/26/UgLVcZTStwdGCRs.png)
![分布式消费者.png](https://i.loli.net/2020/05/26/UvkCS1p38JV5rua.png)
