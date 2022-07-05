package Setup

import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._


object Environment {
val baseSetup = http
  .baseUrl("https://perf-www.cengage/")
}
