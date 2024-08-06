function testing($arr, $expect)
{
    $ans = part-list $arr
    $ans | Should -Be $expect
}

function fixed()
{
    $a="I", "wish", "I", "hadn't", "come"
    $c="(I, wish I hadn't come)(I wish, I hadn't come)(I wish I, hadn't come)(I wish I hadn't, come)"
    testing $a $c

    $a = "cdIw", "tzIy", "xDu", "rThG"
    $c = "(cdIw, tzIy xDu rThG)(cdIw tzIy, xDu rThG)(cdIw tzIy xDu, rThG)"
    testing $a $c

}

Describe "part-list" {
    Context "Fixed Tests" {
        It "Should Pass Fixed Tests" {
            fixed
        }
    }
}
