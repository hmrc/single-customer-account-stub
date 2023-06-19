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
import uk.gov.hmrc.singlecustomeraccountstub.models.ActionDetails

import java.time.LocalDate

object ActionStubData {

  val overPayment = Seq(
    ActionDetails(
      nino = Nino(true, Some("GG012345C")),
      date = LocalDate.now.minusMonths(2).minusDays(1),
      descriptionContent = "You paid too much tax in the 2022 to 2023 tax year. HMRC owes you a £84.23 refund",
      actionDescription = "Claim your tax refund",
      url = "www.tax.service.gov.uk/check-income-tax/tax-code-change/tax-code-comparison",
      activityHeading = "Things for you to do")
  )

  val underPayment = Seq(
    ActionDetails(
      nino = Nino(true, Some("AA999999A")),
      date = LocalDate.now.minusMonths(3).minusDays(5),
      descriptionContent = "You did not pay enough tax in the 2022 to 2023 tax year. You must pay HMRC by 31 January 2023.",
      actionDescription = "Make a tax payment",
      url = "www.tax.service.gov.uk/check-income-tax/tax-code-change/tax-code-comparison",
      activityHeading = "Things for you to do")
  )

}
