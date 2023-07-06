# FDEC_B1_Project

# 'FDEC-B1 <DOCKER COMMAND>'

# https://github.com/rajatpzade/FDEC_B1_Project.git


### Containers
* Container is runnable entity of the docker container image
* To run container, at least a single service/process should be running inside a container
* Containers are not editable
* Once container is terminated, you can not retrive the container

### Docker Commands
```shell
`docker run <IMAGE>`  # run container in attached way

`docker run -d <IMAGE>`  # -d run container in dettached way

`docker ps`     # to list running containers

`docker inspect <CONTAINER_ID||CONTAIENR_NAME>`  # Detailed information about container
`docker run -d -p 8080:80 <IMAGE>` # -p map HOST_PORT:COTNAINER_PORT
`docker run -d -P <IMAGE>` # -P map random host port with container port
`docker images` # list of docker images in local system
`docker exec -it <CONTAINERID> <COMMAND>` to execute any command inside the container
<<<<<<< HEAD
`docker exec -it <CONTAINERID> bash`  to work on container's bash terminal
`docker stop <CONTAINERID>` to stop container
`docker start <CONTAINERID>` to start container
`docker restart <CONTAINERID>` to start container
`docker kill <CONTAINERID>` to send killsig to the container
`docker rm <CONTAINERID>` to remove stopped
`docker rm -f <CONTAINERID>` -f force to remove running container
`docker ps -q`  -q container ids only
`docker kill `docker ps -q``  to kill all running containers
docker logs f0d2c97b0291 show docker logs
docker cp containerid:<SOURCE> <DEST> 
docker top <CONTAINERID> - to show contaienrprocesses
docker pull alpine - pull image from container registry only
docker login - to login in dockerhub
docker login <REGISTRY_ENDPOINT> - to login in oerticular registry
docker commit a32f7faf0500 - to save container state into contaienr image
docker tag 33f1b2f100c6 <USERNAME>/<REPONAME>:<TAG>  - to give name to the image
docker push rajatpzade/my-nginx:v1.0.2 - to push image in docker registry
docker save -o my-nginx.tar <IMAGEID> - save image as archive
docker images -q - list of image ids
docker image rm `docker images -q`  - to remove all docker images

