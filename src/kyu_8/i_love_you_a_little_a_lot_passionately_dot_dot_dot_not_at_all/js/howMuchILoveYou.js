function howMuchILoveYou(nbPetals) {
    let data = ["I love you", "a little", "a lot", "passionately", "madly", "not at all"];
    let index = (nbPetals - 1) % data.length;
    return data[index];
}

module.exports = howMuchILoveYou;