import uk.gov.hmrc.DefaultBuildSettings

val appName = "single-customer-account-stub"

ThisBuild / majorVersion := 1
ThisBuild / scalaVersion := "3.3.4"

lazy val microservice = Project(appName, file("."))
  .enablePlugins(play.sbt.PlayScala, SbtDistributablesPlugin)
  .settings(
    libraryDependencies ++= AppDependencies.compile ++ AppDependencies.test,
    PlayKeys.playDefaultPort := 8421,
    retrieveManaged := true,
    resolvers ++= Seq(Resolver.jcenterRepo),
    scalacOptions ++= Seq(
      "-feature",
      "-Werror",
      "-language:noAutoTupling",
      "-language:strictEquality",
      "-Wvalue-discard",
      "-Xfatal-warnings",
      "-Wconf:msg=unused import&src=<empty>:s",
      "-Wconf:msg=unused&src=.*RoutesPrefix\\.scala:s",
      "-Wconf:msg=unused&src=.*Routes\\.scala:s",
      "-Wconf:msg=unused&src=.*ReverseRoutes\\.scala:s",
      "-Wconf:msg=unused&src=.*JavaScriptReverseRoutes\\.scala:s",
      "-Wconf:msg=Flag.*repeatedly:s"
    ),
    Test / scalacOptions --= Seq("-language:strictEquality")
  )

lazy val it = project
  .enablePlugins(PlayScala)
  .dependsOn(microservice % "test->test") // the "test->test" allows reusing test code and test dependencies
  .settings(DefaultBuildSettings.itSettings())
