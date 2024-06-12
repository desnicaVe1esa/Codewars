DB[:box].multi_insert([
  {width: 4, height: 2, depth: 6},
  {width: 1, height: 1, depth: 1},
  {width: 1, height: 2, depth: 1},
  {width: 1, height: 2, depth: 2},
  {width: 10, height: 10, depth: 10},
  {width: 4, height: 6, depth: 2},
  {width: 6, height: 2, depth: 4},
  {width: 6, height: 4, depth: 2},
  {width: 2, height: 4, depth: 6},
  {width: 2, height: 6, depth: 4},
])

results = run_sql

describe :columns do
  it "should return 5 columns" do
    expect(results.columns.count).to eq 5
end
end

describe :column_names do
    it "should match column names" do
    expect(results.columns[0].to_s).to eq "width"
    expect(results.columns[1].to_s).to eq "height"
    expect(results.columns[2].to_s).to eq "depth"
    expect(results.columns[3].to_s).to eq "area"
    expect(results.columns[4].to_s).to eq "volume"
end
end

compare_with expected do end