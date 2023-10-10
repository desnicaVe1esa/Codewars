const notes = ["C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "A#", "B"];

function chords(root) {
    const rootIndex = notes.indexOf(root);
    if (rootIndex === -1) {
        return ["Invalid root note"];
    }

    const majorChord = [root];
    const minorChord = [root];

    majorChord.push(notes[(rootIndex + 4) % 12]);
    majorChord.push(notes[(rootIndex + 7) % 12]);

    minorChord.push(notes[(rootIndex + 3) % 12]);
    minorChord.push(notes[(rootIndex + 7) % 12]);

    return [majorChord, minorChord];
}

module.exports = chords;