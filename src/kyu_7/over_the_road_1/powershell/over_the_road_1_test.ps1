Describe 'Basic Tests' {
    It 'Basic Test Cases' {
        overTheRoad 1 3 | Should be 6
        overTheRoad 3 3 | Should be 4
        overTheRoad 2 3 | Should be 5
        overTheRoad 3 5 | Should be 8
        overTheRoad 7 11 | Should be 16
    }
}