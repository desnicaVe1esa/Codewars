class Ship {
    constructor(draft, crew) {
        this.draft = draft
        this.crew = crew
    }

    getDraft() {
        return this.draft;
    }

    getCrew() {
        return this.crew;
    }

    isWorthIt() {
        return this.getDraft() - this.getCrew()  *  1.5 > 20;
    }

    toString() {
        return `Ship{draft=${this.draft}, crew=${this.crew}}`;
    }
}

module.exports = Ship;