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

import play.api.libs.json.{Format, Json}
import uk.gov.hmrc.auth.core.Nino

import java.time.LocalDate

case class IfDesignatoryDetails(details: IfDetails, nameList: IfNameList, addressList: IfAddressList)

object IfDesignatoryDetails {

  implicit val format: Format[IfDesignatoryDetails] = Json.format[IfDesignatoryDetails]

}

case class CapabilityDetails(
  nino: Nino,
  date: LocalDate,
  descriptionContent: String,
  url: String,
  activityHeading: String
)

object CapabilityDetails {

  implicit val format: Format[CapabilityDetails] = Json.format[CapabilityDetails]

}

case class ActionDetails(
  nino: Nino,
  date: LocalDate,
  descriptionContent: String,
  actionDescription: String,
  url: String,
  activityHeading: String
)

object ActionDetails {

  implicit val format: Format[ActionDetails] = Json.format[ActionDetails]

}

case class TaxCodeChangeDetails(
  taxCode: String,
  employerName: String,
  operatedTaxCode: Boolean,
  p2Issued: Boolean,
  startDate: String,
  endDate: String,
  payrollNumber: String,
  pensionIndicator: Boolean,
  primary: Boolean
)

object TaxCodeChangeDetails {

  implicit val format: Format[TaxCodeChangeDetails] = Json.format[TaxCodeChangeDetails]

}

case class TaxCodeChangeData(
  current: TaxCodeChangeDetails,
  previous: TaxCodeChangeDetails
)

object TaxCodeChangeData {

  implicit val format: Format[TaxCodeChangeData] = Json.format[TaxCodeChangeData]

}

case class TaxCodeChangeObject(
  data: TaxCodeChangeData,
  links: Array[String]
)

object TaxCodeChangeObject {

  implicit val format: Format[TaxCodeChangeObject] = Json.format[TaxCodeChangeObject]

}

case class IfDetails(marriageStatusType: Option[Int] = None)

object IfDetails {

  implicit val format: Format[IfDetails] = Json.format[IfDetails]

}

case class IfNameList(name: Seq[IfName])

object IfNameList {

  implicit val format: Format[IfNameList] = Json.format[IfNameList]

}

case class IfName(
  nameSequenceNumber: Option[Int] = None,
  nameType: Option[Int] = None,
  titleType: Option[Int] = None,
  requestedName: Option[String] = None,
  nameStartDate: Option[LocalDate] = None,
  nameEndDate: Option[LocalDate] = None,
  firstForename: Option[String] = None,
  secondForename: Option[String] = None,
  surname: Option[String] = None
)

object IfName {

  implicit val format: Format[IfName] = Json.format[IfName]

}

case class IfAddressList(address: Seq[IfAddress])

object IfAddressList {

  implicit val format: Format[IfAddressList] = Json.format[IfAddressList]

}

case class IfAddress(
  addressSequenceNumber: Option[Int] = None,
  countryCode: Option[Int] = None,
  addressType: Option[Int] = None,
  addressStartDate: Option[LocalDate] = None,
  addressEndDate: Option[LocalDate] = None,
  addressLine1: Option[String] = None,
  addressLine2: Option[String] = None,
  addressLine3: Option[String] = None,
  addressLine4: Option[String] = None,
  addressLine5: Option[String] = None,
  addressPostcode: Option[String] = None
)

object IfAddress {

  implicit val format: Format[IfAddress] = Json.format[IfAddress]

}
