Describe 'My Languages' {
    It 'Should pass fixed tests' {
        My-Languages @{"Java" = 10; "Ruby" = 80; "Python" = 65} | Should be @("Ruby", "Python")
        My-Languages @{"Hindi"= 60; "Greek"= 71; "Dutch"= 93}   | Should be @("Dutch", "Greek", "Hindi")
        My-Languages @{"C++"= 50; "ASM"= 10; "Haskell"= 20}     | Should be @()
    }
}