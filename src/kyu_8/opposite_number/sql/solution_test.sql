DB[:opposite].multi_insert [
  {number: 0},
  {number: -1},
  {number: 1}
]

compare_with expected do end