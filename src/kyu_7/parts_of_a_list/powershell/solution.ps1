function part-list
{
    [OutputType([string])]
    Param ([string[]]$arr)
    (0..($arr.Length - 2) | % { "(" + [string]$arr[0..$_] + ", " + [string]$arr[($_ + 1)..($arr.Length -1)] + ")" }) -join ""
}