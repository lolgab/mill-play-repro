import $ivy.`com.lihaoyi::mill-contrib-playlib:$MILL_VERSION`
import mill._, mill.scalalib._, mill.playlib._

object root extends PlayModule with SingleModule {
  def scalaVersion = "2.12.13"
  def playVersion = "2.7.4"
  def twirlVersion = "1.5.1"
  def ivyDeps = super.ivyDeps() ++ Agg(
    ivy"com.typesafe.play::play-guice:${playVersion()}" 
  )
  def scalacOptions = super.scalacOptions() ++ Seq(
    "-feature",
    "-deprecation",
    "-Xfatal-warnings"
  )
  object test extends PlayTests
}
