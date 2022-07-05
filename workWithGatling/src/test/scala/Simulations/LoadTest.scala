package Simulations

import Setup.Environment

import scala.concurrent.duration.*
import io.gatling.core.Predef.*
import io.gatling.http.Predef.*

class LoadTest extends Simulation{
  setUp().protocols(Environment)
}
