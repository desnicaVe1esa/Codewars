function streetFighterSelection(fighters, position, moves){
    let solution = [];
    let row = position[0]; let col = position[1];
    for(let i = 0; i < moves.length; i++){
        switch(moves[i]){
            case "up" :
                row = 0;
                break;
            case "down" :
                row = 1;
                break;
            case "left" :
                col = col === 0 ? 5 : col - 1;
                break;
            case "right" :
                col = col === 5 ? 0 : col + 1;
                break;
        }
        solution[i] = fighters[row][col];
    }
    return solution;
}

module.exports = streetFighterSelection;