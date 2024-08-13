function maxTriSum ([int[]]$numbers)
{
    ($numbers | Sort-Object -Unique)[-3..-1] | %{$s += $_}
    return $s;
}