function alphabetWar(fight) {
    let result = 0;
    let chars = fight.split('');
    for (let c = 0; c < chars.length; c++) {
        switch (chars[c]) {
            case 'w':
                result += 4;
                break;
            case 'p':
                result += 3;
                break;
            case 'b':
                result += 2;
                break;
            case 's':
                result += 1;
                break;
            case 'm':
                result -= 4;
                break;
            case 'q':
                result -= 3;
                break;
            case 'd':
                result -= 2;
                break;
            case 'z':
                result -= 1;
                break;
        }
    }
    if (result === 0) {
        return "Let's fight again!";
    } else {
        return result > 0 ? "Left side wins!" : "Right side wins!";
    }
}

module.exports = alphabetWar;