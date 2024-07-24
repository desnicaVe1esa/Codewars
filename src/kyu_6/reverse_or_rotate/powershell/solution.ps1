function revrot($s, $sz)
{
	if ($sz -le 0 -or $s -eq '')
	{
		""
	}
	else
	{
		$output = @()
		$chunks = $s -split "(\w{$sz})" | Where-Object { $_ }
		foreach ($chunk in $chunks)
		{
			if ($chunk.length -eq $sz)
			{
				$sum = 0
				$chunkArr = $chunk.ToCharArray()
				foreach ($c in $chunkArr)
				{
					$sum += [math]::pow([int]$c.ToString(), 3)
				}
				if (($sum % 2) -eq 0)
				{
					[array]::Reverse($chunkArr)
					$output += $chunkArr -join ''
				}
				else
				{
					$first, $rest = $chunkArr
					$output += ($rest -join '') + $first
				}
			}
		}
		$output -join ''
	}
}