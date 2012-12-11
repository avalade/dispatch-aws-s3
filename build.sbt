name := "dispatch-aws-s3"

organization := "net.databinder"

version := "0.8.8"

crossScalaVersions := Seq("2.8.1", "2.9.0", "2.9.0-1", "2.9.1")

libraryDependencies <++= scalaVersion { sv => Seq(
  "net.databinder" % "dispatch-core_2.9.1" % "0.8.8",
  "net.databinder" % "dispatch-http_2.9.1" % "0.8.8" % "test->default",
  sv.split('.').toList match {
    case "2" :: "8" :: _ => "org.scala-tools.testing" % "specs_2.8.1" % "1.6.8" % "test"
    case "2" :: "9" :: "1" :: _ => "org.scala-tools.testing" % "specs_2.9.0-1" % "1.6.9" % "test"
    case "2" :: "9" :: _ => "org.scala-tools.testing" % "specs_2.9.1" % "1.6.9" % "test"
    case _ => error("specs not support for scala version %s" format sv)
  }
)}
