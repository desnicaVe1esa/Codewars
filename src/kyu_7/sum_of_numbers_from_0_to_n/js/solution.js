var SequenceSum = (function() {
    function SequenceSum() {}

    SequenceSum.showSequence = function(count) {

        if (count === 0) { return count + "=" + 0; }
        if (count < 0) { return count + "<" + 0; }
        let expression = "";
        let result = 0;
        for (let i = 0; i <= count; i++) {
            expression += i + "+";
            result += i;
        }
        return expression.substring(0, expression.length - 1) + " = " + result;
    };

    return SequenceSum;

})();