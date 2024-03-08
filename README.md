# SpringBoot-Blog

## database setting

```
$ cd ~/SpringBoot-Blog/docker
$ docker-compose up -d
```

### バグった場合
```
$ docker ps
$ docker stop [CONTAINER ID]
$ docker-compose down
```

#### delete image
```
$ docker images
$ docker rmi [IMAGE_ID]
```

#### delete volume
```
$ docker volume ls
$ docker volume rm [VOLUME_NAME]
```

#### delete network
```
$ docker network ls
$ docker volume rm [VOLUME_NAME]
```

## run
Run As > Spring Boot App

http://localhost:8080 にアクセス
