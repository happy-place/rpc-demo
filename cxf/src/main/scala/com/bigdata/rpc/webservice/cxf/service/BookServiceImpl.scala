package com.bigdata.rpc.webservice.cxf.service

import javax.jws.{WebMethod, WebParam, WebService}
import java.util.{List => JList}

import com.bigdata.rpc.webservice.cxf.bean.Book

import scala.collection.JavaConversions._
@WebService
class BookServiceImpl extends BookService {

  @WebMethod(exclude = true)
  override def save(@WebParam(partName="book")book: Book): Boolean = {
    true
  }

  @WebMethod(exclude = true)
  override def delete(id: Int): Boolean = {
    true
  }

  @WebMethod(exclude = true)
  override def update(@WebParam book: Book): Boolean = {
    true
  }

  @WebMethod
  override def getById(id: Int): Book = {
    Book(1,"hello web service",23.0f)
  }

  @WebMethod
  override def getAll(): JList[Book] = {
    List(
      Book(1,"hello web service",23.0f),
      Book(1,"hello java",23.0f),
    )
  }

}
