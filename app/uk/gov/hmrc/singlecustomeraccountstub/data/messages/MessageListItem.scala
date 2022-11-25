/*
 * Copyright 2022 HM Revenue & Customs
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

// Copyright (C) 2011-2019 the original author or authors.
// See the LICENCE.txt file distributed with this work for additional
// information regarding copyright ownership.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at

// http://www.apache.org/licenses/LICENSE-2.0

// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package uk.gov.hmrc.singlecustomeraccountstub.data.messages

import org.joda.time.{DateTime, LocalDate}
import play.api.libs.json._
import uk.gov.hmrc.http.controllers.RestFormats

case class MessageListItem(
  id: String,
  subject: String,
  validFrom: String,
  taxpayerName: Option[TaxpayerName] = None,
  readTime: Option[DateTime] = None,
  sentInError: Boolean = false,
  replyTo: Option[String] = None,
  messageType: Option[String] = None,
  counter: Option[Int] = None)
object MessageListItem {
  implicit val jodaFormat: Format[LocalDate] = RestFormats.localDateFormats
  implicit val dateTimeFormat: Format[DateTime] = RestFormats.dateTimeFormats
  implicit val taxpayerNameFmt: Format[TaxpayerName] = Json.format[TaxpayerName]
  implicit val messageListItemFormat: Format[MessageListItem] = Json.format[MessageListItem]
}
