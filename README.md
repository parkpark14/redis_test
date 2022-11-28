spring boot gradle 
postgresql 
spring boot jpa
spring boot data => redis 


/**
 redis 
 jpa 
	native query
	query dsl

 activemq 
 netty
 jms
 */


docker pull rmohr/activemq

/*
docker run -p 61616:61616 -p 8161:8161 --name pyg_activemq \
           -v C:\src\activemq\conf:/opt/activemq/conf \
           -v C:\src\activemq\data:/opt/activemq/data \
           rmohr/activemq

docker run -p 61616:61616 -p 8161:8161 --name pyg_activemq -v C:\src\activemq\conf:/opt/activemq/conf -v C:\src\activemq\data:/opt/activemq/data rmohr/activemq

docker run --user root --rm -ti \
  -v C:\src\activemq\conf:/mnt/conf \
  -v C:\src\activemq\data:/mnt/data \
  rmohr/activemq:5.15.4-alpine /bin/sh
*/
volume 설정시 오류가 발생 한다. 

volume 설정 없이 하였다.
docker run -it -p 61616:61616 -p 8161:8161 --name pyg_activemq rmohr/activemq

http://localhost:8161
admin/admin

activemq spring boot
//  https://pulpul8282.tistory.com/220
