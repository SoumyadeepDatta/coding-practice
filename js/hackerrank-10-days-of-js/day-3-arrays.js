'use strict';

process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString = '';
let currentLine = 0;

process.stdin.on('data', inputStdin => {
    inputString += inputStdin;
});

process.stdin.on('end', _ => {
    inputString = inputString.trim().split('\n').map(string => {
        return string.trim();
    });

    main();
});

function readLine() {
    return inputString[currentLine++];
}

/**
*   Return the second largest number in the array.
*   @param {Number[]} nums - An array of numbers.
*   @return {Number} The second largest number in the array.
**/
function getSecondLargest(nums) {
    // Complete the function
    var l = 0, sl = 0;
    for (var i = 0; i < nums.length; i++) {
        if (l < nums[i]) {
            sl = l;
            l = nums[i];
        }
        else if (l > nums[i]) {
            if (sl < nums[i]) {
                sl = nums[i];
            }
        }
    }
    return sl;
}


function main() {
    const n = +(readLine());
    const nums = readLine().split(' ').map(Number);

    console.log(getSecondLargest(nums));
}