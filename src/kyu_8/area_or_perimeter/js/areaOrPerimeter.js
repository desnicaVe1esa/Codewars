const areaOrPerimeter = function(l , w) {
    return l === w ? l * w : l * l * w * w;
};

module.exports = areaOrPerimeter;