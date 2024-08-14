function race($v1, $v2, $g)
{
    if($v1 -ge $v2)
    {
        return '-1 -1 -1'
    }
    return ([timespan]::FromSeconds($g/($v2-$v1)*3600)).ToString("h\ m\ s")
}