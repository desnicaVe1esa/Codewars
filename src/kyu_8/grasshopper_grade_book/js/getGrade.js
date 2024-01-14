function getGrade (s1, s2, s3) {
    let avg = (s1 + s2 + s3) / 3;
    let result = ' ';
    if (90 <= avg && avg <= 100) { result = 'A'; }
    if (80 <= avg && avg < 90) { result = 'B'; }
    if (70 <= avg && avg < 80) { result = 'C'; }
    if (60 <= avg && avg < 70) { result = 'D'; }
    if (0 <= avg && avg < 60) { result = 'F'; }
    return result;
}

module.exports = getGrade;