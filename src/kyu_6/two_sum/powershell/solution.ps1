function Get-TwoSum ([System.Array]$numbers, [int]$target)
{
	for ($i = 0; $i -lt $numbers.Count; $i++)
	{
		for ($n = $i + 1; $n -lt $numbers.Count; $n++)
		{
			if (($numbers[$i] + $numbers[$n]) -eq $target)
			{
				Write-Output @($i, $n);
			}
		}
	}
}