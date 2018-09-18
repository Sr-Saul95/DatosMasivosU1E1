import org.apache.spark.sql.SparkSession

val spark = SparkSession.builder().getOrCreate()

val df = spark.read.option("header", "true").option("inferSchema","true").csv("Netflix_2011_2016.csv") //Netflix
//Nombres de las columnas
df.show()
//El esquema
df.printSchema()
//Imprimir las primeras 5 columnas
df.select("Open","High","Low","Close","Volume").show()
//Usa describe()
df.describe().show()
//Crear un nuevo df con relacion de dos columnas
val df2 = df.withColumn("HV Ratio", df("High")/df("Volume"))
//8
df.orderBy($"High".desc).show(1)
//9
df.select(mean("Close")).show()
//10
df.select(max("Volume")).show()
df.select(min("Volume")).show()

//11. Con sistaxis de Scala/Spark $Conteste los siguietes:
import spark.implicits._

//11.1
df.filter($"Close"<600).count()

//11.2
(df.filter($"High">500).count()*1.0/df.count())*100

// 11.3
df.select(corr("High","Volume")).show()

// 11.4
val yeardf = df.withColumn("Year",year(df("Date")))
val yearmaxs = yeardf.select($"Year",$"High").groupBy("Year").max()
yearavgs.select($"Year",$"max(High)").show()

// 11.5
val monthdf = df.withColumn("Month",month(df("Date")))
val monthavgs = monthdf.select($"Month",$"Close").groupBy("Month").mean()
monthavgs.show()
monthavgs.select($"Month",$"avg(Close)").show()
