package org.scala

class SamplePojo {
  var publicVar: Int = _;

  private var privateVar = 0

  /*
        Scala Compiler generates getter setter for public variables to provide UAP in similar manner
   Refer: http://joelabrahamsson.com/learning-scala-part-nine-uniform-access/
   */
  def age = privateVar
  def age_=(n:Int) = {
    require(n>0)
    privateVar = n
  }

}