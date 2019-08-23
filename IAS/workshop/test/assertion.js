function expect(actual ){
    return {
        toBe(expected) {
            if (expected !== actual) {
                throw new Error(`${actual} es diferente de ${expected}`)
            }
        }
    };
}

function test(name, callback) {
    try {
        callback();
        console.log(`Success: ${name}`);
        
    } catch (e) {
        console.log(`Failed: ${name} ${e}`);
    }
}

module.exports = {
    expect, test
};