package org.scala
class ScalaUnderScoreMagic {

    def runScalaMagic(){

      var sam: SamplePojo  = new SamplePojo;
     // sam.setPrivateVar(10);
      /*
      Note:  Getter setter of private variables accessed in same way(Uniform access Principle)
       */
      sam.age=11;
      System.out.println(sam.age);

      /*
      Public variables are also accessible in same way
      Scala Compiler generates getter setter for private variables to provide UAP
      */
      System.out.println(sam.publicVar)
    }
}
