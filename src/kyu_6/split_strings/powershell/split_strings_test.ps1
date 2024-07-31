Describe "Basic Tests" {
  It "Should pass"{
    $expected = @("ab","c_")
    $actual = Split-String("abc")
    Compare-Object $expected $actual| Should -BeNullOrEmpty
  }

  It "Should pass"{
    $expected = @("ab", "cd", "ef")
    $actual = Split-String("abcdef")
    Compare-Object $expected $actual | Should -BeNullOrEmpty
  }
}
