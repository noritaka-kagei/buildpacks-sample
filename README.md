# buildpacks-sample
Java sample application for running on container created by Cloud Native Buildpacks

## Abstract
This sample web application use Spring Boot.  
The application return value of response key in URL parameter.  

## End-point
* \<host\>:\<port\>/parameter
### URL Parameter
|KEY|VALUE|
|:--:|:--:|
|response|any string|


## Examples
### Prerequire
Confirmed the running this application in the following environment.

|Software|Version|Note|
|:--:|:--:|:--|
|docker|24.0.0|https://docs.docker.com/engine/install/|
|pack|0.29.0|https://buildpacks.io/docs/tools/pack/|

### Build
Building container image in which java(web) application is ready to run.
~~~
$ pack build app --path buildpacks-sample --builder paketobuildpacks/builder:full
...
Successfully built image app
~~~

### Run
Start up applicaiton(container) and checking communication with the application.
```
$ docker run --rm -d -p 8080:8080 app
$ curl localhost:8080/parameter?response=foo
foo
```

