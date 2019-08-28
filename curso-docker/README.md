# Docker

Alguns comandos uteis para se trabalhar com docker


docker ps - exibe todos os containers em execução no momento.

docker ps -a - exibe todos os containers, independentemente de estarem em execução ou não.

docker run -it NOME_DA_IMAGEM - conecta o terminal que estamos utilizando com o do container.

docker start ID_CONTAINER - inicia o container com id em questão.

docker stop ID_CONTAINER - interrompe o container com id em questão.

docker start -a -i ID_CONTAINER - inicia o container com id em questão e integra os terminais, além de permitir interação entre ambos.

docker rm ID_CONTAINER - remove o container com id em questão.

docker container prune - remove todos os containers que estão parados.

docker rmi NOME_DA_IMAGEM - remove a imagem passada como parâmetro.

docker run -d -P --name NOME dockersamples/static-site - ao executar, dá um nome ao container.

docker run -d -p 12345:80 dockersamples/static-site - define uma porta específica para ser atribuída à porta 80 do container, neste caso 12345.

docker run -d -e AUTHOR="Fulano" dockersamples/static-site - define uma variável de ambiente AUTHOR com o valor Fulano no container criado.

docker run -v "CAMINHO_VOLUME" NOME_DA_IMAGEM - cria um volume no respectivo caminho do container.

docker inspect ID_CONTAINER - retorna diversas informações sobre o container.


##DOCKERFILE alguns comandos

O Dockerfile é utilizado para criação de imagens personalizadas!

FROM -> A partir que qual imagem será criada a nova imagem
MAINTAINER -> O nome do author da imagem
COPY -> copia os dados do host para dentro do container gerado
WORKDIR -> inicia o container na pasta especificada
RUN -> executa algum comando dentro do container
EXPOSE -> expoe as portas do container
ENTRYPOINT -> funciona como o run, porém será o primero comando a ser executado com iniciar o container

Comando para iniciar uma imagem personalizada
```
docker build -f Dockerfile -t douglasq/node .
```

Exemplo: 

```
FROM node:latest
MAINTAINER Douglas Quintanilha
COPY . /var/www
WORKDIR /var/www
RUN npm install
ENTRYPOINT npm start
EXPOSE 3000
```


##Redes em containers Docker - Network

* Imagens criadas pelo Docker acessam a mesma rede, porém apenas através de IP.
* Ao criar uma rede é possível realizar a comunicação entre os containers através do seu nome.
* Que durante a criação de uma rede precisamos indicar qual driver utilizaremos, geralmente, o driver bridge.

Alguns comandos
*hostname -i - mostra o ip atribuído ao container pelo docker (funciona apenas dentro do container).
*docker network create --driver bridge NOME_DA_REDE - cria uma rede especificando o driver desejado.
*docker run -it --name NOME_CONTAINER --network NOME_DA_REDE NOME_IMAGEM - cria um container especificando seu nome e qual rede deverá ser usada.