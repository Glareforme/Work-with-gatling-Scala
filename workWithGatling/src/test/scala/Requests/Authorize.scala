package Requests

import io.gatling.core.Predef.*
import io.gatling.core.session.*
import io.gatling.core.structure.ChainBuilder
import io.gatling.http.Predef.*
import io.gatling.http.request.builder.HttpRequestBuilder

object Authorize {
  def oktaLogin(oktaLoginURL: String): HttpRequestBuilder = {
    http("OKTA GET: /login")
      .get(oktaLoginURL + "/login")
      .queryParam("SigAlg", "${oktaSigAlg}")
      .queryParam("Signature", "${oktaSignature}")
      .queryParam("RelayState", "${oktaRelayState}")
      .queryParam("SAMLRequest", "${oktaSAMLRequest}")
      .check(
        regex("""okta_key%3D(.+?)";""").find.saveAs("okta_key")
      )
  }
}
