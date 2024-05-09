function winnerOfTrick(cards, players) {
    if (cards == null || players == null || cards.length === 0 || players.length === 0) {
        return "";
    }
    const winnerIndex = getWinnerIndex(cards);

    return players[winnerIndex] + " wins";
}

function getWinnerIndex(cards) {
    let winnerCard = 0;
    let winnerIndex = 0;
    const trump = cards[0].substr(1);
    const cardGrades = new Map([
        ["2", 2],
        ["3", 3],
        ["4", 4],
        ["5", 5],
        ["6", 6],
        ["7", 7],
        ["8", 8],
        ["9", 9],
        ["T", 10],
        ["J", 11],
        ["Q", 12],
        ["K", 13],
        ["A", 14]
    ]);

    for (let i = 0; i < cards.length; i++) {
        if (cards[i].endsWith(trump)) {
            const currentCardGrade = cardGrades.get(cards[i].substr(0, 1));
            winnerCard = Math.max(winnerCard, currentCardGrade);
            if (winnerCard === currentCardGrade) {
                winnerIndex = i;
            }
        }
    }

    return winnerIndex;
}

module.exports = winnerOfTrick;