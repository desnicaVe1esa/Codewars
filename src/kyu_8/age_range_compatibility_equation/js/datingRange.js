function datingRange(age){
    return age <= 14 ? `${Math.floor(age - 0.10 * age)}-${Math.floor(age + 0.10 * age)}`
        : `${Math.floor(age/2 + 7)}-${Math.floor((age-7) * 2)}`;
}

module.exports = datingRange;