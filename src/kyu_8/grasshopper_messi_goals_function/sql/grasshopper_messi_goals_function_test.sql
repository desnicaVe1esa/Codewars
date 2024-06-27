DB[:goals].multi_insert [
  {la_liga_goals: 0, copa_del_rey_goals: 0, champions_league_goals: 0},
  {la_liga_goals: 43, copa_del_rey_goals: 10, champions_league_goals: 5}
]

compare_with expected do end