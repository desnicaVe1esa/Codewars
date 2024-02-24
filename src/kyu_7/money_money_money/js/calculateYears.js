function calculateYears(principal, interest, tax, desired){
	let years = 0;
    while (principal < desired) {
        let interestEarned = principal * interest;
        let taxPaid = interestEarned * tax;
        principal += interestEarned - taxPaid;
        years++;
    }
    return years;
}
module.exports = calculateYears;