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
import play.api.test.Helpers._
import play.api.http.Status
import play.api.libs.json.Json
import play.api.test.{FakeRequest, Helpers}
import uk.gov.hmrc.singlecustomeraccountstub.data.ActivitiesStubData

class ActivitiesControllerSpec extends AnyWordSpec with Matchers {
  private val fakeRequest = FakeRequest("GET", "/")
  private val controller = new ActivitiesController(Helpers.stubControllerComponents())
  private val validNino = "GG012345C"

  "GET /individuals/activities/tax-calc/NINO/:nino" should {
    "return 200 if stub for taxCalc is found" in {
      val result = controller.getTaxCalcData(validNino)(fakeRequest)
      status(result) shouldBe Status.OK
      contentAsJson(result) shouldBe Json.toJson(ActivitiesStubData.taxCalc)
    }

    "return 404 if stub for taxCalc is not found" in {
      val result = controller.getTaxCalcData("XX123456C")(fakeRequest)
      status(result) shouldBe Status.NOT_FOUND
    }
  }

  "/individuals/activities/tax-code-change/NINO/:nino" should {
    "return 200 if stub for tax code change is found" in {
      val result = controller.getTaxCodeChangeData(validNino)(fakeRequest)
      status(result) shouldBe Status.OK
      contentAsJson(result) shouldBe Json.toJson(ActivitiesStubData.taxCodeChange)
    }

    "return 404 if stub for tax code change is not found" in {
      val result = controller.getTaxCodeChangeData("XX123456C")(fakeRequest)
      status(result) shouldBe Status.NOT_FOUND
    }
  }

  "GET /individuals/activities/child-benefit/NINO/:nino " should {
    "return 200 if stub for child benefit is found" in {
      val result = controller.getChildBenefitData(validNino)(fakeRequest)
      status(result) shouldBe Status.OK
      contentAsJson(result) shouldBe Json.toJson(ActivitiesStubData.childBenefit)
    }

    "return 404 if stub for child benefit is not found" in {
      val result = controller.getChildBenefitData("XX123456C")(fakeRequest)
      status(result) shouldBe Status.NOT_FOUND
    }
  }

  "GET /individuals/activities/paye-income/NINO/:nino" should {
    "return 200 if stub for paye income is found" in {
      val result = controller.getPayeIncomeData(validNino)(fakeRequest)
      status(result) shouldBe Status.OK
      contentAsJson(result) shouldBe Json.toJson(ActivitiesStubData.payeIncome)
    }

    "return 404 if stub for paye income is not found" in {
      val result = controller.getPayeIncomeData("XX123456C")(fakeRequest)
      status(result) shouldBe Status.NOT_FOUND
    }
  }

}
