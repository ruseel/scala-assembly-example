package vcnc.baltimore

import org.apache.spark.sql.SparkSession;


object BaltimoreMigrate {
  def main(args: Array[String]): Unit = {
    println("started")

    val spark = SparkSession.builder().appName("baltimore-migrate").getOrCreate()
    val sc = spark.sparkContext
    println(sc.parallelize(List(1,2)).map(_+1).collect())
  }
}

