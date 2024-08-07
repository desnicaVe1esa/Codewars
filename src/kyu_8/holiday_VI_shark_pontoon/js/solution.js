function shark(pontoonDistance, sharkDistance, youSpeed, sharkSpeed, dolphin) {
    const isDolphin = dolphin === true ? sharkSpeed / 2 : sharkSpeed;
    if ((sharkDistance / isDolphin) > (pontoonDistance / youSpeed)) {
        return "Alive!";
    } else {
        return "Shark Bait!";
    }
}

module.exports = shark;