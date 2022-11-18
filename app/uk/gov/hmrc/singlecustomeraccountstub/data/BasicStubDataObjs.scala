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

package uk.gov.hmrc.singlecustomeraccountstub.data

import uk.gov.hmrc.singlecustomeraccountstub.models._

object BasicStubDataObjs {

  val residential = IfAddress(
    addressSequenceNumber = Some(2),
    countryCode = Some(1),
    addressType = Some(1),
    addressLine1 = Some("1 Home Road"),
    addressLine2 = Some("Home Town"),
    addressLine3 = Some("Home Region"),
    addressLine4 = Some("Home Area"),
    addressLine5 = Some("Home Shire"),
    addressPostcode = Some("XX77 6YY")
  )

  val correspondence = IfAddress(
    addressSequenceNumber = Some(3),
    countryCode = Some(1),
    addressType = Some(2),
    addressLine1 = Some("PO Box 42"),
    addressLine2 = Some("Correspondence Town"),
    addressLine3 = Some("Correspondence Region"),
    addressPostcode = Some("XX77 6YY")
  )

  val nameJohn = IfName(
    nameSequenceNumber = Some(1),
    nameType = Some(1),
    titleType = Some(1),
    firstForename = Some("John"),
    secondForename = Some("X"),
    surname = Some("Johnson"),
    requestedName = Some("Johnny")
  )

  val nameJoan = IfName(
    nameSequenceNumber = Some(2),
    titleType = Some(2),
    firstForename = Some("Joan"),
    secondForename = Some("Y"),
    surname = Some("Johnson"),
    requestedName = None
  )

  val nameGordon = IfName(
    nameSequenceNumber = Some(2),
    titleType = Some(6),
    firstForename = Some("Gordon"),
    secondForename = Some("Z"),
    surname = Some("Gordonson"),
    requestedName = Some("Tim")
  )

  val nameStephen = IfName(
    nameSequenceNumber = Some(2),
    titleType = Some(6),
    firstForename = Some("S M"),
    secondForename = Some("X"),
    surname = Some("BOTH"),
    requestedName = Some("Stephen")

  )

  val nameEdward = IfName(
    nameSequenceNumber = Some(2),
    titleType = Some(6),
    firstForename = Some("Edward"),
    secondForename = Some("A"),
    surname = Some("Robertson"),
    requestedName = None

  )

  val johnResidential = IfDesignatoryDetails(
                          details = IfDetails(marriageStatusType = Some(4)),
                          nameList = IfNameList(Seq(nameJohn)),
                          addressList = IfAddressList(Seq(residential)))

  val joanNoFixedAbode = IfDesignatoryDetails(
                          details = IfDetails(marriageStatusType = Some(10)),
                          nameList = IfNameList(Seq(nameJoan)),
                          addressList = IfAddressList(Seq()))

  val gordonResidentialCorrespondence = IfDesignatoryDetails(
                          details = IfDetails(marriageStatusType = Some(1)),
                          nameList = IfNameList(Seq(nameGordon)),
                          addressList = IfAddressList(Seq(residential, correspondence)))
  val stephenSADetail = IfDesignatoryDetails(
                        details = IfDetails(marriageStatusType = Some(1)),
                        nameList = IfNameList(Seq(nameStephen)),
                        addressList = IfAddressList(Seq()))

  val edwardResidentialDetail = IfDesignatoryDetails(
                        details = IfDetails(marriageStatusType = Some(1)),
                        nameList = IfNameList(Seq(nameEdward)),
                        addressList = IfAddressList(Seq()))

  val contactDetails = IfContactDetails(
      contactDetails = Some(Seq(
        IfContactDetail(code = 9, contactType = "MOBILE TELEPHONE", detail = "07123 987654"),
        IfContactDetail(code = 7, contactType = "DAYTIME TELEPHONE", detail = "07123 987654"),
        IfContactDetail(code = 8, contactType = "EVENING TELEPHONE", detail = "07123 987654"),
        IfContactDetail(code = 11, contactType = "PRIMARY E-MAIL", detail = "fred.blogs@hotmail.com")
      )))

  val messageList =
    """{
      "items":
      [
      {
        "id": "543e8c6001000001003e4a9e"
        ,
        "subject": "Your Tax Return"
        ,
        "validFrom": "2013-06-04"
        ,
        "readTime": "2014-05-02T17:17:45.618Z"
        ,
        "sentInError": true
      }
      ,
      {
        "id": "543e8c5f01000001003e4a9c"
        ,
        "subject": "Your Tax Return"
        ,
        "validFrom": "2013-06-04"
        ,
        "sentInError": true
      }
      ],
      "count": {
        "total": 2,
        "unread": 1
      }
    }"""
}
