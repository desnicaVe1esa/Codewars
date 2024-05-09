import winnerOfTrick from "./winnerOfTrick";

describe("Simple tests", () => {
    let players = "Algichh,Bdobd,Chharmolg,Dbang,Erming".split(",");
    const simpleTricks = [
        ["AH2H3H", "Algichh wins"], ["2HKH3H", "Bdobd wins"], ["2H3S4H", "Chharmolg wins"],
        ["ACKC2C3C", "Algichh wins"], ["2CKCQC3C", "Bdobd wins"], ["2CJD3C4S", "Chharmolg wins"], ["2C3CJD4C", "Dbang wins"]
    ]

    simpleTricks.forEach(([cc, exp]) => Test.assertEquals(winnerOfTrick(cc.match(/../g), players), exp))

});
