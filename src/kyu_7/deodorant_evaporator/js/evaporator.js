function evaporator(content, evap_per_day, threshold){
    let day = 0;
    let total = content;
    while (content >= total * (1 / 100) * threshold) {
        content -= content * (1 / 100) * evap_per_day;
        day++;
    }
    return day;
}
module.exports = evaporator;