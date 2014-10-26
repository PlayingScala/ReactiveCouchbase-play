name := "n1ql"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  cache,
  ws,
  "org.reactivecouchbase" %% "reactivecouchbase-play" % "0.3"
)

resolvers += "ReactiveCouchbase" at "https://raw.github.com/ReactiveCouchbase/repository/master/snapshots"