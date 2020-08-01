grpc 实质是将 protobuf 字节编码能力和 netty 网络编程能力进行了整合和优化，此外还可以基于http/2协议编码，支持OkHttp，InProcess 请求。

编写步骤：
1.编写 .proto 文件(通用格式文件)
proto3 语法 https://developers.google.com/protocol-buffers/docs/proto3

2.执行 protobuf:compile-custom 生成 GeeterGrpc 接口
等效于 protoc --plugin=protoc-gen-grpc-java=/Users/lishihao/Desktop/github/grpc-java-master/compiler/build/exe/java_plugin/protoc-gen-grpc-java --grpc-java_out=./ --proto_path=./ helloworld.proto

3.执行 protobuf:compile 生成 实体类
等效于 protoc --java_out=./ helloworld.proto

4.编写 GeeterGrpc 服务端接口实现 GreeterImpl

5.编写 服务端启动类 GrpcServer

6.编写客户端 面向服务端存根 编码 GrpcClient (调用与网络传输通常是耦合的)

