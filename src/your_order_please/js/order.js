function order(words){
    if (words === "") {
        return "";
    }

    const str = words.split(" ");

    str.sort((a, b) => {
        const numA = parseInt(a.match(/\d+/)[0]);
        const numB = parseInt(b.match(/\d+/)[0]);
        return numA - numB;
    });

    return str.join(" ");
}

module.exports = order;