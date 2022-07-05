package Scenarios

import io.gatling.core.structure.ChainBuilder
import io.gatling.http.Predef.http
import io.gatling.http.request.builder.HttpRequestBuilder
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

trait SearchFromMainPage {
  def userSearchForBook(): ChainBuilder {

  }
}
