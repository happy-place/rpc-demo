基于WSDL文件的RPC服务

1.使用第三方CXF插件生成代码
    下载 https://mirrors.tuna.tsinghua.edu.cn/apache/cxf/3.3.6/apache-cxf-3.3.6.tar.gz插件，并将CXF_HOME添加到环境
    场景1(编写服务端代码)，然后启动服务，注册wsdl服务端点，然后使用wsdl2java -client 命令生成客户端代码

    场景2(已知某第三方RPC服务的wsdl文件)
    本地使用 wsdl2java -impl 生成本地实现类
    本地使用 wsdl2java -server 生成本地包装了第三方RPC服务的服务
    本地使用 wsdl2java -client 生成本地直接调用第三方服务或调用自己封装服务的服务的客户端代码

    wsdl2java -p com.bigdata.webservice.cxf.client -d /Users/huhao/softwares/idea_proj/rpc-demo/web-service/src/main/java/ -client http://127.0.0.1:8080/book/ws?wsdl
    wsdl2java -p com.bigdata.webservice.cxf.server -d /Users/huhao/softwares/idea_proj/rpc-demo/web-service/src/main/java/ -server http://127.0.0.1:8080/book/ws?wsdl
    wsdl2java -p com.bigdata.webservice.cxf.impl -d /Users/huhao/softwares/idea_proj/rpc-demo/web-service/src/main/java/ -impl http://127.0.0.1:8080/book/ws?wsdl

    -p package
    -d 输出目录

    注意生成 impl 时可能需要将 注释掉 wsdlLocation = "http://127.0.0.1:8080/book/ws?wsdl", 防止出现 com.sun.xml.internal.ws.server.ServerRtException: [failed to localize] 异常

2.使用JDK自带wsimport生成客户端代码
wsimport -keep -d /Users/huhao/softwares/idea_proj/rpc-demo/web-service/target/classes -s /Users/huhao/softwares/idea_proj/rpc-demo/web-service/src/main/java/ -p com.bigdata.webservice.wsimport.refer -verbose http://127.0.0.1:8080/book/ws?wsdl