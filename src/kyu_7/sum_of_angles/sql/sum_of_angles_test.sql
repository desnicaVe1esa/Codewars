DB[:angle].multi_insert [
  {n: 3},
  {n: 4}
]

compare_with expected do end