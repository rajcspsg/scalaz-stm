name := "scalaz-stm"

scalaVersion := "2.12.6"

version in ThisBuild := "0.1.0-SNAPSHOT"

dynverSonatypeSnapshots in ThisBuild := true

addCommandAlias("fmt", "all scalafmtSbt scalafmt test:scalafmt")
addCommandAlias("check", "all scalafmtSbtCheck scalafmtCheck test:scalafmtCheck")

lazy val root =
  (project in file("."))
    .settings(
      name := "scalaz-stm",
      libraryDependencies ++= {

        val Zio = Seq(
          "org.scalaz" %% "scalaz-zio" % "0.1-SNAPSHOT"
        )

        val Specs2 = Seq(
          "org.specs2" %% "specs2-core"          % "4.3.2" % Test,
          "org.specs2" %% "specs2-scalacheck"    % "4.3.2" % Test,
          "org.specs2" %% "specs2-matcher-extra" % "4.3.2" % Test
        )

        Zio ++ Specs2
      }
    )