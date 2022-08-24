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

/**
 * Data sourced from schemas for Retrieve Individual’s Designatory Details and API#1684 Get Individual Contact Details
 * IF APIs from https://admin.tax.service.gov.uk/api-catalogue/
 */
object BasicStubData {

  val designatoryData = """{
                        |  "details": {
                        |    "nino": "QQ123456",
                        |    "ninoSuffix": "C",
                        |    "accountStatusType": 0,
                        |    "sex": "M",
                        |    "dateOfEntry": "1978-12-17",
                        |    "dateOfBirth": "1975-02-10",
                        |    "dateOfBirthStatus": 1,
                        |    "dateOfDeath": "2018-08-09",
                        |    "dateOfDeathStatus": 2,
                        |    "dateOfRegistration": "1976-01-01",
                        |    "registrationType": 8,
                        |    "adultRegSerialNumber": "25673ASN",
                        |    "cesaAgentIdentifier": "SDGH/4",
                        |    "cesaAgentClientReference": "DIGBY JONES",
                        |    "permanentTSuffixCaseIndicator": 0,
                        |    "currOptimisticLock": 94,
                        |    "liveCapacitorInd": 0,
                        |    "liveAgentInd": 0,
                        |    "ntTaxCodeInd": 0,
                        |    "mergeStatus": 0,
                        |    "marriageStatusType": 4,
                        |    "crnIndicator": 0
                        |  },
                        |  "nameList": {
                        |    "name": [
                        |      {
                        |        "nameSequenceNumber": 1,
                        |        "nameType": 1,
                        |        "titleType": 1,
                        |        "requestedName": "Johnny",
                        |        "nameStartDate": "1996-12-28",
                        |        "nameEndDate": "2017-03-31",
                        |        "otherTitle": "MR S F BRAINS",
                        |        "honours": "BSc, MA, NUMPTY",
                        |        "firstForename": "John",
                        |        "secondForename": "X",
                        |        "surname": "Johnson"
                        |      }
                        |    ]
                        |  },
                        |  "addressList": {
                        |    "address": [
                        |      {
                        |        "addressSequenceNumber": 2,
                        |        "addressSource": 4,
                        |        "countryCode": 1,
                        |        "addressType": 1,
                        |        "addressStatus": 0,
                        |        "addressStartDate": "2003-04-30",
                        |        "addressEndDate": "2009-12-31",
                        |        "addressLastConfirmedDate": "2003-04-30",
                        |        "vpaMail": 254,
                        |        "deliveryInfo": "THROUGH THE LETTERBOX",
                        |        "pafReference": "NO IDEA",
                        |        "addressLine1": "1 Home Road",
                        |        "addressLine2": "Home Town",
                        |        "addressLine3": "Home Region",
                        |        "addressLine4": "Home Area",
                        |        "addressLine5": "Home Shire",
                        |        "addressPostcode": "XX77 6YY"
                        |      },
                        |      {
                        |        "addressSequenceNumber": 2,
                        |        "addressSource": 4,
                        |        "countryCode": 1,
                        |        "addressType": 2,
                        |        "addressStatus": 0,
                        |        "addressStartDate": "2003-04-30",
                        |        "addressEndDate": "2009-12-31",
                        |        "addressLastConfirmedDate": "2003-04-30",
                        |        "vpaMail": 254,
                        |        "deliveryInfo": "THROUGH THE LETTERBOX",
                        |        "pafReference": "NO IDEA",
                        |        "addressLine1": "2 Correspondence Street",
                        |        "addressLine2": "Correspondence Town",
                        |        "addressLine3": "Correspondence Region",
                        |        "addressLine4": "Correspondence Area",
                        |        "addressLine5": "Correspondence Shire",
                        |        "addressPostcode": "XX77 6YY"
                        |      }
                        |    ]
                        |  },
                        |  "indicators": {
                        |    "manualCodingInd": 0,
                        |    "manualCodingReason": 10,
                        |    "manualCodingOther": "JUST BECAUSE",
                        |    "manualCorrInd": 0,
                        |    "manualCorrReason": "A MANUAL CODING REASON ... OR TWO",
                        |    "additionalNotes": "SOME ADDITIONAL NOTES",
                        |    "deceasedInd": 1,
                        |    "s128Ind": 0,
                        |    "noAllowInd": 0,
                        |    "eeaCmnwthInd": 0,
                        |    "noRepaymentInd": 0,
                        |    "saLinkInd": 0,
                        |    "noATSInd": 0,
                        |    "taxEqualBenInd": 0,
                        |    "p2ToAgentInd": 0,
                        |    "digitallyExcludedInd": 0,
                        |    "bankruptcyInd": 0,
                        |    "bankruptcyFiledDate": "2018-04-05",
                        |    "utr": "9384/38TEN",
                        |    "audioOutputInd": 0,
                        |    "welshOutputInd": 0,
                        |    "largePrintOutputInd": 0,
                        |    "brailleOutputInd": 0,
                        |    "specialistBusinessArea": 16,
                        |    "saStartYear": "1992/93",
                        |    "saFinalYear": "2017",
                        |    "digitalP2Ind": 1
                        |  },
                        |  "residencyList": {
                        |    "residency": [
                        |      {
                        |        "residencySequenceNumber": 12345,
                        |        "dateLeavingUK": "2018-07-22",
                        |        "dateReturningUK": "2052-04-05",
                        |        "residencyStatusFlag": 0
                        |      }
                        |    ]
                        |  }
                        |}""".stripMargin

  val contactData = """{
                   |  "details": {
                   |    "instanceId": 2347796,
                   |    "updatedTimestamp": "2020-08-18T09:23:54.23Z",
                   |    "nino": "QQ123456C",
                   |    "ninoStatus": "UNVERIFIED",
                   |    "trn": "67B46678",
                   |    "name": {
                   |      "title": "MR",
                   |      "initials": "F C",
                   |      "firstName": "Fred",
                   |      "middleName": "Cecil",
                   |      "lastName": "Bloggs",
                   |      "honours": "BSc (Hons)"
                   |    },
                   |    "gender": "M",
                   |    "dateOfBirth": "1928-09-24",
                   |    "deceased": "Y",
                   |    "dateOfDeath": "2020-08-01",
                   |    "orgUnitInstance": 546557688,
                   |    "capacitorInstanceId": 1743843
                   |  },
                   |  "interests": [
                   |    {
                   |      "code": 17,
                   |      "type": "DEPARTMENT OF WORK AND PENSIONS",
                   |      "reference": "BA8349-78H",
                   |      "reason": "Applied for AA",
                   |      "startDateTime": "2019-11-30T16:23:59.59Z"
                   |    },
                   |    {
                   |      "code": 22,
                   |      "type": "CHILD BENEFIT SYSTEM",
                   |      "reference": "Daughter Annabel",
                   |      "reason": "Under 18",
                   |      "startDateTime": "2018-01-01T00:00:00.00Z"
                   |    }
                   |  ],
                   |  "contactDetails": [
                   |    {
                   |      "code": 9,
                   |      "type": "MOBILE TELEPHONE",
                   |      "detail": "07123 987654"
                   |    },
                   |    {
                   |      "code": 7,
                   |      "type": "DAYTIME TELEPHONE",
                   |      "detail": "01613214567"
                   |    },
                   |    {
                   |      "code": 8,
                   |      "type": "EVENING TELEPHONE",
                   |      "detail": "01619873210"
                   |    },
                   |    {
                   |      "code": 11,
                   |      "type": "PRIMARY E-MAIL",
                   |      "detail": "fred.blogs@hotmail.com"
                   |    }
                   |  ],
                   |  "preferences": [
                   |    {
                   |      "code": 3,
                   |      "type": "OUTPUT WELSH"
                   |    },
                   |    {
                   |      "code": 5,
                   |      "type": "OUTPUT LARGE PRINT"
                   |    }
                   |  ],
                   |  "residences": [
                   |    {
                   |      "statusCode": "1",
                   |      "status": "VERIFIED",
                   |      "typeCode": 14,
                   |      "type": "NOMINATED",
                   |      "deliveryInfo": "Low level letter box",
                   |      "retLetterServ": "N",
                   |      "addressCode": "1",
                   |      "addressType": "UK",
                   |      "address": {
                   |        "line1": "24 Trinity Street",
                   |        "line2": "Dawley Bank",
                   |        "line3": "Telford",
                   |        "line4": "Shropshire",
                   |        "line5": "UK",
                   |        "postcode": "TF3 4ER"
                   |      },
                   |      "houseId": "24",
                   |      "homeCountry": "ENGLAND",
                   |      "otherCountry": "FRANCE",
                   |      "deadLetterOfficeDate": "2020-07-31",
                   |      "startDateTime": "2018-02-28T12:00:00.00Z",
                   |      "noLongerUsed": "N"
                   |    },
                   |    {
                   |      "statusCode": "3",
                   |      "status": "AS INPUT",
                   |      "typeCode": 13,
                   |      "type": "BASE",
                   |      "deliveryInfo": "Low level letter box",
                   |      "retLetterServ": "Y",
                   |      "addressCode": "2",
                   |      "addressType": "NON-UK",
                   |      "address": {
                   |        "line1": "La Petite Maison",
                   |        "line2": "Rue de Bastille",
                   |        "line3": "Vieux Ville",
                   |        "line4": "Dordogne",
                   |        "line5": "France"
                   |      },
                   |      "houseId": "1",
                   |      "homeCountry": "FRANCE",
                   |      "otherCountry": "ENGLAND",
                   |      "deadLetterOfficeDate": "2018-01-31",
                   |      "startDateTime": "1978-02-28T12:00:00.00Z",
                   |      "noLongerUsed": "Y"
                   |    }
                   |  ]
                   |}""".stripMargin

}
