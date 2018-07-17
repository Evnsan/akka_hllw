name := "akka-quickstart-scala"

version := "1.0"

scalaVersion := "2.11.12"

lazy val akkaVersion = "2.4.20"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % akkaVersion,
  "com.typesafe.akka" %% "akka-testkit" % akkaVersion,
  "org.scalatest" %% "scalatest" % "3.0.5" % "test"
)



// Required by riemann-java-client
resolvers += "clojars" at "https://clojars.org/repo"

val kamonVersion = "1.0.1"
libraryDependencies ++= Seq(
  "io.kamon"     %% "kamon-core"            % kamonVersion,
  "io.kamon"     %% "kamon-akka-2.4"        % kamonVersion,
  "io.kamon"     %% "kamon-akka-remote-2.4" % kamonVersion,
  "io.kamon"     %% "kamon-riemann" % "1.0.1-69e10e0e926bb365d334ba0c27c93b27abad168f"
)

//enablePlugins(JavaAgent)
//javaAgents += "org.aspectj" % "aspectjweaver" % "1.8.13"
//javaAgents += JavaAgent(
//  "io.kamon" % "sigar-loader" % "1.6.6-rev002",
//  arguments = "kamon.sigar.folder=/tmp/akka_hllw"
//)
