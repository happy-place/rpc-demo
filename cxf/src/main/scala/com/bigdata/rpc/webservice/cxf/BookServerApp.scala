package com.bigdata.rpc.webservice.cxf

import com.bigdata.rpc.webservice.cxf.service.BookServiceImpl
import com.bigdata.webservice.cxf.service.BookService
import javax.xml.ws.Endpoint

object BookServerApp {

  def main(args: Array[String]): Unit = {
    val address = "http://127.0.0.1:8080/book/ws?wsdl"
    val bookService = new BookServiceImpl()
    Endpoint.publish(address,bookService)
    println(s"${address} 发版成功")
  }

}
