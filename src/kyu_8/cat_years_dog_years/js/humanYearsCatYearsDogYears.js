var humanYearsCatYearsDogYears = function(humanYears) {
    let catYear = humanYears === 2 ? 15 + 9 : humanYears === 3 ? 15 + 9 + 4 : humanYears > 3 ? 15 + 9 + (humanYears - 2) * 4 : 15;
    let dogYear = humanYears === 2 ? 15 + 9 : humanYears === 3 ? 15 + 9 + 5 : humanYears > 3 ? 15 + 9 + (humanYears - 2) * 5 : 15;
    return [humanYears, catYear, dogYear];
}

module.exports = humanYearsCatYearsDogYears;