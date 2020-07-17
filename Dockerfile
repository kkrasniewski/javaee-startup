FROM airhacks/glassfish
COPY ./target/JavaEEStartup.war ${DEPLOYMENT_DIR}
