class Dictionary {
    constructor() {
        this.entries = {};
    }

    newEntry(word, definition) {
        this.entries[word] = definition;
    }

    look(word) {
        if (word in this.entries) {
            return this.entries[word];
        } else {
            return "Can't find entry for " + word;
        }
    }
}

module.exports = Dictionary;


