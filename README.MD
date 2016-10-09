Create web app using Spring MVC - Account management. Create account, view account status, put -get money to account.

Integration with apache httpd server:

-Download mod_jk.so file and put it to 'modules' directory in httpd
-Add following to httpd.conf:
    LoadModule jk_module modules/mod_jk.so
    JkWorkersFile conf/workers.properties
    #JkShmFile logs/mod_jk.shm
    JkLogFile logs/mod_jk.log
    JkLogLevel info
    JkMount /app/* node1
-Create file workers.properties under conf folder add to it following:
    worker.list=node1
    worker.node1.type=ajp13
    worker.node1.host=localhost
    worker.node1.port=8009
    worker.node1.connection_pool_timeout=600
    worker.node1.socket_keepalive=1
-Copy webapp/static folder to htdocs and remove it from the application. Run httpd and tomcat.
