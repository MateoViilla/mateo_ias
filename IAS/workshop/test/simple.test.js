const { add, substract, find  } = require("./funciones");
// const { test, expect  } = require("./assertion");

test('Debe sumar', () => {
    const result = add(3,4);
    const expected = 7;
    expect(result).toBe(expected);
});

test('Debe restar', () => {
    const result = substract(7,6);
    const expected = 1;
    expect(result).toBe(expected);
});

test('Debe encontrar', () => {
    const arr = [2,3,43,5,5];
    const val = 3;
    const expected = true;
    const result = find(arr,val);
    expect(result).toBe(expected);
});

