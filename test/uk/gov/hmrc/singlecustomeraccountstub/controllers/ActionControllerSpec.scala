/*
 * Copyright 2023 HM Revenue & Customs
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package uk.gov.hmrc.singlecustomeraccountstub.controllers

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec
import play.api.http.Status
import play.api.libs.json.Json
import play.api.test.Helpers._
import play.api.test.{FakeRequest, Helpers}
import uk.gov.hmrc.singlecustomeraccountstub.data.ActionStubData

class ActionControllerSpec extends AnyWordSpec with Matchers {

  private val fakeRequest = FakeRequest("GET", "/")
  private val controller = new ActionsController(Helpers.stubControllerComponents())
  private val overPaymentNino = "GG012345C"
  private val underPaymentNino = "AA999999A"

  "GET /individuals/actions/tax-calc/NINO/:nino" should {
    "return 200 if stub for over payment taxCalc is found" in {
      val result = controller.getActionData(overPaymentNino)(fakeRequest)
      status(result) shouldBe Status.OK
      contentAsJson(result) shouldBe Json.toJson(ActionStubData.overPayment)
    }

    "return 200 if stub for under payment taxCalc is found" in {
      val result = controller.getActionData(underPaymentNino)(fakeRequest)
      status(result) shouldBe Status.OK
      contentAsJson(result) shouldBe Json.toJson(ActionStubData.underPayment)
    }

    "return 404 if stub for taxCalc is not found" in {
      val result = controller.getActionData("XX123456C")(fakeRequest)
      status(result) shouldBe Status.NOT_FOUND
    }
  }
}
