function evaporator([double]$content, [double]$evapperday, [double]$threshold) {
    $total = 100
    $day = 0
    while ($total -gt $threshold){
        $total = $total * (100 - $evapperday)/100
        $day++
    }
    $day
}