FROM jboss/wildfly

COPY ["datasource" ,"/opt/jboss/wildfly/customization/datasource"]

RUN ["chown", "-R" ,"jboss:jboss","/opt/jboss/wildfly/customization/"]
RUN ["chmod","-R", "+x", "/opt/jboss/wildfly/customization/"]
RUN ["/opt/jboss/wildfly/customization/execute.sh"]

CMD ["/opt/jboss/wildfly/bin/standalone.sh", "-b", "0.0.0.0", "-bmanagement", "0.0.0.0"]