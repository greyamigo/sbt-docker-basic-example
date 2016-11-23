# sbt-docker-basic-example
A basic example on sbt native packager's docker plugin / side


On your sbt console run this command to test publishing to local

`docker:publishLocal`

Verify the process and to see if the image is indeed created by executing: 

`docker images`

you should see 

`sbt-docker-basic-example     1.0                 <something>        <some time> ago      <some size>`


You can run it by this command

`docker run -it sbt-docker-basic-example:1.0`

which should give you this output

`Hello, world! I am Alive`
