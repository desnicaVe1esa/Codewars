function testing($v1, $v2, $g, $expect)
{
    $ans = race $v1 $v2 $g
    $ans | Should -Be $expect
}

function fixed()
{
    testing 720 850 70 "0 32 18"
    testing 820 850 550 "18 20 0"
    testing 820 81 550 "-1 -1 -1"

}

Describe "race" {
    Context "Fixed Tests" {
        It "Should Pass Fixed Tests" {
            fixed
        }
    }
}