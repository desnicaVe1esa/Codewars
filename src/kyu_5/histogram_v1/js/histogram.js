let histogram = function (results) {
    let row = Math.max(...results) + 1;
     let line = '';
     let output = '';

    while (row) {
        line = '';
        for (let i = 0; i < 11; i++) {
            if (i % 2)
                line += ' ';
            else {
                if (results[i / 2] + 1 === row)
                    line += results[i / 2] || ' ';
                else if (results[i / 2] >= row)
                    line += '#';
                else
                    line += ' ';
            }
        }
        line = line.replace(/\s+$/, '')
        output += line ? line + "\n" : '';
        row--;
    }
    return output + "-----------\n1 2 3 4 5 6\n";
}

module.exports = histogram;