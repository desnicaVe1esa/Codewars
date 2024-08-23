function stringClean(s){
    return s.replaceAll(/[0-9]/g, "");
}
module.exports = stringClean;