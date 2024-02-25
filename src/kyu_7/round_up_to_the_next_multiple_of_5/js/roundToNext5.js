function roundToNext5(n){
    while (n % 5 !==0) {
        n++;
    }
	return n;
}
module.exports = roundToNext5;