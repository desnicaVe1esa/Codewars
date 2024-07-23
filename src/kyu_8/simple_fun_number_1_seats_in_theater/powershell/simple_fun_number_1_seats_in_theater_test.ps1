Describe 'My Solution' {
  It 'Sample test cases' {
    seats_in_theater 16 11 5 3 | Should -Be 96
    seats_in_theater 1 1 1 1 | Should -Be 0
    seats_in_theater 13 6 8 3 | Should -Be 18
    seats_in_theater 60 100 60 1 | Should -Be 99
    seats_in_theater 1000 1000 1000 1000 | Should -Be 0
  }
}