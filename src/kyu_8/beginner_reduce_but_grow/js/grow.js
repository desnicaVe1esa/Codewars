function grow(x){
    return x.reduce((acc, rec) => acc * rec);
}

module.exports = grow;