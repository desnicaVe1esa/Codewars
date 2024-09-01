import Ghost from "./solution";

describe("Ghost", () => {
    it("should be one of the specified colors", ()=> {
        let colors = ['white', 'yellow', 'purple', 'red'];
        Test.expect(colors.includes(new Ghost().color));
    });
});