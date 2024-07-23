function seats_in_theater {
    [OutputType([int])]
    Param ([int]$total_col, [int]$total_row, [int]$col, [int]$row)

    return ($total_col - $col + 1) * ($total_row - $row);
}