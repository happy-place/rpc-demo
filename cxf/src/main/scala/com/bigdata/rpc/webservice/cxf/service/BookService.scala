package com.bigdata.rpc.webservice.cxf.service

import javax.jws.WebService
import java.util.{List => JList}

import com.bigdata.rpc.webservice.cxf.bean.Book

@WebService
trait BookService {

  def save(book: Book): Boolean

  def delete(id: Int): Boolean

  def update(book: Book): Boolean

  def getById(id: Int): Book

  def getAll(): JList[Book]

}
