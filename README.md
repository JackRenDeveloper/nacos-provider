# nacos-provider
测试

nacos-provider-dev.yaml

server:
  port: 8762
username: Jack
spring:
  application:
    name: nacos-provider
  cloud:
    nacos:
      discovery:
        server-addr: 192.168.4.201:18083
    sentinel:
      transport:
        port: 8719
        dashboard: 192.168.4.201:18085
