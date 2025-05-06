from pyspark.sql import SparkSession

spark = SparkSession.builder \
        .appName("MLjobsInUSA") \
        .getOrCreate()

spark.sparkContext.setLogLevel("ERROR")

jobsDf = spark.read.csv("C:\\Users\\mohni\\coffee-to-code\\spark_rough_book\\1000_ml_jobs_us.csv",
                        header = True,
                        inferSchema = True,
                        multiLine = True,
                        escape = '"',
                        quote = '"')

jobsDf.groupBy("company_address_region").count().show()