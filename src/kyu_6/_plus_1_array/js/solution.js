function upArray(arr) {
    if (arr.length === 0 || arr.some(e => e < 0 || e > 9)) return null

    let i = arr.length - 1

    while (i >= 0 && arr[i] === 9)
        arr[i--] = 0

    if (i < 0)
        arr.unshift(1)
    else
        arr[i]++

    return arr
}