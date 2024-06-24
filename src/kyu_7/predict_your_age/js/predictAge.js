function predictAge(age1,age2,age3,age4,age5,age6,age7,age8){
    let total = age1 * age1 + age2 * age2 + age3 * age3 + age4 * age4 + age5 * age5 + age6 * age6 + age7 * age7 + age8 * age8;
    return Math.sqrt(total) / 2 | 0;
}
module.exports = predictAge;