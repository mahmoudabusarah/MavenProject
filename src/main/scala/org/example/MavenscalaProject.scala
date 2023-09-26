package org.example
import org.apache.spark.sql.{DataFrame, SparkSession}
object MavenscalaProject extends App {

  val spark = SparkSession.builder()
    .appName("ScalaSparkTransformations")
    .master("local") // Set master to "local" for local mode
    .getOrCreate()
  val csvFilePath = raw"C:/Users/Consultant/Downloads/sample_data.csv"
  // Read the CSV file
  val df: DataFrame = spark.read
    .option("header", "true")
    .option("inferSchema", "true")
    .csv(csvFilePath)

  // Show the original DataFrame
  df.show()
}
