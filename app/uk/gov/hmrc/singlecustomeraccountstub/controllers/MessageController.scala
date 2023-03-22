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
import play.api.i18n.I18nSupport
import play.api.libs.json.Json
import play.api.mvc.{Action, AnyContent, ControllerComponents}
import uk.gov.hmrc.play.bootstrap.backend.controller.BackendController
import uk.gov.hmrc.singlecustomeraccountstub.config.AppConfig
import uk.gov.hmrc.singlecustomeraccountstub.models.{MessageCount, MessageCountResponse}

import javax.inject.{Inject, Singleton}

@Singleton()
class MessageController @Inject()(cc: ControllerComponents)(implicit val appConfig: AppConfig)
  extends BackendController(cc) with I18nSupport {

  def getMessageCount(countOnly: String): Action[AnyContent] = Action { implicit request =>
    Ok(Json.toJson(MessageCountResponse(MessageCount(1,1))))
  }

}
