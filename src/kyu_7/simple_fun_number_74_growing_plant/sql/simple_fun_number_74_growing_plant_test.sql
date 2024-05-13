DB[:growing_plant].multi_insert([
  {up_speed: 100, down_speed: 10, desired_height: 910},
  {up_speed: 10, down_speed: 9, desired_height: 4},
  {up_speed: 5, down_speed: 2, desired_height: 5},
  {up_speed: 5, down_speed: 2, desired_height: 6}
])

compare_with expected do end