/**
 * @param {Function[]} functions
 * @return {Function}
 */
var compose = function(functions) {
    return function(initVal) {
        let currentVal = initVal;
        for (let i = functions.length - 1; i >= 0; i--) {
            currentVal = functions[i](currentVal);
        }
        return currentVal;
    };
};