import sbt._

object AppDependencies {

  val compile = Seq(
    "uk.gov.hmrc"             %% "bootstrap-backend-play-30"    % "8.1.0",
    "uk.gov.hmrc"             %% s"play-partials-play-30"           % "9.1.0"
  )

  val test = Seq(
    "uk.gov.hmrc"             %% "bootstrap-test-play-30"     % "8.1.0"             % Test
  )
}
