import sbt._

object AppDependencies {

  val compile = Seq(
    "uk.gov.hmrc"             %% "bootstrap-backend-play-28"    % "7.15.0",
    "uk.gov.hmrc"             %% "play-partials"                % "8.4.0-play-28"
  )

  val test = Seq(
    "uk.gov.hmrc"             %% "bootstrap-test-play-28"     % "7.15.0"             % "test, it"
  )
}
