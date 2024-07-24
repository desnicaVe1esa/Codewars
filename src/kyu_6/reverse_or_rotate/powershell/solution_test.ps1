function testing($s, $sz, $expect)
{
    $ans = revrot $s $sz
    $ans | Should -Be $expect
}

function fixed()
{
    testing "1234" 0 ""
    $s = "733049910872815764"
    testing $s 5 "330479108928157"
    $s = "73304991087281576455176044327690580265896"
    testing $s 8 "1994033775182780067155464327690480265895"

}

Describe "revrot" {
  Context "Fixed Tests" {
    It "Should Pass Fixed Tests" {
      fixed
    }
  }
}