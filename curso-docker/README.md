# Docker

Alguns comandos uteis para se trabalhar com docker

## Start

O comando inicia um conteiner já criado

flags: -a, de attach, para integrar os terminais, e -i, de interactive, para interagirmos com o terminal

```bash
docker start -a -i 05025384675e
```

## Stop

Parar todos de uma só vez
```bash
docker stop $(docker ps -q)
```

## Remover container

```bash
docker rm c9f83bfb82a8
```

## Remover Containers inativos

Esta comando irá remover os containers criados que estão inativos, para ver os inativos o comando é:
docker ps -a

```bash
docker container prune
```

## Remover Imagem

```bash
docker rmi hello-world
```
