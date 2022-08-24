/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.singlecustomeraccountstub.controllers

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec
import play.api.http.Status
import play.api.libs.json.Json
import play.api.test.Helpers._
import play.api.test.{FakeRequest, Helpers}
import uk.gov.hmrc.singlecustomeraccountstub.data.BasicStubDataObjs

class DesignatoryDetailsControllerSpec extends AnyWordSpec with Matchers {

  private val fakeRequest = FakeRequest("GET", "/")
  private val controller = new DesignatoryDetailsController(Helpers.stubControllerComponents())
  private val validNino = "AA999999A"

  "GET /individuals/details/NINO/:nino" should {
    "return 200 if stub for NiNo is found" in {
      val result = controller.getDesignatoryDetails(validNino)(fakeRequest)
      status(result) shouldBe Status.OK
      contentAsJson(result) shouldBe Json.toJson(BasicStubDataObjs.johnResidential)
    }

    "return 404 if stub for NiNo is not found" in {
      val result = controller.getDesignatoryDetails("XX123456C")(fakeRequest)
      status(result) shouldBe Status.NOT_FOUND
    }
  }
}
