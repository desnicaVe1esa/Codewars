function Split-String($string)
{
    if (($string.Length % 2) -eq 1)
    {
        $string = $string.Insert($string.Length, "_")
    }

    $result = @()

    for ($i = 0; $i -lt $string.Length;)
    {
        $result += $string.Substring($i,2)
        $i = $i + 2
    }

    return $result
}