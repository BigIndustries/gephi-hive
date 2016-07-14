# gephi-hive
Gephi Hive (CDH5) library

This is a module to enable importing graph data into Gephi from Hadoop's Hive datawarehouse, it uses the Hive JDBC library and builds on Gephi's DBConnector module.

Build with `mvn clean package -Dmaven.nbm.verify=warn` and then install the file `$buildroot/target/gephi-hive-cdh-0.0.1.nbm` via the Gephi plugin manager.

You can then go to file > Import Database... > Edge list... and see Hive as a data source.

*Nb. There is currently no kerberos support in this package.*

