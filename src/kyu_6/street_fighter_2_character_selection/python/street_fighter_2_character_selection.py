def street_fighter_selection(fighters, initial_position, moves):
    cur_pos = [initial_position[0], initial_position[1]]
    selected_fighters = []

    for move in moves:
        if move == "up":
            cur_pos[0] = 0
        elif move == "down":
            cur_pos[0] = 1
        elif move == "right":
            cur_pos[1] = (cur_pos[1] + 1) % 6
        elif move == "left":
            cur_pos[1] = (cur_pos[1] - 1) % 6
        selected_fighters.append(fighters[cur_pos[0]][cur_pos[1]])

    return selected_fighters