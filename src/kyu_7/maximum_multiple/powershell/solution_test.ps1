Describe 'Maximum Multiple' {
  Context 'Basic tests' {
    It "MaxMultiple <d> <b> is <e>" -TestCases @(
      @{ d = 2; b = 7; e = 6 }
      @{ d = 3; b = 10; e = 9 }
      @{ d = 7; b = 17; e = 14 }
      @{ d = 10; b = 50; e = 50 }
      @{ d = 37; b = 200; e = 185 }
      @{ d = 7; b = 100; e = 98 }
    ) {
      param ($d, $b, $e)
      MaxMultiple $d $b | Should -Be $e
    }
  }
}