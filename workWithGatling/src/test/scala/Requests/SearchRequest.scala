package Requests

import io.gatling.http.Predef.http
import io.gatling.http.request.builder.HttpRequestBuilder
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

object SearchRequest {
  val searchOnMainPage = exec(http("").get("das") )

}
