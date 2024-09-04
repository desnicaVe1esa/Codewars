function remov-nb($n)
{
    $Retour = ""
    $Total = ($n * ($n +1)) / 2
    For($a = 1; $a -le $n; $a++)
    {
        $b = ($Total - $a) / ($a +1 )
        If((($b % 1) -eq 0) -and ($b -le $n)){
            $Retour += "[$a, $b]"
        }
    }
    $Retour = "[" + $Retour + "]"
    Return $Retour
}