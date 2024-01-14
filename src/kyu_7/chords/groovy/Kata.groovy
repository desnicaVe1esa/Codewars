package kyu_7.chords.groovy

class Kata {
    public static final notes = ["C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "A#", "B"]
    static chords(root){
        def rootIndex = notes.indexOf(root)
        if (rootIndex == -1) {
            return ["Invalid root note"]
        }

        def majorChord = [root]
        def minorChord = [root]

        majorChord << notes[(rootIndex + 4) % 12]
        majorChord << notes[(rootIndex + 7) % 12]

        minorChord << notes[(rootIndex + 3) % 12]
        minorChord << notes[(rootIndex + 7) % 12]

        return [majorChord, minorChord]
    }
}
