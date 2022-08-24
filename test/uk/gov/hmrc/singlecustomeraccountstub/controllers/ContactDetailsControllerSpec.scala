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

class ContactDetailsControllerSpec extends AnyWordSpec with Matchers {

  private val fakeRequest = FakeRequest("GET", "/")
  private val controller = new ContactDetailsController(Helpers.stubControllerComponents())
  private val validNino = "AA999999A"

  "GET /individuals/details/contact/nino/:nino" should {
    "return 200 if stub for NiNo is found" in {
      val result = controller.getContactDetails(validNino)(fakeRequest)
      status(result) shouldBe Status.OK
      contentAsJson(result) shouldBe Json.toJson(BasicStubDataObjs.contactDetails)
    }

    "return 404 if stub for NiNo is not found" in {
      val result = controller.getContactDetails("XX123456C")(fakeRequest)
      status(result) shouldBe Status.NOT_FOUND
    }
  }
}
