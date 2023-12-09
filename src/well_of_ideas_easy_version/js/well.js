function well(x){
    return x.filter(idea => idea === 'good').length === 0 ? 'Fail!' : x.filter(idea => idea === 'good').length <= 2 ? 'Publish!' : 'I smell a series!';
}

module.exports = well;