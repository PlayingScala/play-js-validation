import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

    val appName         = "mini-forms"
    val appVersion      = "1.0"

    val appDependencies = Seq(
      "EPFL" %% "play-js-validation" % "0.2-SNAPSHOT"
    )

    val main = play.Project(appName, appVersion, appDependencies).settings(
      scalacOptions ++= Seq("-deprecation", "-unchecked", "-Xexperimental", "-Yvirtualize"),
      scalaOrganization := "org.scala-lang.virtualized"
    )

}
