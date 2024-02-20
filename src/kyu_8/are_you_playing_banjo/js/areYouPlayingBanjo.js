function areYouPlayingBanjo(name){
    return name.toLowerCase().charAt(0) === 'r' ?
        name.substring(0) + " plays banjo" :
        name.substring(0) + " does not play banjo";
}
module.exports = areYouPlayingBanjo;