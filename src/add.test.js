const add = require('./add')

test('should sum parameter a and b', () => {
	expect(add(2, 1)).toEqual(3)
})
