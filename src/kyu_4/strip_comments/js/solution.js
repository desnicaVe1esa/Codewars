function solution(text, markers) {
    let lines = text.split('\n');
    for (let i = 0; i < lines.length; i++) {
        let line = lines[i];
        for (let j = 0; j < markers.length; j++) {
            let marker = markers[j];
            let index = line.indexOf(marker);
            if (index !== -1) {
                line = line.substring(0, index);
            }
        }
        line = line.trimRight();
        lines[i] = line;
    }
    return lines.join('\n');
}

module.exports = solution;
