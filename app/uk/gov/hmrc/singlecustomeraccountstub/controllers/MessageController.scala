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
import org.joda.time.LocalDate
import org.joda.time.format.DateTimeFormat
import play.api.i18n.{I18nSupport, Messages}
import play.api.libs.json.Json
import play.api.mvc.{Action, AnyContent, ControllerComponents}
import play.twirl.api.{Html, HtmlFormat}
import uk.gov.hmrc.play.bootstrap.backend.controller.BackendController
import uk.gov.hmrc.singlecustomeraccountstub.data.BasicStubDataObjs
import uk.gov.hmrc.singlecustomeraccountstub.data.messages.MessageListItem
import uk.gov.hmrc.singlecustomeraccountstub.data.messages.html.ListPartial

import javax.inject.{Inject, Singleton}
import scala.concurrent.{ExecutionContext, Future}
import uk.gov.hmrc.play.partials.HtmlPartial
import uk.gov.hmrc.singlecustomeraccountstub.config.AppConfig
import uk.gov.hmrc.singlecustomeraccountstub.models.{MessageCount, MessageCountResponse}

@Singleton()
class MessageController @Inject()(cc: ControllerComponents)(implicit val appConfig: AppConfig , ec : ExecutionContext)
  extends BackendController(cc) with I18nSupport {


  def getMessageList: Action[AnyContent] = Action { implicit request =>

    val subject = "Reminder to file a Self Assessment return"
    val mm = Seq(MessageListItem("test",subject,"22 November 2022"))
    val html = ListPartial(appConfig.msgUrl ,mm, Some("test"))
    Ok(html.toString())
    }
  def getMessage: Action[AnyContent] = Action { implicit request =>
    Ok(Html(BasicStubDataObjs.messageList))
  }

  //TODO save in mongo
//  def postMessage: Action[AnyContent] = Action { implicit request =>
//    Ok(Html(BasicStubDataObjs.messageList))
//  }

  def getMessageCount(countOnly: String): Action[AnyContent] = Action { implicit request =>
    Ok(Json.toJson(MessageCountResponse(MessageCount(1,1))))
  }

}
