function isMerge(s, part1, part2) {
    if (s === "") {
        return part1 === "" && part2 === "";
    } else {
        let isMerge1 = false, isMerge2 = false;
        if (part1.length > 0 && s.charAt(0) === part1.charAt(0))
            isMerge1 = isMerge(s.substring(1), part1.substring(1), part2);
        if (part2.length > 0 && s.charAt(0) === part2.charAt(0))
            isMerge2 = isMerge(s.substring(1), part1, part2.substring(1));
        return isMerge1 || isMerge2;
    }
}
module.exports = isMerge;