function partlist(arr) {
    var newArray;
    var returnArray=[];
    for( var i=1; i<arr.length; i++){
        newArray = [];
        newArray.push(arr.slice(0,i).join(" "));
        newArray.push(arr.slice(i).join(" "));
        returnArray.push(newArray);
    }

    return returnArray;
}

module.exports = partlist;