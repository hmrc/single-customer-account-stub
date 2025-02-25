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

import play.api.libs.json.Json
import play.api.mvc.{Action, AnyContent, ControllerComponents}
import uk.gov.hmrc.play.bootstrap.backend.controller.BackendController
import uk.gov.hmrc.singlecustomeraccountstub.data.ActivitiesStubData
import uk.gov.hmrc.singlecustomeraccountstub.models.ErrorResponses

import javax.inject.{Inject, Singleton}
import scala.concurrent.Future

@Singleton()
class ActivitiesController @Inject() (cc: ControllerComponents) extends BackendController(cc) {

  def getTaxCalcData(nino: String, fields: Option[String] = None): Action[AnyContent] = Action.async {
    implicit request =>
      nino match {
        case "GG012345C" => Future.successful(Ok(Json.toJson(ActivitiesStubData.taxCalc)))
        case _           => Future.successful(ErrorResponses.notFound)
      }
  }

  def getTaxCodeChangeData(nino: String, fields: Option[String] = None): Action[AnyContent] = Action.async {
    implicit request =>
      nino match {
        case "GG012345C" => Future.successful(Ok(Json.toJson(ActivitiesStubData.taxCodeChange)))
        case _           => Future.successful(ErrorResponses.notFound)
      }
  }

  def getChildBenefitData(nino: String, fields: Option[String] = None): Action[AnyContent] = Action.async {
    implicit request =>
      nino match {
        case "GG012345C" => Future.successful(Ok(Json.toJson(ActivitiesStubData.childBenefit)))
        case _           => Future.successful(ErrorResponses.notFound)
      }
  }

  def getPayeIncomeData(nino: String, fields: Option[String] = None): Action[AnyContent] = Action.async {
    implicit request =>
      nino match {
        case "GG012345C" => Future.successful(Ok(Json.toJson(ActivitiesStubData.payeIncome)))
        case _           => Future.successful(ErrorResponses.notFound)
      }
  }

  def getUnderpaymentStatus(nino: String, taxYear: String): Action[AnyContent] = Action { implicit request =>
    nino match {
      case "GG012345C" => if (taxYear == "2021-22") Ok else BadRequest
      case _           => ErrorResponses.notFound
    }
  }

  def getRepaymentStatus(nino: String): Action[AnyContent] = Action { implicit request =>
    nino match {
      case "GG012345C" => Ok
      case _           => ErrorResponses.notFound
    }
  }

  def getTaxCalcReconciliation(nino: String, startTaxYear: String, endTaxYear: String): Action[AnyContent] = Action {
    implicit request =>
      nino match {
        case "GG012345C" => Ok(Json.toJson(ActivitiesStubData.taxCalcReconciliation))
        case _           => ErrorResponses.notFound
      }
  }
}
