name := "dispatch-aws-s3"

organization := "net.databinder"

version := "0.1.2"

scalaVersion := "2.10.0"

crossScalaVersions := Seq("2.9.1", "2.9.2", "2.10.0")

libraryDependencies <++= scalaVersion { sv => Seq(
  "net.databinder" % "dispatch-core_2.9.1" % "0.8.9",
  "net.databinder" % "dispatch-http_2.9.1" % "0.8.9" % "test->default",
  sv.split('.').toList match {
    case "2" :: "8" :: _ => "org.scala-tools.testing" % "specs_2.8.1" % "1.6.8" % "test"
    case "2" :: "9" :: _ => "org.scala-tools.testing" % "specs_2.9.1" % "1.6.9" % "test"
    case "2" :: "10" :: _ => "org.scala-tools.testing" % "specs_2.10" % "1.6.9" % "test"
    case _ => error("specs not support for scala version %s" format sv)
  }
)}
