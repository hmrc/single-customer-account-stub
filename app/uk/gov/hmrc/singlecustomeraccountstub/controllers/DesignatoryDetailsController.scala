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
import uk.gov.hmrc.singlecustomeraccountstub.data.BasicStubDataObjs
import uk.gov.hmrc.singlecustomeraccountstub.models.ErrorResponses

import javax.inject.{Inject, Singleton}
import scala.concurrent.Future

@Singleton()
class DesignatoryDetailsController @Inject() (cc: ControllerComponents) extends BackendController(cc) {

  def getDesignatoryDetails(nino: String, fields: Option[String] = None): Action[AnyContent] = Action.async {
    implicit request =>
      nino match {
        case "AA999999A" => Future.successful(Ok(Json.toJson(BasicStubDataObjs.johnResidential)))
        case "AA999999B" => Future.successful(Ok(Json.toJson(BasicStubDataObjs.joanNoFixedAbode)))
        case "AA999999C" => Future.successful(Ok(Json.toJson(BasicStubDataObjs.gordonResidentialCorrespondence)))
        case "AA999999D" => Future.successful(Ok(Json.toJson(BasicStubDataObjs.stephenSADetail)))
        case "HT009413A" => Future.successful(Ok(Json.toJson(BasicStubDataObjs.edwardResidentialDetail)))
        case "ER872414B" => Future.successful(Ok(Json.toJson(BasicStubDataObjs.andrewResidentialDetail)))
        case _           => Future.successful(ErrorResponses.notFound)
      }
  }
}
