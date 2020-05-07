name := """play_scala_mongo_seed"""
organization := "com.example"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

//scala Version : 2.12.x
scalaVersion := "2.12.1"

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "5.0.0" % Test

// Adds Json utils
libraryDependencies += "com.typesafe.play" %% "play-json" % "2.8.1"

// Adds driver for MongoDB
libraryDependencies += "cn.playscala" % "play-mongo_2.12" % "0.3.0"
addCompilerPlugin("org.scalamacros" % "paradise" % "2.1.0" cross CrossVersion.full)

// Adds additional packages into Twirl
//TwirlKeys.templateImports += "com.example.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "com.example.binders._"
