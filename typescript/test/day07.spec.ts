import {allTotals, doit1, isAbleToMakeTotal, parseLine} from "../src/day07";

const testInput = [
    '190: 10 19',
    '3267: 81 40 27',
    '83: 17 5',
    '156: 15 6',
    '7290: 6 8 6 15',
    '161011: 16 10 13',
    '192: 17 8 14',
    '21037: 9 7 18 13',
    '292: 11 6 16 20'
]

describe('Day 07', () => {

    it('should parse a line', () => {
        expect(parseLine('3267: 81 40 27')).toEqual({
            total: 3267,
            numbers: [81, 40, 27]
        })
    });

    it('should get all totals for numbers', () => {
        const expected = [
            9,
            10,
            20,
            24
        ];
        expect(allTotals([2, 3, 4])).toEqual(expected)
    });

    it('should find if operators meet total', () => {
        expect(isAbleToMakeTotal(testInput[0])).toBe(true)
        expect(isAbleToMakeTotal(testInput[1])).toBe(true)
        expect(isAbleToMakeTotal(testInput[2])).toBe(false)
        expect(isAbleToMakeTotal(testInput[3])).toBe(false)
        expect(isAbleToMakeTotal(testInput[4])).toBe(false)
        expect(isAbleToMakeTotal(testInput[5])).toBe(false)
        expect(isAbleToMakeTotal(testInput[6])).toBe(false)
        expect(isAbleToMakeTotal(testInput[7])).toBe(false)
        expect(isAbleToMakeTotal(testInput[8])).toBe(true)
    });


    xit('should run pass the example', () => {
        expect(doit1(testInput)).toEqual(3749);
    });

})
