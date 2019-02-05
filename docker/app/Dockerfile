FROM jboss/wildfly

COPY --chown=jboss:jboss ["datasource" ,"/opt/jboss/wildfly/customization/"]

RUN ["chown", "-R" ,"jboss:jboss","/opt/jboss/wildfly/customization/"]
RUN ["chown", "-R" ,"jboss:jboss","/opt/jboss/wildfly/standalone/deployments/"]
RUN ["chmod","-R", "+x", "/opt/jboss/wildfly/customization/"]
USER root
RUN chgrp -R 0 $JBOSS_HOME &&\ chmod -R g+rw $JBOSS_HOME
RUN ["/opt/jboss/wildfly/customization/execute.sh"]

CMD ["/opt/jboss/wildfly/bin/standalone.sh", "-b", "0.0.0.0", "-bmanagement", "0.0.0.0"]