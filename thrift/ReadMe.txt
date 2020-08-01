基于thrift的RPC技术于基于gRPC的基本一致，都是将数据序列话和网络编程一站式打包构建，然后面向接口编码

1.安装thrift插件
    brew install thrift

2.添加maven依赖
    主要是libthrift库依赖 和 maven-thrift-plugin 打包工具依赖

3.编写 .thrift 文件

4.thrift:compile 生成java接口代码 GreetingService

5.面向 GreetingService.Iface 编写接口实现类

6.服务端，客户端网络编程，参照
    http://thrift.apache.org/tutorial/java

官方示例：
    http://thrift.apache.org/tutorial/java

注意：使用maven插件生成 .thrift 文件对应代码时，或删除命名的包，因此最好将thrift 自动生成代码单独 module方式组织，避免client、server代码被误删。

签名文件: jdk自带签名支持
1.创建秘钥库
keytool -genkeypair -alias thrift-tutorial -keyalg RSA -validity 3650 -keystore thrift-tutorial.keystore

2.验证生成的签名文件信息
keytool -list -v -keystore thrift-tutorial.keystore

3.导出公钥
keytool -export -alias thrift-tutorial -keystore thrift-tutorial.keystore -rfc -file thrift-tutorial.cer

4.生成truststore并导入公钥
keytool -import -alias thrift-tutorial -file thrift-tutorial.cer  -keystore thrift-tutorial.truststore

5.验证生成的truststore
keytool -list -v -keystore thrift-tutorial.truststore