function whatCentury(year){
    if (year % 100 === 0) {
        year = Math.trunc(year / 100);
    } else {
        year = Math.trunc((year / 100) + 1);
    }
    let postfix = "th";
    if (year % 10 === 1) {
        postfix = "st";
    }
    if (year % 10 === 2) {
        postfix = "nd";
    }
    if (year % 10 === 3) {
        postfix = "rd";
    }
    if (year > 10 && year <= 13) {
        postfix = "th";
    }

    return year + postfix;
}
module.exports = whatCentury;