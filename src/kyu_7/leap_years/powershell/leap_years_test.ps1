BeforeAll {
  . $PSCommandPath.Replace('.Tests.ps1', '.ps1')
}

Describe "Example Tests" {

  It "Year 2000 is a leap year" {
    Is-LeapYear 2000 | Should -Be true
  }
  It "Year 2020 is a leap year" {
    Is-LeapYear 2020 | Should -Be true
  }
  It "Year 2015 is not a leap year" {
    Is-LeapYear 2015 | Should -Be false
  }
  It "Year 2100 is not a leap year" {
    Is-LeapYear 2100 | Should -Be false
  }
}