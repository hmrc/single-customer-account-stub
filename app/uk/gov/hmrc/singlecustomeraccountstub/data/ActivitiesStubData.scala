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
      url = "www.tax.service.gov.uk/check-income-tax/tax-code-change/tax-code-comparison"),
  )

  val taxCodeChange = Seq(
    CapabilityDetails(
      nino = Nino(true, Some("GG012345C")),
      date = LocalDate.now.minusMonths(1).minusDays(1),
      descriptionContent = "Your tax code has changed - 1",
      url = "www.tax.service.gov.uk/check-income-tax/tax-code-change/tax-code-comparison"),
    CapabilityDetails(
      nino = Nino(true, Some("GG012345C")),
      date = LocalDate.now.minusMonths(2),
      descriptionContent = "Your tax code has changed - 2",
      url = "www.tax.service.gov.uk/check-income-tax/tax-code-change/tax-code-comparison"),
    CapabilityDetails(
      nino = Nino(true, Some("GG012345C")),
      date = LocalDate.now.minusMonths(3).plusDays(1),
      descriptionContent = "Your tax code has changed - 3",
      url = "www.tax.service.gov.uk/check-income-tax/tax-code-change/tax-code-comparison"),
    CapabilityDetails(
      nino = Nino(true, Some("GG012345C")),
      date = LocalDate.now.withMonth(4).withDayOfMonth(5),
      descriptionContent = "Your tax code has changed - 4",
      url = "www.tax.service.gov.uk/check-income-tax/tax-code-change/tax-code-comparison"),
    CapabilityDetails(
      nino = Nino(true, Some("GG012345C")),
      date = LocalDate.now.withMonth(4).withDayOfMonth(6),
      descriptionContent = "Your tax code has changed - 5",
      url = "www.tax.service.gov.uk/check-income-tax/tax-code-change/tax-code-comparison"),
    CapabilityDetails(
      nino = Nino(true, Some("GG012345C")),
      date = LocalDate.now.withMonth(4).withDayOfMonth(7),
      descriptionContent = "Your tax code has changed - 6",
      url = "www.tax.service.gov.uk/check-income-tax/tax-code-change/tax-code-comparison"),
    CapabilityDetails(
      nino = Nino(true, Some("GG012345C")),
      date = LocalDate.now,
      descriptionContent = "Your tax code has changed - 7",
      url = "www.tax.service.gov.uk/check-income-tax/tax-code-change/tax-code-comparison"),
  )

  val childBenefit = Seq(
    CapabilityDetails(
      nino = Nino(true, Some("GG012345C")),
      date = LocalDate.now.minusMonths(1).minusDays(1),
      descriptionContent = "HMRC paid you Child Benefit",
      url = "www.tax.service.gov.uk/check-income-tax/tax-code-change/tax-code-comparison"),
    CapabilityDetails(
      nino = Nino(true, Some("GG012345C")),
      date = LocalDate.now.minusMonths(2),
      descriptionContent = "HMRC paid you Child Benefit",
      url = "www.tax.service.gov.uk/check-income-tax/tax-code-change/tax-code-comparison"),
    CapabilityDetails(
      nino = Nino(true, Some("GG012345C")),
      date = LocalDate.now.minusMonths(3).plusDays(1),
      descriptionContent = "HMRC paid you Child Benefit",
      url = "www.tax.service.gov.uk/check-income-tax/tax-code-change/tax-code-comparison"),
    CapabilityDetails(
      nino = Nino(true, Some("GG012345C")),
      date = LocalDate.now.withMonth(4).withDayOfMonth(5),
      descriptionContent = "HMRC paid you Child Benefit",
      url = "www.tax.service.gov.uk/check-income-tax/tax-code-change/tax-code-comparison"),
    CapabilityDetails(
      nino = Nino(true, Some("GG012345C")),
      date = LocalDate.now.withMonth(4).withDayOfMonth(6),
      descriptionContent = "HMRC paid you Child Benefit",
      url = "www.tax.service.gov.uk/check-income-tax/tax-code-change/tax-code-comparison"),

  )

  val payeIncome = Seq(
    CapabilityDetails(
      nino = Nino(true, Some("GG012345C")),
      date = LocalDate.now.minusMonths(2).minusDays(1),
      descriptionContent = "Central Perk Coffee Ltd paid you PAYE income",
      url = "www.tax.service.gov.uk/check-income-tax/tax-code-change/tax-code-comparison"),
  )

}
