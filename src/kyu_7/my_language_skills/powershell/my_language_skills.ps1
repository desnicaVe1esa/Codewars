function My-Languages ([hashtable] $results) {
    return ($results.GetEnumerator() | Where-Object Value -ge 60 | Sort-Object -Property Value -Descending | Select-Object -ExpandProperty Name)
}