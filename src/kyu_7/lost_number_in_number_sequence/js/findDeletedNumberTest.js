import findDeletedNumber from "./findDeletedNumber";

describe("Tests", () => {
    it("test", () => {// These are some CW specific test methods available://    Test.expect(boolean, [optional] message)//    Test.assertEquals(actual, expected, [optional] message)//    Test.assertSimilar(actual, expected, [optional] message)//    Test.assertNotEquals(actual, expected, [optional] message)9
        Test.assertEquals(findDeletedNumber([1, 2, 3, 4, 5], [3, 4, 1, 5]), 2, 'Deletion')
        Test.assertEquals(findDeletedNumber([1, 2, 3, 4, 5, 6, 7, 8, 9], [1, 9, 7, 4, 6, 2, 3, 8]), 5, 'Deletion')
        Test.assertEquals(findDeletedNumber([1, 2, 3, 4, 5, 6, 7, 8, 9], [5, 7, 6, 9, 4, 8, 1, 2, 3]), 0, 'No deletion')
    });
});