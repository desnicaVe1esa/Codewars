DB[:oddcount].multi_insert([
  {n: 15}, 
  {n: 15023}
])
  
results = run_sql

describe :columns do
   it "should return 2 columns" do
    expect(results.columns.count).to eq 2
end
end

describe :column_names do
    it "should match column names" do
    expect(results.columns[0].to_s).to eq "n"
    expect(results.columns[1].to_s).to eq "res"
end
end

compare_with expected do end