function dotest($n, $expect)
{
    $ans = remov-nb $n
    $ans | Should -Be $expect
}

function fixed()
{
    dotest 26 "[[15, 21][21, 15]]"
    dotest 100 "[]"
    dotest 37 "[[21, 31][31, 21]]"

}

Describe "remov-nb" {
    Context "Fixed Tests" {
        It "Should Pass Fixed Tests" {
            fixed
        }
    }
}