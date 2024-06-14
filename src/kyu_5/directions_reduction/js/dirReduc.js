function dirReduc(arr) {
    let opposite = {
        'NORTH': 'SOUTH', 'EAST': 'WEST', 'SOUTH': 'NORTH', 'WEST': 'EAST'};
    return arr.reduce(function(dirs, dir){
        if (dirs[dirs.length - 1] === opposite[dir])
            dirs.pop();
        else
            dirs.push(dir);
        return dirs;
    }, []);
}

module.exports = dirReduc;