function testing([double]$content, [double]$evapperday, [double]$threshold, [int]$expect)
{
    $ans = evaporator $content $evapperday $threshold
    $ans | Should -Be $expect
}

function fixed()
{
    testing 10 10 10 22
    testing 10 10 5 29

}

Describe "evaporator" {
  Context "Fixed Tests" {
    It "Should Pass Fixed Tests" {
      fixed
    }
  }
}