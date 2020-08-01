package com.bigdata.rpc.webservice.cxf.bean

import javax.xml.bind.annotation.XmlRootElement

@XmlRootElement
case class Book(id:Int,title:String,price:Double){
  def this(){this(0,"",0.0f)}
  override def toString: String = s"Book[id=${id},title=${title},price=${price}]"
}
