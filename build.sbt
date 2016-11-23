import com.typesafe.sbt.packager.docker.Cmd

name := """sbt-docker-basic-example"""

version := "1.0"

scalaVersion := "2.11.7"

enablePlugins(JavaAppPackaging)

enablePlugins(DockerPlugin)

