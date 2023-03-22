import play.core.PlayVersion
import play.sbt.PlayImport._
import sbt.Keys.libraryDependencies
import sbt._

object AppDependencies {

  val compile = Seq(
    "uk.gov.hmrc"       %% "url-builder"                % "3.8.0-play-28",
    "uk.gov.hmrc"             %% "bootstrap-backend-play-28"  % "7.15.0",
    "uk.gov.hmrc"         %% "play-partials"                % "8.4.0-play-28",
    "uk.gov.hmrc.mongo" %% "hmrc-mongo-play-28" % "0.70.0"
  )

  val test = Seq(
    "uk.gov.hmrc"             %% "bootstrap-test-play-28"     % "7.15.0"             % "test, it",
    "uk.gov.hmrc.mongo" %% "hmrc-mongo-test-play-28" % "0.70.0" % Test
  )
}
