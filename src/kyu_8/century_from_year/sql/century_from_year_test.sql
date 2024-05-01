items = DB[:years]

basic_tests = [
  [1705, 18],
  [1900, 19],
  [1601, 17],
  [2000, 20],
  [356, 4],
  [89, 1]
]

basic_tests.each do |x|
  items.insert(:yr => x[0])
end

results = run_sql.to_a

describe :basic_tests do
  basic_tests.each_with_index do |x, i|
    it "Test for year #{x[0]}" do
      expect(results[i][:century]).to eq x[1]
end
end
end