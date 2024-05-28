function whatday(num) {
    return num === 1 ? "Sunday" :
           num === 2 ? "Monday" :
           num === 3 ? "Tuesday" :
           num === 4 ? "Wednesday" :
           num === 5 ? "Thursday" :
           num === 6 ? "Friday" :
           num === 7 ? "Saturday" : "Wrong, please enter a number between 1 and 7";
}
module.exports = whatday;