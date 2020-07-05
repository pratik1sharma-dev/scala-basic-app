package org.scala

import org.apache.spark
import org.apache.spark.sql.SparkSession
import org.apache.spark.{SparkConf, SparkContext}

import scala.io.Source
import scala.xml.XML
object SparkSqlMainApp {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setAppName("org.scala.ScalaMainApp")

    val sc = new SparkContext(conf)
   /* val xml = XML.load("http://www.devdaily.com/rss.xml")


    val rdd=sc.parallelize(xml);
    //rdd.collect.foreach(println);
    val titleRdd= rdd.flatMap(wikiText=>wikiText.attribute("item"));
    titleRdd.collect.foreach(println)
*/
    val spark = SparkSession
      .builder()
      .appName("Spark SQL basic example")
      .config("spark.some.config.option", "some-value")
      .getOrCreate()
    val peopleDF = spark.read.format("json").load("/tmp/test.json")

    val rdds= peopleDF.select("name")
    peopleDF.collect.foreach(println)

  }



}
