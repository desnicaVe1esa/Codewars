Describe 'Sample Tests' {
	It 'Should pass' {
		$expected = Get-TwoSum -numbers @(1, 2, 3) -target 4
		$results = @(0, 2)
		[bool]($null -eq (Compare-Object $expected $results)) | Should be $true;
	}

	It 'Should pass' {
		$expected = Get-TwoSum -numbers @(1234, 5678, 9012) -target 14690
		$results = @(1, 2)
		[bool]($null -eq (Compare-Object $expected $results)) | Should be $true;
	}

	It 'Should pass' {
		$expected = Get-TwoSum -numbers @(2, 2, 3) -target 4
		$results = @(0, 1)
		[bool]($null -eq (Compare-Object $expected $results)) | Should be $true;
	}
}