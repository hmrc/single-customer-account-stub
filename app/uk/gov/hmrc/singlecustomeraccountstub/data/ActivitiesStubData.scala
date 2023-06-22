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

package uk.gov.hmrc.singlecustomeraccountstub.data

import uk.gov.hmrc.auth.core.Nino
import uk.gov.hmrc.singlecustomeraccountstub.models.CapabilityDetails

import java.time.LocalDate

object ActivitiesStubData {

  val taxCalc = Seq(
    CapabilityDetails(
      nino = Nino(true, Some("GG012345C")),
      date = LocalDate.now.minusMonths(2).minusDays(1),
      descriptionContent = "Your tax calculation for the 2022-2023 is now available",
      url = "www.tax.service.gov.uk/check-income-tax/tax-code-change/tax-code-comparison",
      activityHeading = "Your tax calculation")
  )

  val taxCodeChange = Seq(
    CapabilityDetails(
      nino = Nino(true, Some("GG012345C")),
      date = LocalDate.now.minusMonths(1).minusDays(1),
      descriptionContent = "Your tax code has changed - 1",
      url = "www.tax.service.gov.uk/check-income-tax/tax-code-change/tax-code-comparison",
      activityHeading = "Latest Tax code change"),
    CapabilityDetails(
      nino = Nino(true, Some("GG012345C")),
      date = LocalDate.now.minusMonths(2),
      descriptionContent = "Your tax code has changed - 2",
      url = "www.tax.service.gov.uk/check-income-tax/tax-code-change/tax-code-comparison",
      activityHeading = "Latest Tax code change"),
    CapabilityDetails(
      nino = Nino(true, Some("GG012345C")),
      date = LocalDate.now.minusMonths(3).plusDays(1),
      descriptionContent = "Your tax code has changed - 3",
      url = "www.tax.service.gov.uk/check-income-tax/tax-code-change/tax-code-comparison",
      activityHeading = "Latest Tax code change"),
    CapabilityDetails(
      nino = Nino(true, Some("GG012345C")),
      date = LocalDate.now.withMonth(4).withDayOfMonth(5),
      descriptionContent = "Your tax code has changed - 4",
      url = "www.tax.service.gov.uk/check-income-tax/tax-code-change/tax-code-comparison",
      activityHeading = "Latest Tax code change"),
    CapabilityDetails(
      nino = Nino(true, Some("GG012345C")),
      date = LocalDate.now.withMonth(4).withDayOfMonth(6),
      descriptionContent = "Your tax code has changed - 5",
      url = "www.tax.service.gov.uk/check-income-tax/tax-code-change/tax-code-comparison",
      activityHeading = "Latest Tax code change"),
    CapabilityDetails(
      nino = Nino(true, Some("GG012345C")),
      date = LocalDate.now.withMonth(4).withDayOfMonth(7),
      descriptionContent = "Your tax code has changed - 6",
      url = "www.tax.service.gov.uk/check-income-tax/tax-code-change/tax-code-comparison",
      activityHeading = "Latest Tax code change"),
    CapabilityDetails(
      nino = Nino(true, Some("GG012345C")),
      date = LocalDate.now,
      descriptionContent = "Your tax code has changed - 7",
      url = "www.tax.service.gov.uk/check-income-tax/tax-code-change/tax-code-comparison",
      activityHeading = "Latest Tax code change")
  )

  val childBenefit = Seq(
    CapabilityDetails(
      nino = Nino(true, Some("GG012345C")),
      date = LocalDate.now.minusMonths(1).minusDays(1),
      descriptionContent = "HMRC paid you child benefit",
      url = "www.tax.service.gov.uk/check-income-tax/tax-code-change/tax-code-comparison",
      activityHeading = "Recent Child Benefit payments"),
    CapabilityDetails(
      nino = Nino(true, Some("GG012345C")),
      date = LocalDate.now.minusMonths(2),
      descriptionContent = "HMRC paid you child benefit",
      url = "www.tax.service.gov.uk/check-income-tax/tax-code-change/tax-code-comparison",
      activityHeading = "Recent Child Benefit payments"),
    CapabilityDetails(
      nino = Nino(true, Some("GG012345C")),
      date = LocalDate.now.minusMonths(3).plusDays(1),
      descriptionContent = "HMRC paid you child benefit",
      url = "www.tax.service.gov.uk/check-income-tax/tax-code-change/tax-code-comparison",
      activityHeading = "Recent Child Benefit payments"),
    CapabilityDetails(
      nino = Nino(true, Some("GG012345C")),
      date = LocalDate.now.withMonth(4).withDayOfMonth(5),
      descriptionContent = "HMRC paid you child benefit",
      url = "www.tax.service.gov.uk/check-income-tax/tax-code-change/tax-code-comparison",
      activityHeading = "Recent Child Benefit payments"),
    CapabilityDetails(
      nino = Nino(true, Some("GG012345C")),
      date = LocalDate.now.withMonth(4).withDayOfMonth(6),
      descriptionContent = "HMRC paid you child benefit",
      url = "www.tax.service.gov.uk/check-income-tax/tax-code-change/tax-code-comparison",
      activityHeading = "Recent Child Benefit payments")
  )

  val payeIncome = Seq(
    CapabilityDetails(
      nino = Nino(true, Some("GG012345C")),
      date = LocalDate.now.minusMonths(2).minusDays(1),
      descriptionContent = "Central Perk Coffee Ltd paid you PAYE income",
      url = "www.tax.service.gov.uk/check-income-tax/tax-code-change/tax-code-comparison",
      activityHeading = "Your PAYE income for the current tax year")
  )

  val taxCalcReconciliation =
    """
      |{
      |    "nino": "AB234567",
      |    "taxYears":
      |[
      |{
      |    "taxYear": 2016,
      |    "reconciliations":
      |[
      |{
      |    "reconciliationId": 13,
      |    "reconciliationStatus": 8,
      |    "cumulativeAmount": 90.55,
      |    "taxLiabilityAmount": 1300.75,
      |    "taxPaidAmount": 1210.2,
      |    "reconciliationTimeStamp": "2017-07-30 12:34:56",
      |    "p800Status": 3,
      |    "collectionMethod": 31,
      |    "previousReconciliationId": 12,
      |    "multiYearRecIndicator": false,
      |    "p800Reasons":
      |
      |[
      |{
      |    "reasonType": 9,
      |    "reasonCode": 45,
      |    "estimatedAmount": -123.45,
      |    "actualAmount": -140.75
      |},
      |        {
      |            "reasonType": 9,
      |            "reasonCode": 49,
      |            "estimatedAmount": 454.2,
      |            "actualAmount": 300.2
      |        }
      |    ]
      |},
      |{
      |    "reconciliationId": 12,
      |    "reconciliationStatus": 5,
      |    "cumulativeAmount": 80.55,
      |    "taxLiabilityAmount": 3300.75,
      |    "taxPaidAmount": 3220,
      |    "reconciliationTimeStamp": "2017-07-07 00:00:00",
      |    "p800Status": 4,
      |    "collectionMethod": 31,
      |    "nextReconciliationId": 13,
      |    "multiYearRecIndicator": true,
      |    "p800Reasons":
      |            []
      |        }
      |    ]
      |
      |},
      |{
      |    "taxYear": 2015
      |},
      |{
      |    "taxYear": 2014,
      |    "reconciliations":
      |[
      |{
      |    "reconciliationId": 11,
      |    "cumulativeAmount": 0,
      |    "taxLiabilityAmount": 1300.55,
      |    "taxPaidAmount": 1300.55,
      |    "p800Reasons":
      |[
      |                {
      |                    "estimatedAmount": 0,
      |                    "actualAmount": 0
      |                }
      |            ]
      |        }
      |    ]
      |},
      |{
      |    "taxYear": 2013,
      |    "reconciliations":
      |[
      |{
      |    "reconciliationId": 10,
      |    "reconciliationStatus": 1,
      |    "cumulativeAmount": 0,
      |    "taxLiabilityAmount": 1300.55,
      |    "taxPaidAmount": 1300.55,
      |    "reconciliationTimeStamp": "2014-08-05 23:49:00",
      |    "previousReconciliationId": 9,
      |    "multiYearRecIndicator": false
      |},
      |                {
      |                    "reconciliationId": 9,
      |                    "reconciliationStatus": 2,
      |                    "cumulativeAmount": 5.45,
      |                    "taxLiabilityAmount": 1300.55,
      |                    "taxPaidAmount": 1305.55,
      |                    "reconciliationTimeStamp": "2014-10-11 01:02:03",
      |                    "nextReconciliationId": 10,
      |                    "multiYearRecIndicator": false
      |                }
      |            ]
      |        }
      |    ]
      |
      |}
      |""".stripMargin
}
