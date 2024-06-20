function DNAtoRNA(dna) {
    return dna.replaceAll("T", "U");
}
module.exports = DNAtoRNA;