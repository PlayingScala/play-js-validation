name := "play-js-validation"

organization := "EPFL"

version := "0.2-SNAPSHOT"

scalaOrganization := "org.scala-lang.virtualized"

scalaVersion := "2.10.0"

//--- Dependencies

libraryDependencies ++= Seq(
    "org.scalatest" %% "scalatest" % "1.9.1" % "test",
    "EPFL" %% "js-scala" % "0.3-SNAPSHOT",
    "play" %% "play" % "2.1-RC2"
)
    
//--- End of Dependencies

scalacOptions ++= Seq("-deprecation", "-unchecked", "-feature", "-Xexperimental", "-P:continuations:enable", "-Yvirtualize")

//Our tests are not threadsafe so disabling parallel execution for now
parallelExecution in Test := false

// disable publishing of main docs
publishArtifact in (Compile, packageDoc) := false

// continuations
autoCompilerPlugins := true

libraryDependencies <<= (scalaVersion, libraryDependencies) { (ver, deps) =>
    deps :+ compilerPlugin("org.scala-lang.plugins" % "continuations" % ver)
}

scalacOptions += "-P:continuations:enable"
