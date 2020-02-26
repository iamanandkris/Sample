name := "Sample"

version := "0.1"

scalaVersion := "2.13.1"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.6.3",
  "com.typesafe.akka" %% "akka-http"   % "10.1.11",
  "com.typesafe.akka" %% "akka-stream" % "2.6.3",
  "com.lightbend.akka" %% "akka-stream-alpakka-csv" % "1.1.2",
  "ch.qos.logback" % "logback-classic" % "1.1.3" % Runtime,
  "com.typesafe.scala-logging" %% "scala-logging" % "3.9.2",
  "com.github.pureconfig" %% "pureconfig" % "0.12.2",
  "com.typesafe.akka" %% "akka-testkit" % "2.6.3" % Test,
  "com.typesafe.akka" %% "akka-stream-testkit" % "2.6.3" % Test,
  "org.scalactic" %% "scalactic" % "3.1.1",
  "org.scalatest" %% "scalatest" % "3.1.1" % "test"
)

addCompilerPlugin("org.typelevel" %% "kind-projector" % "0.11.0" cross CrossVersion.full)

// if your project uses multiple Scala versions, use this for cross building
addCompilerPlugin("org.typelevel" % "kind-projector" % "0.11.0" cross CrossVersion.full)

// if your project uses both 2.10 and polymorphic lambdas
libraryDependencies ++= (scalaBinaryVersion.value match {
  case "2.10" =>
    compilerPlugin("org.scalamacros" % "paradise" % "2.1.0" cross CrossVersion.full) :: Nil
  case _ =>
    Nil
})
