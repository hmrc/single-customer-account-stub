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

    "return 200 if capability detail stub if NiNo is found" in {
      val result = controller.getDesignatoryDetails("GG012345C")(fakeRequest)
      status(result) shouldBe Status.OK
      contentAsJson(result) shouldBe Json.toJson(BasicStubDataObjs.capabilityDataDetail)
    }
  }
}
