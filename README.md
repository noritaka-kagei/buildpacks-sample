# buildpacks-sample
Java sample application for running on container created by Cloud Native Buildpacks

## Abstract
This sample web application uses Spring Boot.  
The application return value of the response key in a URL parameter.  

## End-point
* \<host\>:\<port\>/parameter
### URL Parameter
|KEY|VALUE|
|:--:|:--:|
|response|any string|


## Examples
### Prerequisite
Confirmed the running of this application in the following environment.

|Software|Version|Note|
|:--:|:--:|:--|
|docker|24.0.0|https://docs.docker.com/engine/install/|
|pack|0.29.0|https://buildpacks.io/docs/tools/pack/|

### Build
Building container image in which Java (web) application is ready to run.
~~~
$ pack build app --path buildpacks-sample --builder paketobuildpacks/builder:full
...
Successfully built image app
~~~

### Run
Start up the application (container) and check communication with the application.
```
$ docker run --rm -d -p 8080:8080 app
$ curl localhost:8080/parameter?response=foo
foo
```

