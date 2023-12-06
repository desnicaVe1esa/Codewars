function queueTime(customers, n) {
    let arr = new Array(n).fill(0);
    for (let customer of customers) {
        let minArr = arr.indexOf(Math.min(...arr));
        arr[minArr] += customer;
    }
    return Math.max(...arr);
}
module.exports = queueTime;