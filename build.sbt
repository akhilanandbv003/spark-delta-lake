name := "spark-delta-lake"

version := "0.1"

scalaVersion := "2.12.8"
val sparkVersion = "2.4.0"
resolvers += "Spark Packages Repo" at "http://dl.bintray.com/spark-packages/maven"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % sparkVersion,
  "org.apache.spark" %% "spark-sql" % sparkVersion,
  "org.apache.spark" %% "spark-avro" % sparkVersion, //org.apache.spark:spark-avro_2.11:2.4.0
  "org.apache.spark" %% "spark-sql-kafka-0-10" % sparkVersion,
  "org.postgresql" % "postgresql" % "42.2.5",
  //  "com.holdenkarau" %% "spark-testing-base" % "2.2.0_0.8.0" % "test"

  //Needed to read from s3
  "com.amazonaws" % "aws-java-sdk" % "1.7.4",
  "org.apache.hadoop" % "hadoop-aws" % "2.7.3",


  //tests
  "MrPowers" % "spark-fast-tests" % "0.17.1-s_2.12",
  "org.scalatest" %% "scalatest" % "3.0.1" % Test,
  "org.mockito" % "mockito-core" % "1.9.5" % Test
)