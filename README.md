##JAX-RS (Jersey) on WebLogic
Shared library must be deployed:


1. Log into the WebLogic Server Administration Console as described in "Accessing Oracle WebLogic Administration Console" in Administering Web Services with Oracle Fusion Middleware.
2. For example:
3. http://host:port/console
4. Select Deployments.
5. Click Install to install the shared library.
6. In the Path field, enter or navigate to the following directory: MW_HOME\wlserver\common\deployable-libraries.
7. Select the jax-rs-2.0.war file.
8. Click Next.
9. Select Install this deployment as a library.
10. Click Next.
11. Click Finish.



https://docs.oracle.com/middleware/1213/wls/RESTF/use-jersey20-ri.htm#RESTF297


##Deployment
1. mvn clean install atm-ws (atm-ear) _not exploded_ 
2. deploy atm-ws (atm-ear) on WebLogic
3. mvn clean install atm-gui-client (client uses deployed wsdl to build itself)




## Rest URL example
http://localhost:7001/atm-ws/atms/15