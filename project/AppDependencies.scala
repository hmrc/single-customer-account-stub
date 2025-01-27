import sbt.*

object AppDependencies {

  val playVersion = "play-30"
  val bootstrapPlayVersion = "9.7.0"

  val compile: Seq[ModuleID] = Seq(
    "uk.gov.hmrc" %% s"bootstrap-backend-$playVersion" % bootstrapPlayVersion,
    "uk.gov.hmrc" %% s"play-partials-$playVersion" % "10.0.0"
  )

  val test: Seq[ModuleID] = Seq(
    "uk.gov.hmrc" %% s"bootstrap-test-$playVersion" % bootstrapPlayVersion % Test
  )
}
