DB[:max_multiple].multi_insert [
  {divisor: 2, bound: 7}, # => 6
  {divisor: 3, bound: 10}, # => 9
  {divisor: 7, bound: 17}, # => 14
  {divisor: 10, bound: 50}, # => 50
  {divisor: 37, bound: 200}, # => 185
  {divisor: 7, bound: 100} # => 98
]

compare_with expected