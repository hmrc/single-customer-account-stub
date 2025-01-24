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

import play.api.libs.json.{JsValue, Json}
import play.api.mvc.Results.NotFound

case class Failure(code: String, reason: String)

object Failure {

  implicit val format = Json.format[Failure]

}

case class ErrorResponse(failures: Seq[Failure])

object ErrorResponse {

  implicit val format = Json.format[ErrorResponse]

}

object ErrorResponses {

  private def createResponse(code: String, reason: String): JsValue =
    Json.toJson(ErrorResponse(Seq(Failure(code, reason))))

  val notFound = NotFound(
    createResponse(
      "IDENTIFIER_NOT_FOUND",
      "The remote endpoint has indicated that identifier supplied can not be found."
    )
  )

}
