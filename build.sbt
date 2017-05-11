name := "travis-specs2-html"

organization := "com.github.synesso"

scalaVersion := "2.11.8"

scalacOptions ++= Seq(
  "-Yrangepos",
  "-unchecked",
  "-deprecation",
  "-feature",
  "-language:postfixOps",
  "-encoding",
  "UTF-8",
  "-target:jvm-1.8"
)

libraryDependencies ++= Seq(
  "org.specs2" %% "specs2-core" % "3.8.9" % "test",
  "org.specs2" %% "specs2-html" % "3.8.9" % "test"
)

testOptions in Test += Tests.Argument("html", "console")

