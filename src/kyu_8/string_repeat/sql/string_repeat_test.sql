DB[:repeatstr].multi_insert([
  {n: 3, s: "*"}, {n: 5, s: "#"}, {n: 2, s: "ha "}
])

results = run_sql

describe :columns do
   it "should return 3 columns" do
    expect(results.columns.count).to eq 3
end
end

describe :column_names do
    it "should match column names" do
    expect(results.columns[0].to_s).to eq "s"
    expect(results.columns[1].to_s).to eq "n"
    expect(results.columns[2].to_s).to eq "res"
end
end

compare_with expected do end