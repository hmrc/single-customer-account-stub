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

package uk.gov.hmrc.singlecustomeraccountstub.models

import play.api.libs.functional.syntax.{toFunctionalBuilderOps, unlift}
import play.api.libs.json.{Format, JsPath, Json}

case class IfContactDetails(contactDetails: Option[Seq[IfContactDetail]])

object IfContactDetails {

  implicit val format: Format[IfContactDetails] = Json.format[IfContactDetails]

}

case class IfContactDetail(code: Int, contactType: String, detail: String)

object IfContactDetail {

  implicit val format: Format[IfContactDetail] = Format(
    (
      (JsPath \ "code").read[Int] and
      (JsPath \ "type").read[String] and
      (JsPath \ "detail").read[String]
    )(IfContactDetail.apply _),
    (
      (JsPath \ "code").write[Int] and
      (JsPath \ "type").write[String] and
      (JsPath \ "detail").write[String]
    )(unlift(IfContactDetail.unapply))
  )
}
