function duckDuckGoose(players, goose) {
    let position = goose % players.length;
    return position === 0 ? players[players.length - 1].name : players[position - 1].name;
}

module.exports = duckDuckGoose;