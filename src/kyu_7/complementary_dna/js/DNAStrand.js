function DNAStrand(dna){
    let result = '';
    for (let i = 0; i < dna.length; i++) {
        switch (dna[i]) {
            case 'A':
                result += 'T';
                break;
            case 'T':
                result += 'A';
                break;
            case 'G':
                result += 'C';
                break;
            case 'C':
                result += 'G';
                break;
        }
    }
    return result;
}

module.exports = DNAStrand;