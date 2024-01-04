import uk.gov.hmrc.DefaultBuildSettings

val appName = "single-customer-account-stub"

ThisBuild / majorVersion := 0
ThisBuild / scalaVersion := "2.13.12"

lazy val microservice = Project(appName, file("."))
  .enablePlugins(play.sbt.PlayScala, SbtDistributablesPlugin)
  .settings(
    libraryDependencies              ++= AppDependencies.compile ++ AppDependencies.test,
//    // ***************
//    // Use the silencer plugin to suppress warnings
//    scalacOptions += "-P:silencer:pathFilters=routes",
//    libraryDependencies ++= Seq(
//      compilerPlugin("com.github.ghik" % "silencer-plugin" % silencerVersion cross CrossVersion.full),
//      "com.github.ghik" % "silencer-lib" % silencerVersion % Provided cross CrossVersion.full
//    ),
    PlayKeys.playDefaultPort := 8421
  )
//  .configs(IntegrationTest)
//  .settings(integrationTestSettings(): _*)
//  .settings(resolvers += Resolver.jcenterRepo)
//  .settings(CodeCoverageSettings.settings: _*)

lazy val it = project
  .enablePlugins(PlayScala)
  .dependsOn(microservice % "test->test") // the "test->test" allows reusing test code and test dependencies
  .settings(DefaultBuildSettings.itSettings())
