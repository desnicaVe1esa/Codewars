def duck_duck_goose(players, goose):
        position = goose % len(players)
        return players[position - 1].name